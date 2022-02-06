package com.TaskRuut.Pages;

import com.TaskRuut.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[.=' Apply ']")
    public WebElement applyBtn;


}
