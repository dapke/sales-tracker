/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameselsey.salestracker.action;

import java.util.Date;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author James
 */
public class HelloWorldAction implements ActionBean {

    private ActionBeanContext ctx;

    public ActionBeanContext getContext() {
        return ctx;
    }

    public void setContext(ActionBeanContext ctx) {
        this.ctx = ctx;
    }
    private Date date;

    public Date getDate() {
        return date;
    }

    @DefaultHandler
    public Resolution currentDate() {
        date = new Date();
        return new ForwardResolution(VIEW);
    }

    public Resolution randomDate() {
        long max = System.currentTimeMillis();
//        long random = new Random().nextLong() % max;
        date = new Date();
        return new ForwardResolution(VIEW);
    }
    private static final String VIEW = "/jsp/hello.jsp";
}