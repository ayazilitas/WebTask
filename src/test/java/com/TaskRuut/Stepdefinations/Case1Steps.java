package com.TaskRuut.Stepdefinations;

import com.TaskRuut.Pages.TaskPage;
import com.TaskRuut.Utilities.BrowserUtils;
import com.TaskRuut.Utilities.ConfıguratıonReader;
import com.TaskRuut.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Case1Steps extends TaskPage {
TaskPage basePage=new TaskPage();

    @Given("the user go to web page")
    public void theUserGoToWebPage() {
        String url= ConfıguratıonReader.get("url");
        Driver.get().get(url);
    }

         @When("the user clicks the apply button")
          public void the_user_clicks_the_apply_button() {
        basePage.applyBtn.click();
    }

         @Given("the user clicks the {string} button")
         public void the_user_clicks_the_button(String button) {
        BrowserUtils.waitForClickablility(Driver.get().findElement(By.xpath("//label[.=' "+button+" ']")),5);
        Driver.get().findElement(By.xpath("//label[.=' "+button+" ']")).click();
    }

         @Then("the user verify the text {string}")
        public void theUserVerifyTheText(String expectedtext) {

        try{
            BrowserUtils.waitForVisibility(Driver.get().findElement(By.xpath("//span[.='" + expectedtext + "']")),5);
            String actualtext= Driver.get().findElement(By.xpath("//span[.='" + expectedtext + "']")).getText();

            Assert.assertEquals(expectedtext, actualtext);
            if (actualtext.equals("Bikers generate extra income by simply integrating Ruut Smart Screens on their bikes.") || actualtext.equals("Brands and agencies reach audiences via hyper-local, measurable and targeted outdoor campaigns with Ruut Smart Screens.")||actualtext.equals("People generate extra income by purchasing Ruut Smart Screens and having Ruut operate them across its vehicle network.") ||actualtext.equals("Drivers generate extra income by simply integrating Ruut Smart Screens on their cars."))
            {
                System.out.println("Texts are true");
            } else if (!actualtext.equals(expectedtext)) {
                System.out.println(" Text are not  true");
            }

        }catch (Exception e){
            BrowserUtils.waitForVisibility(Driver.get().findElement(By.xpath("//span[.='" + expectedtext + "']")),5);
        }

    }
}
