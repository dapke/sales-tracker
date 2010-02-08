package com.jameselsey.salestracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="MARKETRESEARCH")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class MarketResearch extends AbstractEntity
{

    @Column
    private Integer numberOfStaff;

    public Integer getNumberOfStaff()
    {
        return numberOfStaff;
    }

    public void setNumberOfStaff(Integer numberOfStaff)
    {
        this.numberOfStaff = numberOfStaff;
    }
}
