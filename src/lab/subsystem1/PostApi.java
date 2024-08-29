package lab.subsystem1;

public class PostApi {

    private PostApi(){}

    private static final PostApi instance = new PostApi();

    public static PostApi getInstance() {
        return instance;
    }

    public String findCity(String postalCode) {
        return "Belo Horizonte";
    }

    public String findState(String postalCode) {
        return "MG";
    }
}
