package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Contact;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

public class EditContactAction extends BaseAction
{

    public Contact contact;

    public Contact getContact()
    {
        return contact;
    }

    public void setContact(Contact contact)
    {
        this.contact = contact;
    }
    

    @DefaultHandler
    public Resolution show()
    {
        return new ForwardResolution("/jsp/editContact.jsp");
    }
}