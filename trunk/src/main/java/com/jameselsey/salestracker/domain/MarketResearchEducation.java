package com.jameselsey.salestracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="MARKETRESEARCHEDUCATION")

public class MarketResearchEducation extends MarketResearch
{

    @Column(name="NUMBER_OF_STUDENTS")
    private Integer numberOfStudents;
    @Column(name="NUMBER_OF_CAMPUS")
    private Integer numberOfCampuses;
    @Column(name="NUMBER_OF_COURSES")
    private Integer numberOfCoursesOffered;
    @Column(name="CURRENT_DMS")
    private String currentDMS;
    @Column(name="CURRENT_STU_REG_SYS")
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
