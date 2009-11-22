package com.jameselsey.salestracker.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 *
 * @author James
 */
public abstract class BaseAction implements ActionBean
{

    private ActionBeanContext actionBeanContext;

    @Override
    public ActionBeanContext getContext()
    {
        return actionBeanContext;
    }

    @Override
    public void setContext(ActionBeanContext actionBeanContext)
    {
        this.actionBeanContext = actionBeanContext;
    }
}
