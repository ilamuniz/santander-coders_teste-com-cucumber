package br.ada.helloworldcucumber;

import br.ada.helloworldcucumber.model.Task;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ScheduleStepDefinition {

    private Gson gson = new Gson();
    private Task task = null;
    private RequestSpecification request = RestAssured.given()
            .baseUri("http://localhost:8080/api")
            .contentType(ContentType.JSON);
    private Response response;

}
