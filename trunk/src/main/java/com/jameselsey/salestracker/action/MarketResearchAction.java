package com.jameselsey.salestracker.action;

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

    @DefaultHandler
    public Resolution defaultView()
    {
        return new ForwardResolution(VIEW);
    }
}
