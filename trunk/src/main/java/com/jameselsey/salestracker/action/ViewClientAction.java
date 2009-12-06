package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Client;
import com.jameselsey.salestracker.service.ClientService;
import java.util.List;
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
    ClientService clientService;// = new ClientService();
    private Integer clientId;
    private Client client;
    private Client clientA;


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

    

    

    public Client getClientA()
    {
//        Client c = clientService.getClientById(clientId);
        return clientA;
    }

    public void setClientA(Client clientA)
    {
        this.clientA = clientA;
    }



    public Client getClient()
    {
        return client;
    }

    @DefaultHandler
    public Resolution quickView()
    {
        clientA = clientService.getClientById(clientId);
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
