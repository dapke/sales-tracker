package com.jameselsey.salestracker.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MarketResearchEducation implements Serializable
{

    @Id
    @GeneratedValue
    private Integer id;

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

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
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
