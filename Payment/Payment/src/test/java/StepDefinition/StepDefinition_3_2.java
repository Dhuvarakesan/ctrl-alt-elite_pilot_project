package StepDefinition;

import io.cucumber.java.en.Given;

public class StepDefinition_3_2  extends HelperClass{

	@Given("user should click the Payment to system")
	public void user_should_click_the_payment_to_system() {
		HelperClass.precondition();
		HelperClass.login();
		Repository.banking.click();
		Repository.payment_To_System.click();
	}
}
