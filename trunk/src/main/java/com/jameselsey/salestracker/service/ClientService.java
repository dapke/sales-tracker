package com.jameselsey.salestracker.service;

import com.jameselsey.salestracker.dao.ClientDao;
import com.jameselsey.salestracker.domain.Client;
import com.jameselsey.salestracker.mockDao.ClientMock;
import java.util.List;

public class ClientService
{

    ClientDao clientDao = new ClientMock();

    public List<Client> fetchClients()
    {

        return clientDao.fetchClients();
    }
    public Client getClientById(Integer clientId)
    {
        return clientDao.getClientById(clientId);
    }
}
