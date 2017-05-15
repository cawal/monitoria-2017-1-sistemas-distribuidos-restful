package io.swagger.dao;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

import io.swagger.model.Patient;
import io.swagger.model.Telephone;

public class PatientDaoMock {
    private static List<Patient> patientList = new ArrayList<Patient>();
    private static boolean initialized = false;

    public static List<Patient> getPatients(){
        // if there is no patient (first run), lets create some to play with then
        if(!initialized){
            Patient p1 = new Patient();
            p1.setId("chico");
            p1.setName("Chico Buarque");
            Telephone t1 = new Telephone();
            t1.setId(UUID.randomUUID().toString());
            t1.setNumber("+55 16 3333 3332");
            p1.getTelephones().add(t1);
            p1.setPreferredPhone(t1.getId());
            patientList.add(p1);


            Patient p2 = new Patient();
            p2.setId("elis_pimentinha");
            p2.setName("Elis Regina");
            Telephone t2 = new Telephone();
            t2.setId(UUID.randomUUID().toString());
            t2.setNumber("+55 16 3333 3333");
            p2.getTelephones().add(t2);
            p2.setPreferredPhone(t2.getId());
            patientList.add(p2);

            initialized = true;
        }

        return patientList;
    }

}
