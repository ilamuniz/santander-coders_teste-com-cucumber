package br.ada.helloworldcucumber;

import br.ada.helloworldcucumber.model.Task;
import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Given("I want to register a new task")
    public void iWantToRegisterANewTask() {}

    @Given("I have a task registered")
    public void iHaveATaskRegistered() {}

    @When("I register the task")
    public void iRegisterTheTask() {}

    @When("I edit the task")
    public void iEditTheTask() {}

    @Then("The task is found in database")
    public void theTaskIsFoundInDatabase() {}

    @Then("The task is not found in database")
    public void theTaskIsNotFoundInDatabase() {}

    @And("The response should have status equals {int}")
    public void statusEquals(Integer status) {}

    @And("The task description should be {string}")
    public void descriptionEquals(String description) {}

    @And("The userId should be {string}")
    public void userEquals(String user) {}

    @And("The task status should be {string}")
    public void taskStatusEquals(String taskStatus) {}

    @And("The close date should be found")
    public void closedAt() {}

    @And("The response status is {int}")
    public void responseStatus(Integer status) {}

    @And("The error message should be {string}")
    public void errorMessage(String msg) {}
}
