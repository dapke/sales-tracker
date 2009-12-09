package com.jameselsey.salestracker.dao.jpa;

import com.jameselsey.salestracker.dao.ClientDao;
import com.jameselsey.salestracker.domain.Client;
import com.jameselsey.salestracker.domain.Contact;
import java.util.List;

public class JpaDaoClient extends JpaDao implements ClientDao
{

    @Override
    public Client getClientById(Integer clientId)
    {
        String jpql = "SELECT c " +
                "FROM com.jameselsey.salestracker.domain.Client c " +
                "WHERE c.id = " + clientId;

        return (Client) getJpaTemplate().find(jpql).get(0);
    }

    @Override
    public Contact getContactById(Integer contactId)
    {
        String jpql = "SELECT c " +
                "FROM com.jameselsey.salestracker.domain.Contact c " +
                "WHERE c.id = " + contactId;

        return (Contact) getJpaTemplate().find(jpql).get(0);
    }

    @Override
    public void persistClient(Client client)
    {
        if (client.getId() != null)
        {
            getJpaTemplate().merge(client);
            getJpaTemplate().flush();
        } else
        {
            getJpaTemplate().persist(client);
        }
    }

    @Override
    public List<Client> getAllClients()
    {
        String jpql = "SELECT c " +
                "FROM com.jameselsey.salestracker.domain.Client c";

        return getJpaTemplate().find(jpql);
    }
}
