package br.ada.helloworldcucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    private boolean estouComFome = true;

    @Given("William is hungry")
    public void williamIsHungry() {
        System.out.println("I'm hungry now");
    }

    @When("William eats pasta")
    public void williamEats() {
        estouComFome = false;
        System.out.println("Eating.....");
    }

    @When("William don't eats anything")
    public void williamHungry() {
        estouComFome = true;
    }

    @Then("William will be hungry tonight")
    public void williamWillBeHungry() {
        Assertions.assertTrue(estouComFome);
    }

    @Then("William will be full")
    public void williamWillBeFull() {
        System.out.println("Thanks!!!");
        Assertions.assertFalse(estouComFome);
    }

}
