package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TrackerPage {
    WebDriver driver;

    @FindBy(id="next-button")
    public WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"radio-wales\"]")
    public WebElement country;

    @FindBy(id="dob-day")
    public WebElement enterDay;

    @FindBy(id="dob-month")
    public WebElement enterMonth;

    @FindBy(id="dob-year")
    public WebElement enterYear;

    @FindBy(id="radio-yes")
    public WebElement yesRadioButton;

    @FindBy(id="radio-no")
    public WebElement noRadioButton;

    @FindBy(id="yes-universal")
    public WebElement yesUniversalCredit;

    @FindBy(id="not-yet")
    public WebElement CreditsnotyetApplied;

    @FindBy(id="different-benefit")
    public WebElement differentBenefits;

    @FindBy(id="taxCredit")
    public WebElement taxCreditCheckBox;

    @FindBy(id="incSupport")
    public WebElement incomeSupportCheckBox;

    @FindBy(id="esa")
    public WebElement employmentAndSupportAllowanceCheckBox;

    @FindBy(id="jsa")
    public WebElement jobSeekerAllowanceCheckBox;

    @FindBy(id="penCredit")
    public WebElement pensionCreditCheckBox;

    @FindBy(id="continue")
    public WebElement noBenefitCheckBox;

    @FindBy(id="workingChildTaxCredit")
    public WebElement workingChildTaxCreditRadioButton;

    @FindBy(id="workingDisabilityTaxCredit")
    public WebElement workingDisabilityTaxCreditRadioButton;

    @FindBy(id="childTaxCredit")
    public WebElement childTaxCreditRadioButton;

    @FindBy(id="workingTaxCredit")
    public WebElement workingTaxCreditRadioButton;

    @FindBy(id="income-esa")
    public WebElement incomeESARadioButton;

    @FindBy(id="contribution-esa")
    public WebElement contributionESARadioButton;

    @FindBy(id="income-jsa")
    public WebElement incomeJobSeekerRadioButton;

    @FindBy(id="contbasejsa")
    public WebElement contributionJobSeekerRadioButton;

    @FindBy(id="guaranteecreditonly")
    public WebElement guaranteeCreditOnlyRadioButton;

    @FindBy(id="guaranteecreditwithsavingcredit")
    public WebElement guaranteeCreditWithSavingCreditRadioButton;

    @FindBy(id="savingcredit")
    public WebElement savingCreditRadioButton;

    @FindBy(id="nhsuk-cookie-banner__link_accept_analytics")
    public WebElement acceptCookiesBtn;

    @FindBy(xpath="//h1[@class='heading-xlarge done-panel']")
    public WebElement DoneMsg;

    public TrackerPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void acceptCookies() throws InterruptedException {
        acceptCookiesBtn.click();
        Thread.sleep(1000);
    }
    public void applyJavaScriptExecutor(WebElement executor)
    {
        JavascriptExecutor ctryexecutor = (JavascriptExecutor)driver;
        ctryexecutor.executeScript("arguments[0].click()",executor);
    }

    public void clickNextBtn() throws InterruptedException {
        WebDriverWait waitlink=new WebDriverWait(driver,30);
        waitlink.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }
    public void SelectCountryRadioBtn()
    {
        applyJavaScriptExecutor(country);
    }

     public void enterDateOfBirth(String string)
     {
         String [] dob = string.split("-");
         enterDay.sendKeys(dob[0]);
         enterMonth.sendKeys(dob[1]);
         enterYear.sendKeys(dob[2]);
     }
     public void selectYesRadioBtn()
     {
         applyJavaScriptExecutor(yesRadioButton);
     }
    public void selectNoRadioBtn()
    {
        applyJavaScriptExecutor(noRadioButton);
    }
    public void selectYesUniversialCreditsRadioBtn()
    {
        applyJavaScriptExecutor(yesUniversalCredit);
    }
    public void selectUnversialCreditsNotyetAppliedRadioBtn()
    {
        applyJavaScriptExecutor(CreditsnotyetApplied);
    }
    public void selectDifferentBenitisRadioBtn()
    {
        applyJavaScriptExecutor(differentBenefits);

    }

   public void selectWrngChildTaxCreditRadioBtn()
   {
       applyJavaScriptExecutor(workingChildTaxCreditRadioButton);

   }
    public void selectWrngDisabilityTaxCreditRadioBtn()
    {
        applyJavaScriptExecutor(workingDisabilityTaxCreditRadioButton);

    }
    public void selectChildTaxCreditRadioBtn()
    {
        applyJavaScriptExecutor(childTaxCreditRadioButton);

    }
    public void selectWrngTaxCreditRadioBtn()
    {
        applyJavaScriptExecutor(workingTaxCreditRadioButton);

    }
    public void selectIncomeESARadioBtn()
    {
        applyJavaScriptExecutor(incomeESARadioButton);

    }
    public void selectContributionESARadioBtn()
    {
        applyJavaScriptExecutor(contributionESARadioButton);

    }
    public void selectIncomeJobSeekerRadioBtn()
    {
        applyJavaScriptExecutor(incomeJobSeekerRadioButton);

    }
    public void selectContributionJobSeekerRadioBtn()
    {
        applyJavaScriptExecutor(contributionJobSeekerRadioButton);

    }
    public void selectGuaranteeCreditOnlyRadioBtn()
    {
        applyJavaScriptExecutor(guaranteeCreditOnlyRadioButton);

    }
    public void selectGuaranteeCreditWithSavingCreditRadioBtn()
    {
        applyJavaScriptExecutor(guaranteeCreditWithSavingCreditRadioButton);

    }
    public void selectSavingCreditRadioBtn()
    {
        applyJavaScriptExecutor(savingCreditRadioButton);

    }
    public void selectTaxCreditChkBx()
    {
        applyJavaScriptExecutor(taxCreditCheckBox);

    }
    public void selectIncomeSupportChkBx()
    {
        applyJavaScriptExecutor(incomeSupportCheckBox);

    }
    public void selectEmploymentAndSupportAllowanceChkBx()
    {
        applyJavaScriptExecutor(employmentAndSupportAllowanceCheckBox);

    }

    public void selectJobSeekerAllowanceChkBx()
    {
        applyJavaScriptExecutor(jobSeekerAllowanceCheckBox);

    }
    public void selectPensionCreditChkBx()
    {
        applyJavaScriptExecutor(pensionCreditCheckBox);

    }
    public void selectNoBenefitChkBx()
    {
        applyJavaScriptExecutor(noBenefitCheckBox);

    }

    public void selectYesOrNoRadio(String string) throws InterruptedException {
        if (string.equalsIgnoreCase("YES")){
            System.out.println("===> live_with_partner selecting Yes");
            selectYesRadioBtn();
        } else if (string.equalsIgnoreCase("NO")){
            selectNoRadioBtn();
        }
        clickNextBtn();
        driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
    }

}
