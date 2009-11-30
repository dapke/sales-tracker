package com.jameselsey.salestracker.action;

import com.jameselsey.salestracker.domain.Prospect;
import com.jameselsey.salestracker.service.ProspectService;
import java.util.List;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author James
 */
public class ViewProspectAction extends BaseAction
{

    ProspectService prospectService = new ProspectService();

    private Integer prospectId;

    public void setProspectId(Integer prospectId)
    {
        this.prospectId = prospectId;
    }


    
    public Prospect getProspect()
    {
//        return
              Prospect p =  prospectService.getProspectById(prospectId);
              System.out.println(p.getContacts().get(0).getFirstName());
              return p;
    }

    @DefaultHandler
    public Resolution show()
    {

        return new ForwardResolution(VIEW);

    }
    private static final String VIEW = "/jsp/viewProspect.jsp";
}
