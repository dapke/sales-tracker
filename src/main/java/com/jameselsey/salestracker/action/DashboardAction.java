package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Task;
import com.jameselsey.salestracker.service.ClientService;
import java.util.ArrayList;
import java.util.List;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.integration.spring.SpringBean;

/**
 *
 * @author James
 */
public class DashboardAction extends BaseAction
{

    @SpringBean
    ClientService clientService;

    public List<Task> getTasks()
    {
        List<Task> tasks = new ArrayList<Task>();
        return tasks = clientService.fetchTasks();
    }

    @DefaultHandler
    public Resolution show()
    {

        return new ForwardResolution(VIEW);

    }

    public Resolution showMyTasks()
    {


        return new ForwardResolution("/jsp/myTasks.jsp");
    }
    private static final String VIEW = "/jsp/dashboard.jsp";

    public ClientService getClientService()
    {
        return clientService;
    }

    public void setClientService(ClientService clientService)
    {
        this.clientService = clientService;
    }
}
