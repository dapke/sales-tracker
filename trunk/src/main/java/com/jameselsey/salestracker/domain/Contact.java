package com.jameselsey.salestracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name="CONTACT")
public class Contact extends AbstractEntity
{

    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="JOB_ROLE")
    private String jobRole;
    @Column(name="DESK_PHONE")
    private String deskPhone;
    @Column(name="MOBILE_PHONE")
    private String mobilePhone;
    @Column(name="EMAIL_ADDRESS")
    private String emailAddress;
    @ManyToOne
    private Client client;

    public String getDeskPhone()
    {
        return deskPhone;
    }

    public void setDeskPhone(String deskPhone)
    {
        this.deskPhone = deskPhone;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getJobRole()
    {
        return jobRole;
    }

    public void setJobRole(String jobRole)
    {
        this.jobRole = jobRole;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getMobilePhone()
    {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone)
    {
        this.mobilePhone = mobilePhone;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }
}
