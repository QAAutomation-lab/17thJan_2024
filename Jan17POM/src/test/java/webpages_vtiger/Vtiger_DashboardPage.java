package webpages_vtiger;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vtiger_DashboardPage {

	/*
	 * 
	 * UserProfile
	 * Signout
	 * Navigation Pannel(left to Vtiger logo)
	 * Marketing
	 * Leads
	 * 
	 */	
	@FindBy(xpath="//ul[@aria-labelledby='MARKETING_modules_dropdownMenu']//li/a/span[2]")
	private List<WebElement> marketingSubMenus;
}
