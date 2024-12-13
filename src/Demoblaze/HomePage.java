package Demoblaze;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
    WebDriver driver;

    // WebElements
    @FindBy(id = "signin2")
    public WebElement signUpLink;

    @FindBy(id = "login2")
    public WebElement loginLink;

    @FindBy(linkText = "Laptops")
    public WebElement laptopsCategory;

    @FindBy(id = "cartur")
    public WebElement cartLink;

    // Constructor to initialize elements
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void clickSignUp() {
        signUpLink.click();
    }

    public void clickLogin() {
        loginLink.click();
    }

    public void clickLaptopsCategory() {
        laptopsCategory.click();
    }

    public void openCart() {
        cartLink.click();
    }
}
