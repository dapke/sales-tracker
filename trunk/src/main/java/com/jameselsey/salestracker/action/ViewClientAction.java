package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Client;
import com.jameselsey.salestracker.domain.Task;
import com.jameselsey.salestracker.service.ClientService;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SimpleMessage;
import net.sourceforge.stripes.integration.spring.SpringBean;

/**
 *
 * @author James
 */
public class ViewClientAction extends BaseAction
{

    @SpringBean
    ClientService clientService;
    private Client client;
    private Client clientBeforeChanges;
    private Task task;

    public Client getClient()
    {
        return client;
    }

    @DefaultHandler
    public Resolution quickView()
    {
        client = clientService.getClientById(client.getId());
        return new ForwardResolution("/jsp/viewClientQuickView.jsp");
    }

    public Resolution save()
    {
        clientBeforeChanges = clientService.getClientById(client.getId());
        clientService.persistClient(client);
        getContext().getMessages().add(new SimpleMessage("{0} updated", client.getName()));
        return new RedirectResolution(ViewClientAction.class).flash(this);
    }

    public Resolution viewClientInfo()
    {
        client = clientService.getClientById(client.getId());
        return new ForwardResolution("/jsp/viewClientClientInfo.jsp");
    }

    public Resolution viewClientMarketResearch()
    {
        if (client.getSector().equals("Education"))
        {
            return new ForwardResolution("/jsp/marketResearchEducation.jsp");
        } else if (client.getSector().equals("Local Government"))
        {
            return new ForwardResolution("/jsp/marketResearchLocalGovernment.jsp");
        } else if (client.getSector().equals("Housing Association"))
        {
            return new ForwardResolution("/jsp/marketResearchHousing.jsp");
        }
        return new ForwardResolution("/jsp/viewClientMarketResearch.jsp");
    }

    public Resolution raiseTask()
    {
        return new ForwardResolution("/jsp/viewClientTasks.jsp");
    }
    public Resolution saveTask()
    {
        System.out.println(client.getId());
        client.getTasks().add(task);
        clientService.persistClient(client);
        return new ForwardResolution("/jsp/viewClientClientInfo.jsp");
    }

    public Resolution viewClientProjects()
    {
        return new ForwardResolution("/jsp/viewClientProjects.jsp");
    }

    public ClientService getClientService()
    {
        return clientService;
    }

    public void setClientService(ClientService clientService)
    {
        this.clientService = clientService;
    }

    public Client getClientBeforeChanges()
    {
        return clientBeforeChanges;
    }

    public void setClientBeforeChanges(Client clientBeforeChanges)
    {
        this.clientBeforeChanges = clientBeforeChanges;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    public Task getTask()
    {
        return task;
    }

    public void setTask(Task task)
    {
        this.task = task;
    }


}
