package Demoblaze;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignUpPage {
	  WebDriver driver;

	    // WebElements
	    @FindBy(id = "sign-username")
	    public WebElement usernameField;

	    @FindBy(id = "sign-password")
	    public WebElement passwordField;

	    @FindBy(css = "button[onclick='register()']")
	    public WebElement registerButton;

	    @FindBy(xpath = "//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']")
	    public WebElement closeButton;

	    // Constructor
	    public SignUpPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Actions
	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickRegister() {
	        registerButton.click();
	    }

	    public void closeSignUpModal() {
	        closeButton.click();
	    }
}
