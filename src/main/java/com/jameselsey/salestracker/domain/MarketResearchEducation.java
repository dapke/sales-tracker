package com.jameselsey.salestracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class MarketResearchEducation extends AbstractEntity
{

    @Column
    private Integer numberOfStudents;
    @Column
    private Integer numberOfCampuses;
    @Column
    private Integer numberOfCoursesOffered;
    @Column
    private String currentDMS;
    @Column
    private String currentStudentRegistrySystem;

    public String getCurrentDMS()
    {
        return currentDMS;
    }

    public void setCurrentDMS(String currentDMS)
    {
        this.currentDMS = currentDMS;
    }

    public String getCurrentStudentRegistrySystem()
    {
        return currentStudentRegistrySystem;
    }

    public void setCurrentStudentRegistrySystem(String currentStudentRegistrySystem)
    {
        this.currentStudentRegistrySystem = currentStudentRegistrySystem;
    }

    public Integer getNumberOfCampuses()
    {
        return numberOfCampuses;
    }

    public void setNumberOfCampuses(Integer numberOfCampuses)
    {
        this.numberOfCampuses = numberOfCampuses;
    }

    public Integer getNumberOfCoursesOffered()
    {
        return numberOfCoursesOffered;
    }

    public void setNumberOfCoursesOffered(Integer numberOfCoursesOffered)
    {
        this.numberOfCoursesOffered = numberOfCoursesOffered;
    }

    public Integer getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents)
    {
        this.numberOfStudents = numberOfStudents;
    }
}
