package com.jameselsey.salestracker.mockDao;

import com.jameselsey.salestracker.dao.ProspectDao;
import com.jameselsey.salestracker.domain.Prospect;
import java.util.ArrayList;
import java.util.List;


public class ProspectMock implements ProspectDao
{

    public List<Prospect> fetchProspects() {

        List<Prospect> prospects = new ArrayList<Prospect>();

        Prospect prospect1 = new Prospect();

        prospect1.setName("Suffolk County Council");




        prospects.add(prospect1);

        return prospects;
    }

}