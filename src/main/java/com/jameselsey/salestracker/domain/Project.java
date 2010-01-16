package com.jameselsey.salestracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Project extends AbstractEntity
{

    @Column
    private String type;
    @Column
    private String projectValue;
    @ManyToOne
    private Client client;

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getProjectValue()
    {
        return projectValue;
    }

    public void setProjectValue(String projectValue)
    {
        this.projectValue = projectValue;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }
}
