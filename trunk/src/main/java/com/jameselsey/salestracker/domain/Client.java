package com.jameselsey.salestracker.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Client extends NamedEntity
{

    @Column
    private String sector;
    @Column
    private String address1;
    @Column
    private String address2;
    @Column
    private String town;
    @Column
    private String county;
    @Column
    private String postcode;
    @Column
    private String country;
    @Column
    private String websiteURL;
    @Column
    private String mainPhoneNumber;
    @OneToMany(mappedBy = "client")
    private Set<Contact> contacts = new HashSet<Contact>();
    @Transient
    private Set<Project> projects = new HashSet<Project>();
    @Transient
    private MarketResearch marketResearch;

   

    public String getSector()
    {
        return sector;
    }

    public void setSector(String sector)
    {
        this.sector = sector;
    }

    public String getAddress1()
    {
        return address1;
    }

    public void setAddress1(String address1)
    {
        this.address1 = address1;
    }

    public String getAddress2()
    {
        return address2;
    }

    public void setAddress2(String address2)
    {
        this.address2 = address2;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCounty()
    {
        return county;
    }

    public void setCounty(String county)
    {
        this.county = county;
    }

    public String getMainPhoneNumber()
    {
        return mainPhoneNumber;
    }

    public void setMainPhoneNumber(String mainPhoneNumber)
    {
        this.mainPhoneNumber = mainPhoneNumber;
    }

    public String getTown()
    {
        return town;
    }

    public void setTown(String town)
    {
        this.town = town;
    }

    public String getWebsiteURL()
    {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL)
    {
        this.websiteURL = websiteURL;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }



    public MarketResearch getMarketResearch()
    {
        return marketResearch;
    }

    public void setMarketResearch(MarketResearch marketResearch)
    {
        this.marketResearch = marketResearch;
    }

    public Set<Contact> getContacts()
    {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts)
    {
        this.contacts = contacts;
    }

    public Set<Project> getProjects()
    {
        return projects;
    }

    public void setProjects(Set<Project> projects)
    {
        this.projects = projects;
    }

  
}
