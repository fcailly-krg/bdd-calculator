package com.krgcorporate.calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorStepDefinitions {

    private Calculator calculator;

    @Given("I have a Calculator")
    public void i_have_a_calculator() {
        this.calculator = new Calculator();
    }

    @When("I write {double}")
    public void iWrite(double x) {
        this.calculator.write(x);
    }

    @When("I add {double}")
    public void iAdd(double value) {
        this.calculator.add(value);
    }

    @Then("the result should be {double}")
    public void theResultShouldBe(double result) {
        Assert.assertEquals(this.calculator.getResult(), result, 0);
    }

}
