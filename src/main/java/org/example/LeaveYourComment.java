package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LeaveYourComment extends Utils {

    By _commentTitle = By.id("AddNewComment_CommentTitle");
    By _commentText = By.id("AddNewComment_CommentText");
    By _addCommentButton = By.xpath("//button[@class='button-1 news-item-add-comment-button']");

    public void userAbleToEnterDetailsInCommentSection(){
        //adding title to comment section
        typeText(_commentTitle,"GoodFeedback");
        //adding comment in comment box
        typeText(_commentText,"Website is good");
        //click on add comment button
        clickOnElement(_addCommentButton);


    }
}
