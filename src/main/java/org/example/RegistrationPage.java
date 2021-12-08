package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils{

    By _radioButton = By.id("gender-female");
    By _firstName = By.id("FirstName");
    By _lastName = By.id("LastName");
    By _selectDateOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    By _selectBirthOfMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    By _selectBirthOfYear = By.xpath("//select[@name='DateOfBirthYear']");
    By _email = By.id("Email");
    By _newsLetter = By.id("Newsletter");
    By _password = By.xpath("//input[@id='Password']");
    By _confirmPassword = By.id("ConfirmPassword");
    By _registerButton = By.id("register-button");

    public void verifyUserIsOnRegistrationPage(){
        //Verify user is on register page
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }


    public void userEnteringRegistrationDetails(){
        //Click Radio Button
        clickOnElement(_radioButton);
        //type first name
        typeText(_firstName, "Prarthiiii");
        //type LastName
        typeText(_lastName, "Patel");
        //Select Day from DropDown
        selectFromDropDownIndexValue(_selectDateOfBirth, 6);
        //Select Month from DropDown
        selectFromDropDownVisibleText(_selectBirthOfMonth, "September");
        //Select Year from DropDown
        selectFromDropDownVisibleText(_selectBirthOfYear, "1996");
        //type email
        typeText(_email,"Prarthi+" +currentTimeStamp() + "@gmail.com");
        //newsletter
        clickOnElement(_newsLetter);
        //Password
        typeText(_password , "1234test");
        //ConfirmPassword
        typeText(_confirmPassword, "1234test");
        //Click Register Button
        clickOnElement(_registerButton);

    }
}
