import com.sun.xml.internal.fastinfoset.util.StringArray;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;


public class stepDefinitions {
    public static WebDriver driver;
    @Given("A person navigate to the url {string}")
    public void a_person_navigate_to_the_url(String string) {
        BaseTest.openBrowser("firefox");
        //driver.navigate().to(string);
       // driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
    }

    @Then("The person should be navigated to Start Page")
    public void the_person_should_be_navigated_to_Start_Page() {
        Assert.assertEquals(BaseTest.trackerPage.nextButton.isDisplayed(), true);
    }


    @When("The person click on Start button")
    public void the_person_click_on_Start_button() throws InterruptedException {
        BaseTest.trackerPage.acceptCookies();
        BaseTest.trackerPage.clickNextBtn();
    }

    @Then("The person select {string} on where-you-live page and click next")
    public void the_person_select_on_where_you_live_page_and_click_next(String string) throws InterruptedException {
        BaseTest.trackerPage.SelectCountryRadioBtn();
        BaseTest.trackerPage.clickNextBtn();
    }

    @Then("The person enter {string} and click next")
    public void the_person_enter_day_and_click_next(String string) throws InterruptedException {
        BaseTest.trackerPage.enterDateOfBirth(string);
        BaseTest.trackerPage.clickNextBtn();
        BaseTest.waitForPageLoad();
    }


    @Then("The person select option {string} on live with partner page and click next")
    public void the_person_select_option_on_live_with_partner_page_and_click_next(String string) throws InterruptedException {
        BaseTest.trackerPage.selectYesOrNoRadio(string);
    }

    @Then("The person select option {string} on claim-benefits-tax-credits page and click next")
    public void the_person_select_option_on_claim_benefits_tax_credits_page_and_click_next(String string) throws InterruptedException {
        BaseTest.trackerPage.selectYesOrNoRadio(string);
    }

    @Given("The person select option {string} on paid-universal-credit page and click next")
    public void the_person_select_option_on_paid_universal_credit_page_and_click_next(String string) throws InterruptedException {
        if(string != null) {
            if (string.equals("YES")) {
                BaseTest.trackerPage.selectYesUniversialCreditsRadioBtn();
            } else if (string.equals("NO")) {
                BaseTest.trackerPage.selectDifferentBenitisRadioBtn();
            } else if (string.equals("NOT YET")) {
                BaseTest.trackerPage.selectUnversialCreditsNotyetAppliedRadioBtn();
            }
            BaseTest.trackerPage.clickNextBtn();
        }
    }
    @Then("The person click next button on  awaiting-universal-credit page")
    public void the_person_click_next_button_on_awaiting_universal_credit_page() throws InterruptedException {
        BaseTest.trackerPage.clickNextBtn();

    }
    @Then("The person select {string} on benefits page and click next")
    public void selectBenefits(String string) throws InterruptedException {
        System.out.println("===>"+string);
        String [] benefits = string.split(",");
        if(benefits[0].equals("NO")) {
            BaseTest.trackerPage.selectNoBenefitChkBx();
        }

        else if(benefits[0].equals("YES")) {
                if(benefits[1].equals("YES")) {
                    BaseTest.trackerPage.selectTaxCreditChkBx();
                }
                if(benefits[2].equals("YES")) {
                    BaseTest.trackerPage.selectIncomeSupportChkBx();
                }
                if(benefits[3].equals("YES")) {
                    BaseTest.trackerPage.selectEmploymentAndSupportAllowanceChkBx();
                }
                if(benefits[4].equals("YES")) {
                    BaseTest.trackerPage.selectJobSeekerAllowanceChkBx();
                }
                if(benefits[5].equals("YES")) {
                    BaseTest.trackerPage.selectPensionCreditChkBx();
                }
        }
        BaseTest.trackerPage.clickNextBtn();
    }

    @Then("The person select option {string} on tax-credit-type page and click next")
    public void selectTaxCreditType(String string) throws InterruptedException {

        if(string != null) {
            if (string.equalsIgnoreCase("WORK AND CHILD TAX")) {
                BaseTest.trackerPage.selectWrngChildTaxCreditRadioBtn();
            } else if (string.equalsIgnoreCase("WORK AND DISABILITY")) {
                BaseTest.trackerPage.selectWrngDisabilityTaxCreditRadioBtn();
            } else if (string.equalsIgnoreCase("CHILD TAX")) {
                BaseTest.trackerPage.selectChildTaxCreditRadioBtn();
            }else if (string.equalsIgnoreCase("WORK TAX")) {
                BaseTest.trackerPage.selectWrngTaxCreditRadioBtn();
            }

            BaseTest.trackerPage.clickNextBtn();
        }
    }
    @Then("The person select option {string} on employment-support-allowance-type page and click next")
    public void the_person_select_option_on_employment_support_allowance_type_page_and_click_next(String string) throws InterruptedException {
        if(string != null) {
            if (string.equalsIgnoreCase("INCOME ESA")) {
                BaseTest.trackerPage.selectIncomeESARadioBtn();
            } else if (string.equalsIgnoreCase("CONTRIBUTE ESA")) {
                BaseTest.trackerPage.selectContributionESARadioBtn();
            }
        }
        BaseTest.trackerPage.clickNextBtn();

    }
    @Then("The person select option {string} on jobseekers-allowance-type page and click next")
    public void the_person_select_option_on_jobseekers_allowance_type_page_and_click_next(String string) throws InterruptedException {
        if(string != null) {
            if (string.equalsIgnoreCase("INCOME JSA")) {
                BaseTest.trackerPage.selectIncomeJobSeekerRadioBtn();
            } else if (string.equalsIgnoreCase("CONTRIBUTE JSA")) {
                BaseTest.trackerPage.selectContributionJobSeekerRadioBtn();
            }
        }
        BaseTest.trackerPage.clickNextBtn();
    }
    @Then("The person select option {string} on tax-credit-income page and click next")
    public void the_person_select_option_on_tax_credit_income_page_and_click_next(String string) throws InterruptedException {
        if(!string.isEmpty()){
            BaseTest.waitFor(3000);
            BaseTest.trackerPage.selectYesOrNoRadio(string);
        }
        else {
            System.out.println("===> Not Applicable <===");
        }
    }

    @Then("The person select option {string} on universal-credit-claim page and click next")
    public void the_person_select_option_on_universal_credit_claim_page_and_click_next(String string) throws InterruptedException {
        if(!string.isEmpty()){
        BaseTest.waitFor(3000);
        BaseTest.trackerPage.selectYesOrNoRadio(string);
        }
        else {
            System.out.println("===> Not Applicable <===");
        }
    }


    @Then("The person select option {string} on universal-credit-take-home-pay page and click next")
    public void the_person_select_option_on_universal_credit_take_home_pay_page_and_click_next(String string) throws InterruptedException {
        if(!string.isEmpty()){
            BaseTest.waitFor(3000);
            BaseTest.trackerPage.selectYesOrNoRadio(string);
        }
        else {
            System.out.println("===> Not Applicable <===");
        }

    }

    @Then("The person select option {string} on pregnant-or-given-birth page and click next")
    public void the_person_select_option_on_pregnant_or_given_birth_page_and_click_next(String string) throws InterruptedException {
        if(!string.isEmpty()){
            BaseTest.waitFor(3000);
            BaseTest.trackerPage.selectYesOrNoRadio(string);
        }
        else {
            System.out.println("===> Not Applicable <===");
        }
    }


    @Then("The person select option {string} on war-pensioner page and click next")
    public void the_person_select_option_on_war_pensioner_page_and_click_next(String string) throws InterruptedException {
        if(!string.isEmpty()){
            BaseTest.waitFor(3000);
            BaseTest.trackerPage.selectYesOrNoRadio(string);
        }
        else {
            System.out.println("===> Not Applicable <===");
        }

    }



    @Then("The person select option {string} on diabetes page and click next")
    public void the_person_select_option_on_diabetes_page_and_click_next(String string) throws InterruptedException {
        if(!string.isEmpty()){
            BaseTest.waitFor(3000);
            BaseTest.trackerPage.selectYesOrNoRadio(string);
        }
        else {
            System.out.println("===> Not Applicable <===");
        }

    }



    @Given("The person select option {string} on glaucoma page and click next")
    public void the_person_select_option_on_glaucoma_page_and_click_next(String string) throws InterruptedException {
        if(!string.isEmpty()){
            BaseTest.waitFor(3000);
            BaseTest.trackerPage.selectYesOrNoRadio(string);
        }
        else {
            System.out.println("===> Not Applicable <===");
        }

    }



    @Given("The person select option {string} on care-home page and click next")
    public void the_person_select_option_on_care_home_page_and_click_next(String string) throws InterruptedException {
        if(!string.isEmpty()){
            BaseTest.waitFor(3000);
            BaseTest.trackerPage.selectYesOrNoRadio(string);
        }
        else {
            System.out.println("===> Not Applicable <===");
        }

    }



    @Given("The person select option {string} on local-council-assessed and click next")
    public void the_person_select_option_on_local_council_assessed_and_click_next(String string) throws InterruptedException {
        if(!string.isEmpty()){
            BaseTest.waitFor(3000);
            BaseTest.trackerPage.selectYesOrNoRadio(string);
        }
        else {
            System.out.println("===> Not Applicable <===");
        }

    }



    @Given("The person select option {string} on savings page and click next")
    public void the_person_select_option_on_savings_page_and_click_next(String string) throws InterruptedException {
        if(!string.isEmpty()){
            BaseTest.waitFor(3000);
            BaseTest.trackerPage.selectYesOrNoRadio(string);
        }
        else {
            System.out.println("===> Not Applicable <===");
        }

    }

    @Then("The person get help with NHS costs")
    public void the_person_get_help_with_NHS_costs() {
       // Assert.assertEquals(BaseTest.trackerPage.DoneMsg.isDisplayed(), true);
    }




}
