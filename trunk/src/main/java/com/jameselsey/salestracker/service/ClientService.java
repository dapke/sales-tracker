package com.jameselsey.salestracker.service;

import com.jameselsey.salestracker.dao.ClientDao;
import com.jameselsey.salestracker.domain.Client;
import com.jameselsey.salestracker.domain.Contact;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ClientService
{

    private ClientDao clientDao;

    @Resource
    @Required
    public void setClientDao(ClientDao clientDao)
    {
        this.clientDao = clientDao;
    }

    public List<Client> fetchClients()
    {

        return clientDao.getAllClients();
    }

    public Client getClientById(Integer clientId)
    {
        return clientDao.getClientById(clientId);
    }

    public void persistClient(Client client)
    {
        clientDao.persistClient(client);
    }

    public Contact getContactById(Integer contactId)
    {
        return clientDao.getContactById(contactId);
    }
}
