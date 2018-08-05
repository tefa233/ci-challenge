package starter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {


    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @When("^I look at main page$")
    public void i_look_at_main_page() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        hisBrowser.get("https://jimmyalvarezcalderon.github.io/");
    }


    @Then("^I should see \"([^\"]*)\" text$")
    public void i_should_see_text(String textInCv) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Invalid Name displayed",
                hisBrowser.findElement(By.xpath("//h1[@class='mb-0']")).getText(), textInCv);
    }

}
