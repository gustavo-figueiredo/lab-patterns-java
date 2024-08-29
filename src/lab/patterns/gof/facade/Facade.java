package lab.patterns.gof.facade;

import lab.subsystem1.PostApi;
import lab.subsystem2.CRMService;

public class Facade {

    public void migrateCustomer(String name, String postalCode) {
        String city = PostApi.getInstance().findCity(postalCode);
        String state = PostApi.getInstance().findState(postalCode);

        CRMService.saveCustomer(name, postalCode, city, state);
    }
    
}
