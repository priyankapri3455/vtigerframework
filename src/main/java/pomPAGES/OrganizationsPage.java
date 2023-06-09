package pomPAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {

	@FindBy (xpath = "//a[@class='hdrLink']")
	private WebElement pageHeader;
	
	@FindBy (xpath = "//img[@title='Create Organization...']")
	private WebElement plusButton;
	
	@FindBy (xpath = "//table[@class='lvt small']/descendant::tr[last()]/td[3]/a")
	private WebElement newOrganization;
	
	public OrganizationsPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickPlusButton() {
		plusButton.click();
	}
	
	public String getNewOrganization() {
		return newOrganization.getText();
	}
}
