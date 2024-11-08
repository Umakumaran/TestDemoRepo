package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDTestDemo 
{
	   @Given("I am a manual tester")
	    public void i_am_a_manual_tester() {
	        System.out.println("Given: I am a manual tester");
	    }

	    @When("I apply for new jobs")
	    public void i_apply_for_new_jobs() {
	        System.out.println("When: I apply for new jobs");
	    }

	    @Then("I get less pay")
	    public void i_get_less_pay() {
	        System.out.println("Then: I get less pay");
	    }

	    @And("I am not satisfied with my salary")
	    public void i_am_not_satisfied_with_my_salary() {
	        System.out.println("And: I am not satisfied with my salary");
	    }

	    @But("My parents are satisfied")
	    public void my_parents_are_satisfied() {
	        System.out.println("But: My parents are satisfied");
	    }

}
