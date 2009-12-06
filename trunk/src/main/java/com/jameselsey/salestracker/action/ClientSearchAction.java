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
public class ClientSearchAction extends BaseAction
{

    @SpringBean
    private ClientService clientService;// = new ClientService();

    public List<Client> getClients()
    {
        return clientService.fetchClients();
    }

    @DefaultHandler
    public Resolution randomDate()
    {
        return new ForwardResolution(VIEW);
    }
    private static final String VIEW = "/jsp/customerSearch.jsp";
}
