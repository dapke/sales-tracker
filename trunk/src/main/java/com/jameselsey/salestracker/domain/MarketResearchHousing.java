package com.jameselsey.salestracker.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MarketResearchHousing implements Serializable
{

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private Integer socialHousingStock;
    @Column
    private Integer numberOfTenants;
    @Column
    private Integer starRating;

    @Column
    private String currentDMS;
    @Column
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

    public Integer getNumberOfTenants()
    {
        return numberOfTenants;
    }

    public void setNumberOfTenants(Integer numberOfTenants)
    {
        this.numberOfTenants = numberOfTenants;
    }

    public Integer getSocialHousingStock()
    {
        return socialHousingStock;
    }

    public void setSocialHousingStock(Integer socialHousingStock)
    {
        this.socialHousingStock = socialHousingStock;
    }

    public Integer getStarRating()
    {
        return starRating;
    }

    public void setStarRating(Integer starRating)
    {
        this.starRating = starRating;
    }
    
}
