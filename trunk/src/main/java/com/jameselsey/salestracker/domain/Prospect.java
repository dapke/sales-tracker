package com.jameselsey.salestracker.domain;

public class Prospect
{

    private Integer id;
    private String name;
    private String sector;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer Id)
    {
        this.id = Id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSector()
    {
        return sector;
    }

    public void setSector(String sector)
    {
        this.sector = sector;
    }
}
