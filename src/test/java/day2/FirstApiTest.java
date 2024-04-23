package day2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class FirstApiTest {
    /*
        Given Send GET request to https://reqres.in/api/users?page=2
        Then print status code
        And print status line
         */

    @Test
    public void test01(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.statusCode());
        System.out.println(response.statusLine());
    }
}
