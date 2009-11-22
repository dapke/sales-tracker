package com.jameselsey.salestracker.service;

import com.jameselsey.salestracker.dao.ProspectDao;
import com.jameselsey.salestracker.domain.Prospect;
import com.jameselsey.salestracker.mockDao.ProspectMock;
import java.util.List;
import net.sourceforge.stripes.integration.spring.SpringBean;

public class ProspectService {

    
    ProspectDao prospectDao = new ProspectMock();

    public List<Prospect> fetchProspects() {

        return prospectDao.fetchProspects();
    }
}