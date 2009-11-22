/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Prospect;
import com.jameselsey.salestracker.service.ProspectService;
import java.util.List;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author James
 */
public class DashboardAction extends BaseAction {

    ProspectService prospectService = new ProspectService();

    public List<Prospect> getProspects() {
        return prospectService.fetchProspects();
    }

    @DefaultHandler
    public Resolution randomDate() {
        return new ForwardResolution(VIEW);

    }
    private static final String VIEW = "/jsp/dashboard.jsp";
}
