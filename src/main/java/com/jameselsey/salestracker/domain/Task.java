package com.jameselsey.salestracker.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity(name = "TASK")
public class Task extends AbstractEntity
{
    @Column(name = "SUMMARY")
    private String summary;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TARGET_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date targetDate;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "ASSIGNED_TO")
    private String assignedTo;

    @ManyToOne
    private Client client;

    public String getAssignedTo()
    {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo)
    {
        this.assignedTo = assignedTo;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getSummary()
    {
        return summary;
    }

    public void setSummary(String summary)
    {
        this.summary = summary;
    }

    public Date getTargetDate()
    {
        return targetDate;
    }

    public void setTargetDate(Date targetDate)
    {
        this.targetDate = targetDate;
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
