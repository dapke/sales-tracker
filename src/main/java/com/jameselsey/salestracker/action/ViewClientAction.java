package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Client;
import com.jameselsey.salestracker.service.ClientService;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.integration.spring.SpringBean;

/**
 *
 * @author James
 */
public class ViewClientAction extends BaseAction
{

    @SpringBean
    ClientService clientService;
    private Integer clientId;
    private Client client;
    private Client clientBeforeChanges;

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

    
    public Integer getClientId()
    {
        return clientId;
    }

    public void setClientId(Integer clientId)
    {
        this.clientId = clientId;
    }



    public Client getClient()
    {
        return client;
    }

    @DefaultHandler
    public Resolution quickView()
    {
        clientBeforeChanges = clientService.getClientById(clientId);
        client = clientService.getClientById(clientId);

        return new ForwardResolution("/jsp/viewClientQuickView.jsp");
    }

    public Resolution save()
    {
        clientService.persistClient(client);
        return new ForwardResolution("/jsp/reports.jsp");
    }

    public Resolution viewClientInfo()
    {
        client = clientService.getClientById(clientId);
        return new ForwardResolution("/jsp/viewClientClientInfo.jsp");
    }

    public Resolution viewClientContacts()
    {
        return new ForwardResolution("/jsp/viewClientContacts.jsp");
    }

    public Resolution viewClientProjects()
    {
        return new ForwardResolution("/jsp/viewClientProjects.jsp");
    }

    public Resolution viewClientMarketResearch()
    {
        return new ForwardResolution("/jsp/viewClientMarketResearch.jsp");
    }

    public ClientService getClientService()
    {
        return clientService;
    }

    public void setClientService(ClientService clientService)
    {
        this.clientService = clientService;
    }
}
