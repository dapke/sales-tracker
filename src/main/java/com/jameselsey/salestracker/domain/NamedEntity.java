package com.jameselsey.salestracker.domain;

import javax.persistence.Basic;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class NamedEntity extends AbstractEntity
{
    @Basic(optional = false)
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


}