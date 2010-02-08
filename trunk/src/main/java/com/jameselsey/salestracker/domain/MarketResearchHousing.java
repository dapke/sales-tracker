package com.jameselsey.salestracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="MARKETRESEARCHHOUSING")
public class MarketResearchHousing extends MarketResearch
{

    @Column(name="SOCIAL_HOUSING_STOCK")
    private Integer socialHousingStock;
    @Column(name="NUMBER_OF_TENANTS")
    private Integer numberOfTenants;
    @Column(name="STAR_RATING")
    private Integer starRating;
    @Column(name="CURRENT_DMS")
    private String currentDMS;
    @Column(name="CURRENT_CRM")
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
