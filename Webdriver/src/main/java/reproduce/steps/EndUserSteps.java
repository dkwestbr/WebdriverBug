package reproduce.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import reproduce.pages.BugPage;

import static org.junit.Assert.assertTrue;

public class EndUserSteps extends ScenarioSteps {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BugPage jsfiddlePage;

    public EndUserSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void is_the_home_page() {
        jsfiddlePage.open();
    }
    
    @Step
    public void hits_the_button() {
    	jsfiddlePage.hit_button();
    }
    
    @Step
    public void sees_green_text() {
    	String text = jsfiddlePage.get_text_appended_on_click();
    	assertTrue(text.equals("some text"));
    }
}
