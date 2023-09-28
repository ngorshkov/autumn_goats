package be.someTests;

import io.restassured.http.ContentType;
import models.UserModel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class BuilderTest {

    @Test
    public void buiderTest() {
        //построенние модели запроса
        UserModel user1 = UserModel.builder()
                .age(20)
                .salary(100000)
                .sex("male")
                .password("password")
                .isDeath(true)
                .username("debil").build();


        UserModel user2 = UserModel.builder()
                .sex("famale")
                .password("password")
                .isDeath(false).build();

        System.out.println(user1);
        System.out.println(user2);

        //запрос с построенной моделью
        given().auth().oauth2("string")
                .contentType(ContentType.JSON)
                .body(user1);
    }
}
