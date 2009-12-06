package com.jameselsey.salestracker.mockDao;

import com.jameselsey.salestracker.dao.ClientDao;
import com.jameselsey.salestracker.dao.JpaDao;
import com.jameselsey.salestracker.domain.Contact;
import com.jameselsey.salestracker.domain.MarketResearch;
import com.jameselsey.salestracker.domain.Project;
import com.jameselsey.salestracker.domain.Client;
import com.jameselsey.salestracker.domain.MarketResearchEducation;
import com.jameselsey.salestracker.domain.MarketResearchHousing;
import com.jameselsey.salestracker.domain.MarketResearchLocalGovernment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import org.springframework.stereotype.Repository;
import org.stripesstuff.stripersist.Stripersist;

public class ClientMock extends JpaDao implements ClientDao
{

    @Override
    public List<Client> fetchClients()
    {

        List<Contact> contacts = new ArrayList<Contact>();
        List<Client> clients = new ArrayList<Client>();

        Client client1 = new Client();
        client1.setId(1);
        client1.setName("Suffolk County Council");
        client1.setSector("Local Government");
        client1.setAddress1("Endeavour House");
        client1.setAddress2("Russell Rd");
        client1.setTown("Ipswich");
        client1.setCounty("Suffolk");
        client1.setPostcode("IP1 2BX");
        client1.setCountry("England");
        client1.setMainPhoneNumber("0845 606 6067");
        client1.setWebsiteURL("www.suffolk.gov.uk");
//        client1.setContacts(initialiseContacts());
//        client1.setProjects(initialiseProjects());
//        client1.setMarketResearch(initialiseMarketResearchForLocalGovernment());

        Client client2 = new Client();
        client2.setId(2);
        client2.setName("Essex County Council");
        client2.setSector("Local Government");
        client2.setAddress1("County Hall");
        client2.setAddress2("Market Road");
        client2.setTown("Chelmsford");
        client2.setCounty("Essex");
        client2.setPostcode("CM1 1QH");
        client2.setCountry("England");
        client2.setMainPhoneNumber("0845 743 0430");
        client2.setWebsiteURL("www.essex.gov.uk");
//        client2.setContacts(initialiseContacts());
//        client2.setProjects(initialiseProjects());
//        client2.setMarketResearch(initialiseMarketResearchForLocalGovernment());

        Client client3 = new Client();
        client3.setId(3);
        client3.setName("Suffolk College");
        client3.setSector("Education");
        client3.setAddress1("Ipswich");
        client3.setAddress2("");
        client3.setTown("Ipswich");
        client3.setCounty("Suffolk");
        client3.setPostcode("IP4 1LT");
        client3.setCountry("England");
        client3.setMainPhoneNumber("01473 382200");
        client3.setWebsiteURL("www.suffolk.ac.uk");
//        client3.setContacts(initialiseContacts());
//        client3.setProjects(initialiseProjects());
//        client3.setMarketResearch(initialiseMarketResearchForEducation());

        Client client4 = new Client();
        client4.setId(4);
        client4.setName("Cambridgeshire County Council");
        client4.setSector("Local Government");
        client4.setAddress1("Shire Hall");
        client4.setAddress2("Castle Street");
        client4.setTown("Cambridge");
        client4.setCounty("Suffolk");
        client4.setPostcode("CB3 0AP");
        client4.setCountry("England");
        client4.setMainPhoneNumber("01223 717 111");
        client4.setWebsiteURL("www.cambridgeshire.gov.uk");
//        client4.setContacts(initialiseContacts());
//        client4.setProjects(initialiseProjects());
//        client4.setMarketResearch(initialiseMarketResearchForLocalGovernment());

        Client client5 = new Client();
        client5.setId(5);
        client5.setName("Ipswich Borough Council");
        client5.setSector("Local Government");
        client5.setAddress1("Grafton House");
        client5.setAddress2("15-17 Russell Road");
        client5.setTown("Ipswich");
        client5.setCounty("Suffolk");
        client5.setPostcode("IP1 2DE");
        client5.setCountry("England");
        client5.setMainPhoneNumber("01473 432000");
        client5.setWebsiteURL("www.ipswich.gov.uk");
//        client5.setContacts(initialiseContacts());
//        client5.setProjects(initialiseProjects());
//        client5.setMarketResearch(initialiseMarketResearchForLocalGovernment());

        Client client6 = new Client();
        client6.setId(6);
        client6.setName("Sudbury Town Council");
        client6.setSector("Local Government");
        client6.setAddress1("Town Hall");
        client6.setAddress2("Market Hill");
        client6.setTown("Sudbury");
        client6.setCounty("Suffolk");
        client6.setPostcode("CO10 1TL");
        client6.setCountry("England");
        client6.setMainPhoneNumber("01787 372 331");
        client6.setWebsiteURL("www.sudburytowncouncil.co.uk");
//        client6.setContacts(initialiseContacts());
//        client6.setProjects(initialiseProjects());
//        client6.setMarketResearch(initialiseMarketResearchForLocalGovernment());

        Client client7 = new Client();
        client7.setId(7);
        client7.setName("Anglia Ruskin University");
        client7.setSector("Education");
        client7.setAddress1("East Road");
        client7.setAddress2("Cambridge");
        client7.setTown("Cambridge");
        client7.setCounty("Cambridgeshire");
        client7.setPostcode("CB1 1PT");
        client7.setCountry("England");
        client7.setMainPhoneNumber("0845 271 3333");
        client7.setWebsiteURL("www.anglia.ac.uk");
//        client7.setContacts(initialiseContacts());
//        client7.setProjects(initialiseProjects());
//        client7.setMarketResearch(initialiseMarketResearchForEducation());

        Client client8 = new Client();
        client8.setId(8);
        client8.setName("Orwell Housing");
        client8.setSector("Housing Association");
        client8.setAddress1("Crane Hill Lodge");
        client8.setAddress2("325 London Road");
        client8.setTown("Ipswich");
        client8.setCounty("Suffolk");
        client8.setPostcode("IP2 0BE");
        client8.setCountry("England");
        client8.setMainPhoneNumber("01473 218818");
        client8.setWebsiteURL("www.orwell-housing.co.uk");
//        client8.setMarketResearch(initialiseMarketResearchForHousing());

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        clients.add(client5);
        clients.add(client6);
        clients.add(client7);
        clients.add(client8);




        return clients;
    }

//    @Override
//    public Client getClientById(Integer clientId)
//    {
//        List<Client> lp = fetchClients();
//
//        //Subtracting 1 because list starts from 0,
//        //Shoddy workaround, but will fix that when I do proper DAO implementations ;)
//        return lp.get(clientId - 1);
//
//    }

    public List<Contact> initialiseContacts()
    {
        Contact contact1 = new Contact();

//        contact1.setId(1);
        contact1.setFirstName("Dave");
        contact1.setLastName("Smith");
        contact1.setJobRole("IT Manager");
        contact1.setDeskPhone("01787 317543");
        contact1.setMobilePhone("");
        contact1.setEmailAddress("dave.smith@email.com");

        Contact contact2 = new Contact();

//        contact2.setId(2);
        contact2.setFirstName("John");
        contact2.setLastName("Blackmouth");
        contact2.setJobRole("Finance Directory");
        contact2.setDeskPhone("01787 317867");
        contact2.setMobilePhone("");
        contact2.setEmailAddress("john.blackmouth@email.com");

        List<Contact> contacts = new ArrayList<Contact>();

        contacts.add(contact1);
        contacts.add(contact2);

        return contacts;
    }

    public List<Project> initialiseProjects()
    {
        Project project1 = new Project();

        project1.setId(1);
        project1.setType("Housing System Install");
        project1.setProjectValue("£2000");


        Project project2 = new Project();

        project2.setId(1);
        project2.setType("Student Services Install");
        project2.setProjectValue("£7000");

        List<Project> projects = new ArrayList<Project>();

        projects.add(project1);
        projects.add(project2);
        return projects;
    }

    public MarketResearch initialiseMarketResearchForHousing()
    {
        MarketResearch marketResearch = new MarketResearch();

        marketResearch.setId(1);
        marketResearch.setMarketResearchHousing(new MarketResearchHousing());
        marketResearch.getMarketResearchHousing().setCurrentDMS("MS DMS");
        marketResearch.getMarketResearchHousing().setCurrentCRM("MS CRM");
        marketResearch.getMarketResearchHousing().setNumberOfTenants(43000);
        marketResearch.getMarketResearchHousing().setSocialHousingStock(7000);
        marketResearch.getMarketResearchHousing().setStarRating(3);

        return marketResearch;
    }

    public MarketResearch initialiseMarketResearchForEducation()
    {
        MarketResearch marketResearch = new MarketResearch();

        marketResearch.setId(1);
        marketResearch.setNumberOfStaff(220);
        marketResearch.setMarketResearchEducation(new MarketResearchEducation());
        marketResearch.getMarketResearchEducation().setCurrentDMS("MS DMS");
        marketResearch.getMarketResearchEducation().setCurrentStudentRegistrySystem("STU-Reg");
        marketResearch.getMarketResearchEducation().setNumberOfCampuses(3);
        marketResearch.getMarketResearchEducation().setNumberOfCoursesOffered(89);

        return marketResearch;
    }

    public MarketResearch initialiseMarketResearchForLocalGovernment()
    {
        MarketResearch marketResearch = new MarketResearch();

        marketResearch.setId(1);
        marketResearch.setMarketResearchLocalGovernment(new MarketResearchLocalGovernment());
        marketResearch.getMarketResearchLocalGovernment().setCurrentDMS("MS DMS");

        return marketResearch;
    }

//    EntityManager em = Stripersist.getEntityManager();
    @Override
    public void persistClient(Client client)
    {

        System.out.println("break");
//        client.setId(null);
//        client.setProjects(null);
//        client.setContacts(null);
//        client.setMarketResearch(null);
        if (client.getId() != null) {
            getJpaTemplate().merge(client);
            getJpaTemplate().flush();
        } else {
            getJpaTemplate().persist(client);
        }


    }

    @Override
    public List<Client> getAllClients()
    {
        String jpql = "SELECT c " +
                "FROM com.jameselsey.salestracker.domain.Client c";

        List<Client> clients = getJpaTemplate().find(jpql);
        return clients;
    }

    @Override
    public Client getClientById(Integer clientId)
    {

        String jpql = "SELECT c " +
                "FROM com.jameselsey.salestracker.domain.Client c "+
                "WHERE c.id = " + clientId;

        Map params = new HashMap();
        params.put(params, params);

        Client c = (Client) getJpaTemplate().find(jpql).get(0);
        return c;
    }
}
