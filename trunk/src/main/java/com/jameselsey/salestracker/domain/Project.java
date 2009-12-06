package com.jameselsey.salestracker.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project implements Serializable
{
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String type;
    @Column
    private String projectValue;

    @ManyToOne
    private Client client;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

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