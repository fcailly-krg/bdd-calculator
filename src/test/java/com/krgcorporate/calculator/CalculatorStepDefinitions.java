package com.krgcorporate.calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CalculatorStepDefinitions {

    private Calculator calculator;

    @Given("I have a Calculator")
    public void i_have_a_calculator() {
        this.calculator = new Calculator();
    }

    @Given("The current result is {double}")
    public void theCurrentResultIs(double value) {
        this.calculator.setResult(value);
    }

    @Then("the result should be {double}")
    public void theResultShouldBe(double result) {
        Assert.assertEquals(this.calculator.getResult(), result, 0);
    }

}
