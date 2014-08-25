package me.paulobsf.cucutests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloCucumberStepDefinitions {
    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int nCukes) throws Throwable {
        assertThat(nCukes, is(equalTo(42)));
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int nHours) throws Throwable {
        assertThat(nHours, is(equalTo(1)));
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        assertThat("a growl", startsWith("a"));
    }
}
