package main.java.goit.https;

import java.io.IOException;
import java.net.URI;

public class HttpDemo {
    private static final String CREATE_USER_URL = "https://jsonplaceholder.typicode.com/users";
    private static final String GET_USER_BY_ID_URL = "https://jsonplaceholder.typicode.com/users";

    public static void main(String[] args) throws IOException, InterruptedException {
        //Create User
        User user = createDefaultUser();
        final User createdUser = HttpUtil.sendPost(URI.create(CREATE_USER_URL), user);

        System.out.println(createdUser);

        //TASK #2
       //final User task2 = HttpUtil.sendGet(URI.create(String.format("%s?id=%d", GET_USER_BY_ID_URL, createdUser.getId())));
       //System.out.println("Task 2 " + task2);
    }

    private static User createDefaultUser() {
        User user = new User();
        user.setId(1);
        user.setName("Oleksii");
        user.setUsername("Maver1k");
        user.setEmail("Byska@gg.net");
        user.setWebsite("Nagibator1488");


        Geo geo = new Geo();
        geo.setLat( -57.1488f);
        geo.setLng( 54.2845f);

        Address address = new Address();
        address.setCity("Kyiv");
        address.setStreet("Pririchna");
        address.setSuite("Xz. 555");
        address.setZipcode("232556-5566");
        address.setGeo(geo);

        Company company = new Company();
        company.setName("Ajax");
        company.setCatchPhrase("Do not release bullshit");
        return user;
    }
}
