package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        setDriver(driver);
        driver.get("https://www.demoblaze.com");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(id = "signin2")
    WebElement signUpLink;

    @FindBy(id = "login2")
    WebElement loginLink;

    @FindBy(xpath = "//a[contains(text(),'Welcome')]")
    WebElement welcomeUser;

    public HomePage waitWelcome() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(welcomeUser));
        return this;
    }

    public RegistrationPage clickSignUpLink() {
        signUpLink.click();
        return new RegistrationPage(driver);
    }

    public LoginPage clicLoginLink() {
        loginLink.click();
        return new LoginPage(driver);
    }

}
