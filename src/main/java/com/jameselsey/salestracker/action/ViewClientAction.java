package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Client;
import com.jameselsey.salestracker.service.ClientService;
import java.util.List;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author James
 */
public class ViewClientAction extends BaseAction
{

    ClientService clientService = new ClientService();
    private Integer clientId;

    public void setClientId(Integer clientId)
    {
        this.clientId = clientId;
    }

    public Client getClient()
    {
        Client c = clientService.getClientById(clientId);
        return c;
    }

    @DefaultHandler
    public Resolution quickView()
    {
        return new ForwardResolution("/jsp/viewClientQuickView.jsp");
    }

    public Resolution viewClientInfo()
    {
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
}
