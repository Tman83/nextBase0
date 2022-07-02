package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrTaskPage extends LoginPage {


    public HrTaskPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[2]")
    public WebElement taskButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[1]")
    public WebElement allButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement ongoingButton;


    @FindBy(xpath = "(//div[@class=\"main-ui-square-item\"])[2]")
    public WebElement roleOngoing;

    @FindBy(xpath = "//a[@id='tasks-buttonAdd']")
    public WebElement newTAskButton;

    @FindBy(xpath = "//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement newTaskPage;

    @FindBy(xpath = "//iframe[@class='side-panel-iframe']")
    public WebElement newTaskPageIframe;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement thingsToDo;


    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement textArea;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement textAreaIframe;


    @FindBy(xpath = "(//input[@data-bx-id=\"datepicker-display\"])[1]")
    public WebElement deadline;


    @FindBy(xpath = "//div[@class='bx-calendar-month-content'] //span")
    public WebElement months;

    @FindBy(xpath = " //a[@data-date='1657411200000']")
    public WebElement days;

    @FindBy(xpath = "(//span[@class=\"bx-calendar-button-text\"])[1]")
    public WebElement selectButton;


    @FindBy(xpath = "//div[@class='task-additional-alt-more']")
    public WebElement clickMore;


    @FindBy(xpath = "(//a[@href='javascript:void(0);'])[10]")
    public WebElement projectAddButton;



    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public WebElement soccerTeam;


    @FindBy(xpath = "//span[@data-bx-id='task-edit-cmd']")
    public WebElement addTaskEnter;

    @FindBy(className = "tasks-grid-group-link")
    public WebElement underSoccerTeamCreatedTask;















}
