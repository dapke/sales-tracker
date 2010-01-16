package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Client;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author James
 */
public class MarketResearchAction extends BaseAction
{

    private static final String VIEW = "/jsp/marketResearch.jsp";

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
    public Resolution randomDate()
    {
        return new ForwardResolution(VIEW);
    }

    public Resolution viewClientMarketResearch()
    {
        return new ForwardResolution("/jsp/viewClientMarketResearch.jsp");
    }
    
}
