package com.jameselsey.salestracker.domain;


public class MarketResearch
{

    private Integer id;
    private Integer numberOfStaff;
    
    private MarketResearchEducation marketResearchEducation;
    private MarketResearchHousing marketResearchHousing;
    private MarketResearchLocalGovernment marketResearchLocalGovernment;


    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public MarketResearchEducation getMarketResearchEducation()
    {
        return marketResearchEducation;
    }

    public void setMarketResearchEducation(MarketResearchEducation marketResearchEducation)
    {
        this.marketResearchEducation = marketResearchEducation;
    }

    public MarketResearchHousing getMarketResearchHousing()
    {
        return marketResearchHousing;
    }

    public void setMarketResearchHousing(MarketResearchHousing marketResearchHousing)
    {
        this.marketResearchHousing = marketResearchHousing;
    }

    public Integer getNumberOfStaff()
    {
        return numberOfStaff;
    }

    public void setNumberOfStaff(Integer numberOfStaff)
    {
        this.numberOfStaff = numberOfStaff;
    }

    public MarketResearchLocalGovernment getMarketResearchLocalGovernment()
    {
        return marketResearchLocalGovernment;
    }

    public void setMarketResearchLocalGovernment(MarketResearchLocalGovernment marketResearchLocalGovernment)
    {
        this.marketResearchLocalGovernment = marketResearchLocalGovernment;
    }



}