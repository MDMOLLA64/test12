package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath = "xpath value")
	WebElement backToSchool;
	@FindBy(xpath = "xpath value")
	WebElement JeansSubMenu;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void hoverOverOnBackTOScholl() {
		Helper.MouseOver(driver, backToSchool);
	}
	
	

}
