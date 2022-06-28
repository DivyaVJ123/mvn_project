package StepDefinations;

import io.cucumber.java.en.*;

public class Backgroundcucumber {
	@Given("user is checking login")
	public void user_is_checking_login() {
	   System.out.println("checking for test scenarios");
	}

	@When("step1")
	public void step1() {
		 System.out.println("checking for test scenarios1");
	}

	@When("step2")
	public void step2() { 
		System.out.println("checking for test scenarios 12");
	}

	@When("step3")
	public void step3() {
		 System.out.println("checking for test scenarios 2" );
	}

	@When("step4")
	public void step4() {
		 System.out.println("checking for test scenarios 3");
	}


}
