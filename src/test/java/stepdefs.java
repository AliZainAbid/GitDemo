import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;



class Stepdefs {

    @Given("^today is Sunday$")
    public void today_is_Sunday() throws Exception {
        System.out.println("given print line");
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() throws Exception {
        System.out.println("when print line");
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String arg1) throws Exception {
        System.out.println("then print line");
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

