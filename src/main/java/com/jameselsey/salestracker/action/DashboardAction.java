package com.jameselsey.salestracker.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author James
 */
public class DashboardAction extends BaseAction
{

   

    @DefaultHandler
    public Resolution show()
    {
        return new ForwardResolution(VIEW);

    }
    private static final String VIEW = "/jsp/dashboard.jsp";
}
