package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(css="input[id='username']")
	private WebElement untb;
	@FindBy(name="pwd")
	private WebElement pwtb;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	
	 LoginPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);	
	}
	 
	 public void setUsername(String un) {
		 untb.sendKeys(un);
	 }
	 public void setPassword(String pw) {
		 pwtb.sendKeys(pw);
	 } 
	 public void clickLogin() {
		 loginBtn.click();
	 }
}
