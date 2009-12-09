package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Client;
import com.jameselsey.salestracker.domain.Contact;
import com.jameselsey.salestracker.service.ClientService;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.integration.spring.SpringBean;

public class EditContactAction extends BaseAction
{

    @SpringBean
    ClientService clientService;
    public Contact contact;
    public Client client;
    public Integer contactId;
    public Integer clientId;

    public Integer getClientId()
    {
        return clientId;
    }

    public void setClientId(Integer clientId)
    {
        this.clientId = clientId;
    }

    public Integer getContactId()
    {
        return contactId;
    }

    public void setContactId(Integer contactId)
    {
        this.contactId = contactId;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    public Contact getContact()
    {
        return contact;
    }

    public void setContact(Contact contact)
    {
        this.contact = contact;
    }

    @DefaultHandler
    public Resolution viewContacts()
    {
        System.out.println("test");
        client = clientService.getClientById(clientId);
        return new ForwardResolution("/jsp/viewClientContacts.jsp");
    }

    public Resolution editContact()
    {
        contact = clientService.getContactById(contactId);
        return new ForwardResolution("/jsp/editContact.jsp");
    }

    public Resolution saveUpdatedContact()
    {
        System.out.println("Test");
        clientService.persistClient(client);
        return new RedirectResolution("/jsp/viewClientQuickView.jsp").flash(this);
    }

    public ClientService getClientService()
    {
        return clientService;
    }

    public void setClientService(ClientService clientService)
    {
        this.clientService = clientService;
    }
}
