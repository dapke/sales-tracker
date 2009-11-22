/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Prospect;
import java.util.ArrayList;
import java.util.List;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author James
 */
public class CustomerSearchAction extends BaseAction {

    
    @DefaultHandler
    public Resolution randomDate() {
        return new ForwardResolution(VIEW);
    }

    public List<Prospect> prospects = new ArrayList<Prospect>();


    private static final String VIEW = "/jsp/customerSearch.jsp";
}
