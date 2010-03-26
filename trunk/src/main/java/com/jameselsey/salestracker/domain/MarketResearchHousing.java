package com.jameselsey.salestracker.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;

@Entity(name = "MARKETRESEARCHHOUSING")
public class MarketResearchHousing extends MarketResearch
{

    @Column(name = "SOCIAL_HOUSING_STOCK")
    private Integer socialHousingStock;
    @Column(name = "NUMBER_OF_TENANTS")
    private Integer numberOfTenants;
    @Column(name = "STAR_RATING")
    private Integer starRating;
    @Column(name = "CURRENT_DMS")
    private String currentDMS;
    @Column(name = "CURRENT_CRM")
    private String currentCRM;
    @Column(name="CURRENT_HOUSING_SYSTEM")
    private String currentHousingSystem;
    @Column(name = "CURRENT_ASBO_SYSTEM")
    private String currentASBOSystem;
    @Column(name = "CURRENT_REPAIRS_SYSTEM")
    private String currentRepairsSystem;
    @Column(name = "CURRENT_TELEPHONY_SYSTEM")
    private String currentTelephonySystem;
    @Column(name = "DMS_PROCUREMENT_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dmsProcurementDate;
    @Column(name = "CRM_PROCUREMENT_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date crmProcurementDate;

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

    public Date getCrmProcurementDate()
    {
        return crmProcurementDate;
    }

    public void setCrmProcurementDate(Date crmProcurementDate)
    {
        this.crmProcurementDate = crmProcurementDate;
    }

    public Date getDmsProcurementDate()
    {
        return dmsProcurementDate;
    }

    public void setDmsProcurementDate(Date dmsProcurementDate)
    {
        this.dmsProcurementDate = dmsProcurementDate;
    }

    public String getCurrentASBOSystem()
    {
        return currentASBOSystem;
    }

    public void setCurrentASBOSystem(String currentASBOSystem)
    {
        this.currentASBOSystem = currentASBOSystem;
    }

    public String getCurrentHousingSystem()
    {
        return currentHousingSystem;
    }

    public void setCurrentHousingSystem(String currentHousingSystem)
    {
        this.currentHousingSystem = currentHousingSystem;
    }

    public String getCurrentRepairsSystem()
    {
        return currentRepairsSystem;
    }

    public void setCurrentRepairsSystem(String currentRepairsSystem)
    {
        this.currentRepairsSystem = currentRepairsSystem;
    }

    public String getCurrentTelephonySystem()
    {
        return currentTelephonySystem;
    }

    public void setCurrentTelephonySystem(String currentTelephonySystem)
    {
        this.currentTelephonySystem = currentTelephonySystem;
    }
    
}
