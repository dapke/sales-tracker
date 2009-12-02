package com.jameselsey.salestracker.domain;

public class MarketResearch
{

    private Integer id;
    private String currentHousingSystem;
    private String currentStudentServicesSystem;

    public String getCurrentHousingSystem()
    {
        return currentHousingSystem;
    }

    public void setCurrentHousingSystem(String currentHousingSystem)
    {
        this.currentHousingSystem = currentHousingSystem;
    }

    public String getCurrentStudentServicesSystem()
    {
        return currentStudentServicesSystem;
    }

    public void setCurrentStudentServicesSystem(String currentStudentServicesSystem)
    {
        this.currentStudentServicesSystem = currentStudentServicesSystem;
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