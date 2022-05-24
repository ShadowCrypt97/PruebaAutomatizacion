package pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://computer-database.gatling.io/computers")
public class PaginaUrl extends PageObject {

    @FindBy(xpath = "//a[@id='add']")
    public WebElementFacade addNewPc;

    @FindBy(xpath = "//input[@id='name']")
    public WebElementFacade pcName;

    @FindBy(xpath = "//input[@id='introduced']")
    public WebElementFacade introducedDate;

    @FindBy(xpath = "//input[@id='discontinued']")
    public WebElementFacade discontinuedDate;

    @FindBy(xpath = "//select[@id='company']")
    public WebElementFacade company;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElementFacade btnSubmit;

    @FindBy(xpath = "//a[contains(text(),'ASUS')]")
    public WebElementFacade registroCreado;
}
