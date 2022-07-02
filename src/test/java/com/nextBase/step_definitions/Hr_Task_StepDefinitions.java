package com.nextBase.step_definitions;

import com.nextBase.pages.HrTaskPage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hr_Task_StepDefinitions {
    HrTaskPage hrTaskPage = new HrTaskPage();


    @Given("User is on home page")
    public void userIsOnHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextBase.url"));
        hrTaskPage.usernameInput.sendKeys(ConfigurationReader.getProperty("hr.username"));
        hrTaskPage.passwordInput.sendKeys(ConfigurationReader.getProperty("hr.password"));
        hrTaskPage.loginButton.click();

    }


    @Given("User clicks Tasks button on the home page")
    public void userClicksTasksButtonOnTheHomePage() {
        hrTaskPage.taskButton.click();

    }

    @When("User verifya  display task page")
    public void userVerifyaDisplayTaskPage() {
        String expectedContainUrl = "tasks";
        Assert.assertTrue(expectedContainUrl, Driver.getDriver().getCurrentUrl().contains("tasks"));

    }

    @And("User clicks All button")
    public void userClicksAllButton() {
        hrTaskPage.allButton.click();
    }

    @Then("User sees tasks  is on the task page")
    public void userSeesTasksIsOnTheTaskPage() {
        String allTaskContainsUrl = "SECTION=ADVANCED";
        Assert.assertTrue(allTaskContainsUrl, Driver.getDriver().getCurrentUrl().contains("SECTION=ADVANCED"));
    }

    @And("User clicks Ongoing button")
    public void userClicksOngoingButton() {
        hrTaskPage.ongoingButton.click();

    }

    @Then("User sees Role:ongoing   on the ongoing task page")
    public void userSeesRoleOngoingOnTheOngoingTaskPage() {
        String expectedOngoing = "Role: Ongoing";
        String actualOngoing = hrTaskPage.roleOngoing.getText();
        Assert.assertEquals(expectedOngoing, actualOngoing);
    }

    @And("User clicks NEW TASK button")
    public void userClicksNEWTASKButton() {
        hrTaskPage.newTAskButton.click();


    }

    @And("User displays new task page")
    public void userDisplaysNewTaskPage() {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='side-panel-iframe']")));
        //System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        String expectedContainsUrl = "task/edit";
        Assert.assertTrue(expectedContainsUrl, Driver.getDriver().getCurrentUrl().contains("task/edit"));
        // Driver.getDriver().switchTo().defaultContent();


    }

    @And("user clicks on header  and types {string}.")
    public void userClicksOnHeaderAndTypes(String newTask) {
        //Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@name='iframe_leqhkocdxk']")));
        // hrTaskPage.thingsToDo.click();
        hrTaskPage.thingsToDo.sendKeys(newTask, Keys.ENTER);


    }

    @And("user clicks Text area and types {string}")
    public void userClicksTextAreaAndTypes(String arg0) {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        hrTaskPage.textArea.click();
        hrTaskPage.textArea.sendKeys(arg0);
        Driver.getDriver().switchTo().parentFrame();

    }

    @And("User clicks Deadline dropdown menu")
    public void userClicksDeadlineDropdownMenu() {

        hrTaskPage.deadline.click();


    }
    @And("User select {string} date")
    public void userSelectDate(String arg0) {
       hrTaskPage.days.click();
    }

    @And("User clicks Project menu")
    public void userClicksProjectMenu()  {
        hrTaskPage.selectButton.click();

    }
    @And("User clicks more menu")
    public void userClicksMoreMenu() {
        hrTaskPage.clickMore.click();
        hrTaskPage.projectAddButton.click();
    }

    @And("User clicks Soccer team")
    public void userClicksSoccerTeam() {
        hrTaskPage.soccerTeam.click();


    }

    @And("User clicks ADD TASK button")
    public void userClicksADDTASKButton() {
        hrTaskPage.addTaskEnter.click();
        Driver.getDriver().switchTo().defaultContent();
    }


    @Then("User sees New Task on the task page")
    public void userSeesNewTaskOnTheTaskPage() {
        String expectedAttribute="tasks-grid-group-link";


       Assert.assertTrue(expectedAttribute,hrTaskPage.underSoccerTeamCreatedTask.getAttribute("class").contains("tasks-grid-group-link"));
    }
}
