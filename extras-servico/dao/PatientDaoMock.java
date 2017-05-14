package io.swagger.dao;

import java.util.List;
import java.util.ArrayList;

import io.swagger.model.Patient;

public class PatientDaoMock {
    private static List<Patient> patientList = new ArrayList<Patient>();

    public static List<Patient> getPatients(){
        return patientList;
    }
}
