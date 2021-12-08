package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailAFriend extends Utils {
    By _friendEmail = By.id("FriendEmail");
    By _personalMessage = By.id("PersonalMessage");
    By _sendEmail = By.xpath("//button[@class=\"button-1 send-email-a-friend-button\"]");

    public void verifyRegisteredUserCanReferAProductToFriend(){
        //Input Friends Email
        typeText(_friendEmail,"Prarthi+" +currentTimeStamp() + "@gmail.com");
        //Input your email address
        // typeText(By.id("YourEmailAddress"),"prarthizalava@gmail.com");
        //Input Personal Message
        typeText(_personalMessage,"Awesome Product!!!");
        //click send email Button
        clickOnElement(_sendEmail);
        // Verifying the message sent success
        String actualRegisterCompletionMessage = getTextFromElement(By.xpath("//div[@class=\"page email-a-friend-page\"]/div[2]/div[2]"));
        String expectedRegisterCompletedMessage = "Your message has been sent.";
        Assert.assertTrue(actualRegisterCompletionMessage.equals(expectedRegisterCompletedMessage));

    }
}
