package com.jameselsey.salestracker.domain;

import java.util.List;

public class Prospect
{

    private Integer id;
    private String name;
    private String sector;
    private String address1;
    private String address2;
    private String town;
    private String county;
    private String postcode;
    private String country;
    private String websiteURL;
    private String mainPhoneNumber;
    private List<Contact> contacts;
    private List<Project> projects;
    private MarketResearch marketResearch;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer Id)
    {
        this.id = Id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

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

    public List<Contact> getContacts()
    {
        return contacts;
    }

    public void setContacts(List<Contact> contacts)
    {
        this.contacts = contacts;
    }

    public List<Project> getProjects()
    {
        return projects;
    }

    public void setProjects(List<Project> projects)
    {
        this.projects = projects;
    }

    public MarketResearch getMarketResearch()
    {
        return marketResearch;
    }

    public void setMarketResearch(MarketResearch marketResearch)
    {
        this.marketResearch = marketResearch;
    }


}
