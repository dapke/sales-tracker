package com.jameselsey.salestracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="MARKETRESEARCHLG")
public class MarketResearchLocalGovernment extends MarketResearch
{

    @Column(name="CURRENT_DMS")
    private String currentDMS;

    public String getCurrentDMS()
    {
        return currentDMS;
    }

    public void setCurrentDMS(String currentDMS)
    {
        this.currentDMS = currentDMS;
    }
}
