package com.jameselsey.salestracker.mockDao;

import com.jameselsey.salestracker.dao.ProspectDao;
import com.jameselsey.salestracker.domain.Prospect;
import java.util.ArrayList;
import java.util.List;

public class ProspectMock implements ProspectDao
{

    public List<Prospect> fetchProspects()
    {

        List<Prospect> prospects = new ArrayList<Prospect>();

        Prospect prospect1 = new Prospect();
        prospect1.setName("Suffolk County Council");
        prospect1.setSector("Local Government");

        Prospect prospect2 = new Prospect();
        prospect2.setName("Essex County Council");
        prospect2.setSector("Local Government");

        Prospect prospect3 = new Prospect();
        prospect3.setName("Suffolk College");
        prospect3.setSector("Education");

        Prospect prospect4 = new Prospect();
        prospect4.setName("Cambridgeshire County Council");
        prospect4.setSector("Local Government");

        Prospect prospect5 = new Prospect();
        prospect5.setName("Ipswich Town Council");
        prospect5.setSector("Local Government");

        Prospect prospect6 = new Prospect();
        prospect6.setName("Sudbury Town Council");
        prospect6.setSector("Local Government");

        Prospect prospect7 = new Prospect();
        prospect7.setName("Anglia Ruskin University");
        prospect7.setSector("Education");

        Prospect prospect8 = new Prospect();
        prospect8.setName("Sudbury Town Homes");
        prospect8.setSector("Housing Association");

        prospects.add(prospect1);
        prospects.add(prospect2);
        prospects.add(prospect3);
        prospects.add(prospect4);
        prospects.add(prospect5);
        prospects.add(prospect6);
        prospects.add(prospect7);
        prospects.add(prospect8);


        return prospects;
    }
}
