package StepDefinations;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {


	
		@Given("^Facebook homepage is displayed$")
	    public void facebook_homepage_is_displayed() throws Throwable {
	       System.out.println("Facebook homepage displayed");
	    }

		@When("^login in the application with (.+) and (.+) and click login button$")
		public void login_in_the_application_with_and_and_click_login_button(String user, String pwd) throws Throwable {
			System.out.println(user);
			System.out.println(pwd);
		}	 

	    @Then("^home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	        System.out.println("home page displayed");
	    }

	    
	    @Then("^validate (.+) and (.+)$")
	    public void validate_email_and_ji(String name, int ji) {
	        System.out.println(name);
	        System.out.println(ji);
	    }
	    
	    @When("^checking pipepline datattables$")
	    public void checking_pipepline_datattables(DataTable data) throws Throwable {
	        
	    	List<List<String>> obj = data.asLists();
	    	System.out.println(obj.get(0).get(0));
	    }

	    
	  /*  @And("^check {int} as user1 and {float} as password$")
	    public void check_as_user1_and_as_password(int user, float pwd) throws Throwable {
	        System.out.println(user);
	        System.out.println(pwd);
	    }*/
	    
}

