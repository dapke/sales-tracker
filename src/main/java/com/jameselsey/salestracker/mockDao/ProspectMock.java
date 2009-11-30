package com.jameselsey.salestracker.mockDao;

import com.jameselsey.salestracker.dao.ProspectDao;
import com.jameselsey.salestracker.domain.Contact;
import com.jameselsey.salestracker.domain.Prospect;
import java.util.ArrayList;
import java.util.List;

public class ProspectMock implements ProspectDao
{

    public List<Prospect> fetchProspects()
    {

        List<Contact> contacts = new ArrayList<Contact>();
        List<Prospect> prospects = new ArrayList<Prospect>();

        Prospect prospect1 = new Prospect();
        prospect1.setId(1);
        prospect1.setName("Suffolk County Council");
        prospect1.setSector("Local Government");
        prospect1.setAddress1("Endeavour House");
        prospect1.setAddress2("Russell Rd");
        prospect1.setTown("Ipswich");
        prospect1.setCounty("Suffolk");
        prospect1.setPostcode("IP1 2BX");
        prospect1.setCountry("England");
        prospect1.setMainPhoneNumber("0845 606 6067");
        prospect1.setWebsiteURL("www.suffolk.gov.uk");
        prospect1.setContacts(initialiseContacts());

        Prospect prospect2 = new Prospect();
        prospect2.setId(2);
        prospect2.setName("Essex County Council");
        prospect2.setSector("Local Government");
        prospect2.setAddress1("County Hall");
        prospect2.setAddress2("Market Road");
        prospect2.setTown("Chelmsford");
        prospect2.setCounty("Essex");
        prospect2.setPostcode("CM1 1QH");
        prospect2.setCountry("England");
        prospect2.setMainPhoneNumber("0845 743 0430");
        prospect2.setWebsiteURL("www.essex.gov.uk");
        prospect2.setContacts(contacts);

        Prospect prospect3 = new Prospect();
        prospect3.setId(3);
        prospect3.setName("Suffolk College");
        prospect3.setSector("Education");
        prospect3.setAddress1("Ipswich");
        prospect3.setAddress2("");
        prospect3.setTown("Ipswich");
        prospect3.setCounty("Suffolk");
        prospect3.setPostcode("IP4 1LT");
        prospect3.setCountry("England");
        prospect3.setMainPhoneNumber("01473 382200");
        prospect3.setWebsiteURL("www.suffolk.ac.uk");
        prospect3.setContacts(contacts);

        Prospect prospect4 = new Prospect();
        prospect4.setId(4);
        prospect4.setName("Cambridgeshire County Council");
        prospect4.setSector("Local Government");
        prospect4.setAddress1("Shire Hall");
        prospect4.setAddress2("Castle Street");
        prospect4.setTown("Cambridge");
        prospect4.setCounty("Suffolk");
        prospect4.setPostcode("CB3 0AP");
        prospect4.setCountry("England");
        prospect4.setMainPhoneNumber("01223 717 111");
        prospect4.setWebsiteURL("www.cambridgeshire.gov.uk");
        prospect4.setContacts(contacts);

        Prospect prospect5 = new Prospect();
        prospect5.setId(5);
        prospect5.setName("Ipswich Borough Council");
        prospect5.setSector("Local Government");
        prospect5.setAddress1("Grafton House");
        prospect5.setAddress2("15-17 Russell Road");
        prospect5.setTown("Ipswich");
        prospect5.setCounty("Suffolk");
        prospect5.setPostcode("IP1 2DE");
        prospect5.setCountry("England");
        prospect5.setMainPhoneNumber("01473 432000");
        prospect5.setWebsiteURL("www.ipswich.gov.uk");
        prospect5.setContacts(contacts);

        Prospect prospect6 = new Prospect();
        prospect6.setId(6);
        prospect6.setName("Sudbury Town Council");
        prospect6.setSector("Local Government");
        prospect6.setAddress1("Town Hall");
        prospect6.setAddress2("Market Hill");
        prospect6.setTown("Sudbury");
        prospect6.setCounty("Suffolk");
        prospect6.setPostcode("CO10 1TL");
        prospect6.setCountry("England");
        prospect6.setMainPhoneNumber("01787 372 331");
        prospect6.setWebsiteURL("www.sudburytowncouncil.co.uk");
        prospect6.setContacts(contacts);

        Prospect prospect7 = new Prospect();
        prospect7.setId(7);
        prospect7.setName("Anglia Ruskin University");
        prospect7.setSector("Education");
        prospect7.setAddress1("East Road");
        prospect7.setAddress2("Cambridge");
        prospect7.setTown("Cambridge");
        prospect7.setCounty("Cambridgeshire");
        prospect7.setPostcode("CB1 1PT");
        prospect7.setCountry("England");
        prospect7.setMainPhoneNumber("0845 271 3333");
        prospect7.setWebsiteURL("www.anglia.ac.uk");
        prospect7.setContacts(contacts);

        Prospect prospect8 = new Prospect();
        prospect8.setId(8);
        prospect8.setName("Orwell Housing");
        prospect8.setSector("Housing Association");
        prospect8.setAddress1("Crane Hill Lodge");
        prospect8.setAddress2("325 London Road");
        prospect8.setTown("Ipswich");
        prospect8.setCounty("Suffolk");
        prospect8.setPostcode("IP2 0BE");
        prospect8.setCountry("England");
        prospect8.setMainPhoneNumber("01473 218818");
        prospect8.setWebsiteURL("www.orwell-housing.co.uk");
        prospect8.setContacts(contacts);

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

    public Prospect getProspectById(Integer prospectId)
    {
        List<Prospect> lp = fetchProspects();

        //Subtracting 1 because list starts from 0,
        //Shoddy workaround, but will fix that when I do proper DAO implementations ;)
        return lp.get(prospectId - 1);

    }

    public List<Contact> initialiseContacts()
    {
        Contact contact1 = new Contact();

        contact1.setId(1);
        contact1.setFirstName("Dave");
        contact1.setLastName("Smith");
        contact1.setJobRole("IT Manager");
        contact1.setDeskPhone("01787 317543");
        contact1.setMobilePhone("");
        contact1.setEmailAddress("dave.smith@email.com");

        Contact contact2 = new Contact();

        contact2.setId(2);
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
}
