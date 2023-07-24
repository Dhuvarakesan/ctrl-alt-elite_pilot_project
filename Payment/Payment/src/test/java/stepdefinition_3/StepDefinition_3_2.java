package stepdefinition_3;

import io.cucumber.java.en.Given;
import repository.Payment_Repository_3;

public class StepDefinition_3_2  extends HelperClass{

	@Given("user should click the Payment to system")
	public void user_should_click_the_payment_to_system() {
		HelperClass.precondition();
		HelperClass.login();
		Payment_Repository_3.banking.click();
		Payment_Repository_3.payment_To_System.click();
	}
}
