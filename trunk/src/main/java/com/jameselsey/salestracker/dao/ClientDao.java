package com.jameselsey.salestracker.dao;

import com.jameselsey.salestracker.domain.Client;
import com.jameselsey.salestracker.domain.Contact;
import java.util.List;

public interface ClientDao
{
    public Client getClientById(Integer clientId);
    public void persistClient(Client client);
    public List<Client> getAllClients();
    public Contact getContactById(Integer contactId);
}
