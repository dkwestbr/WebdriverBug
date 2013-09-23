package reproduce.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import reproduce.steps.EndUserSteps;

public class ReproduceBugSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the page with a bug")
    public void givenTheUserIsOnTheBugPage() {
        endUser.is_the_home_page();
    }

	/**
	 * TODO: Follow these steps to reproduce...
	 * 
	 * 1. Go to this url in your own browser: http://fiddle.jshell.net/C3VB5/11/show/
	 * 2. Run this test (it will fail)
	 * 3. Put a breakpoint in this method
	 * 4. Run the project in debug mode as a JUnit test, allowing it to hit this break point
	 * 5. Hit the button yourself and notice that no green text shows up
	 * 6. When the browser shows up, hit refresh
	 * 7. Hit play on the debugger
	 * 8. The test now passes
	 * 
	 * If you use the firefox debugger to investigate this issue, add a javascript break
	 * point on the method being fired in the onclick event of the button.  Inside that method,
	 * the "$()" function is called to find an html element to append text to.  If you run 
	 * through the steps again, you will notice that the '$()' function defined on the page
	 * is not being called.  Instead a method is being called which the firefox javascript 
	 * debugger cannot step into.  This method does not have the same behavior and makes
	 * the test behave differently when running through Thucydides than if the test were ran
	 * manually.
	 * 
	 */
    @When("the user hits the button")
    public void whenTheUserHitsTheButton() {
    	endUser.hits_the_button();
    }

    @Then("then green text should show up IF there is no bug")
    public void thenTheyShouldSeeText() {
    	endUser.sees_green_text();
    }

}
