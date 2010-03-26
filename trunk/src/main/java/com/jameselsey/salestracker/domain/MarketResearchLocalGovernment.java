package com.jameselsey.salestracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="MARKETRESEARCHLG")
public class MarketResearchLocalGovernment extends MarketResearch
{

    @Column(name="CURRENT_DMS")
    private String currentDMS;
    @Column(name = "CURRENT_REVENUES_SYSTEM")
    private String currentRevenuesSystem;
    @Column(name = "CURRENT_BENEFITS_SYSTEM")
    private String currentBenefitsSystem;
    @Column(name = "CURRENT_PLANNING_SYSTEM")
    private String currentPlanningSystem;
    @Column(name = "CURRENT_LICENSING_SYSTEM")
    private String currentLicensingSystem;
    @Column(name = "CURRENT_PARKING_SYSTEM")
    private String currentParkingSystem;
    @Column(name = "CURRENT_HR_SYSTEM")
    private String currentHRSystem;

    public String getCurrentDMS()
    {
        return currentDMS;
    }

    public void setCurrentDMS(String currentDMS)
    {
        this.currentDMS = currentDMS;
    }

    public String getCurrentBenefitsSystem()
    {
        return currentBenefitsSystem;
    }

    public void setCurrentBenefitsSystem(String currentBenefitsSystem)
    {
        this.currentBenefitsSystem = currentBenefitsSystem;
    }

    public String getCurrentHRSystem()
    {
        return currentHRSystem;
    }

    public void setCurrentHRSystem(String currentHRSystem)
    {
        this.currentHRSystem = currentHRSystem;
    }

    public String getCurrentLicensingSystem()
    {
        return currentLicensingSystem;
    }

    public void setCurrentLicensingSystem(String currentLicensingSystem)
    {
        this.currentLicensingSystem = currentLicensingSystem;
    }

    public String getCurrentParkingSystem()
    {
        return currentParkingSystem;
    }

    public void setCurrentParkingSystem(String currentParkingSystem)
    {
        this.currentParkingSystem = currentParkingSystem;
    }

    public String getCurrentPlanningSystem()
    {
        return currentPlanningSystem;
    }

    public void setCurrentPlanningSystem(String currentPlanningSystem)
    {
        this.currentPlanningSystem = currentPlanningSystem;
    }

    public String getCurrentRevenuesSystem()
    {
        return currentRevenuesSystem;
    }

    public void setCurrentRevenuesSystem(String currentRevenuesSystem)
    {
        this.currentRevenuesSystem = currentRevenuesSystem;
    }
    
}
