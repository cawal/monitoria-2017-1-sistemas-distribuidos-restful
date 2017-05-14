import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {

        DefaultApi apiInstance = new DefaultApi();
        Patient patient = new Patient();
        patient.setId(UUID.randomUUID().toString());
        patient.name("José Maria");

        Telephone telephone = new Telephone();
        telephone.setId(UUID.randomUUID().toString());
        telephone.number("+55-16-5555-3065");

        patient.addTelephonesItem(telephone);


        try {
            apiInstance.patientsPost(patient);
            System.out.println("Paciente incluído com sucesso!");
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#patientsPost");
            e.printStackTrace();
        }
    }
}
