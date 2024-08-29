package lab.subsystem2;

public class CRMService {

    private CRMService() {
    }

    public static void saveCustomer(String name, String postalCode, String city, String state) {
        System.out.println("Customer successfully saved on CRM.");
        System.out.format("Customer Data: [%s, %s, %s, %s]\n\n\n", name, postalCode, city, state);
    }

}
