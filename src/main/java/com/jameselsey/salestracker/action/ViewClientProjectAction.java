package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Client;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author James
 */
public class ViewClientProjectAction extends BaseAction
{

    private static final String VIEW = "/jsp/viewClientProjects.jsp";
    private Client client;

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    @DefaultHandler
    public Resolution viewClientProjects()
    {
        return new ForwardResolution(VIEW);
    }
}
