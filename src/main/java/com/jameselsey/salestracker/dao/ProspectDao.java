package com.jameselsey.salestracker.dao;

import com.jameselsey.salestracker.domain.Prospect;
import java.util.List;

public interface ProspectDao
{

    public List<Prospect> fetchProspects();
    public Prospect getProspectById(Integer prospectId);
}
