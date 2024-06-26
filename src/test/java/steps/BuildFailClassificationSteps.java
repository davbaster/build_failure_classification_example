package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class BuildFailClassificationSteps {

    private String buildStatus;

    @Given("I have a Jenkins pipeline")
    public void i_have_a_jenkins_pipeline() {
        // Setup Jenkins pipeline environment (mocked for this example)
    }

    @When("a condition for unstable build is met")
    public void a_condition_for_unstable_build_is_met() {
        // Simulate the condition that makes the build unstable
        buildStatus = "UNSTABLE";
    }

    @When("a condition for build failure is met")
    public void a_condition_for_build_failure_is_met() {
        // Simulate the condition that makes the build fail
        buildStatus = "FAILURE";
    }

    @When("a condition for build abortion is met")
    public void a_condition_for_build_abortion_is_met() {
        // Simulate the condition that makes the build abort
        buildStatus = "ABORTED";
    }

    @Then("the build should be classified as unstable")
    public void the_build_should_be_classified_as_unstable() {
        assertEquals("UNSTABLE", buildStatus);
    }

    @Then("the build should be classified as failed")
    public void the_build_should_be_classified_as_failed() {
        assertEquals("FAILURE", buildStatus);
    }

    @Then("the build should be classified as aborted")
    public void the_build_should_be_classified_as_aborted() {
        assertEquals("ABORTED", buildStatus);
    }
}
