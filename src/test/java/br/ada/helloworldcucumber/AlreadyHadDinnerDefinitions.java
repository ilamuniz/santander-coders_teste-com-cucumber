package br.ada.helloworldcucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AlreadyHadDinnerDefinitions {

    private String dessert;
    private boolean amISad = false;

    @Given("After eat my dinner")
    public void afterDinner() {

    }

    @When("I find my dessert")
    public void findMyDessert() {
    }

    @And("I found {string}")
    public void foundDessert(String dessert) {
        this.dessert = dessert;
        System.out.println("I will eat " + dessert);
    }

    @And("I open pot and the content was {string}")
    public void content(String content) {
        System.out.println("I found " + content);
        if (content.equalsIgnoreCase("ice cream")) {
            amISad = false;
        } else {
            amISad = true;
        }
    }

    @Then("I aet {string}")
    public void iAetIceCream(String dessert) {
        Assertions.assertEquals(dessert, this.dessert);
    }

    @Then("I'm very sad now")
    public void iamSad() {
        Assertions.assertTrue(amISad);
        System.out.println("I'm very sad");
    }

    @Then("I'm very happy now")
    public void iamHappy() {
        Assertions.assertFalse(amISad);
        System.out.println("I'm very happy");
    }

}
