package reproduce.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://fiddle.jshell.net/C3VB5/11/show/")
public class BugPage extends PageObject {

	@FindBy(id="trigger")
	private WebElement button;
	
	public void hit_button() {
		$(button).click();
	}

    public BugPage(WebDriver driver) {
        super(driver);
    }

	public String get_text_appended_on_click() {
		WebElement div = find(By.xpath("//div[@id=\"append_point\"]"));
		return div.getText() != null ? div.getText() : "";
	}

}