package com.jameselsey.salestracker.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class MarketResearch implements Serializable
{


    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private Integer numberOfStaff;
    
    @OneToOne(optional=true)
    private MarketResearchEducation marketResearchEducation;
    @OneToOne(optional=true)
    private MarketResearchHousing marketResearchHousing;
    @OneToOne(optional=true)
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