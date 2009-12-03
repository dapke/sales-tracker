package com.jameselsey.salestracker.domain;

public class MarketResearchHousing
{

    private Integer id;
    private Integer socialHousingStock;
    private Integer numberOfTenants;
    private Integer starRating;

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
