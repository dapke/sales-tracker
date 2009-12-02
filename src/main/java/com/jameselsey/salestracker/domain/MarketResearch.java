package com.jameselsey.salestracker.domain;

public class MarketResearch
{

    private Integer id;
    private String currentDMS;
    private String currentCRM;

    public String getCurrentCRM()
    {
        return currentCRM;
    }

    public void setCurrentCRM(String currentCRM)
    {
        this.currentCRM = currentCRM;
    }

    public String getCurrentDMS()
    {
        return currentDMS;
    }

    public void setCurrentDMS(String currentDMS)
    {
        this.currentDMS = currentDMS;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }


}