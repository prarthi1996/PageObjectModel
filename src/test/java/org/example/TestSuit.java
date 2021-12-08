package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    CategoryComputer categoryComputer = new CategoryComputer();
    SubCategoryDesktop subCategoryDesktop = new SubCategoryDesktop();
    BuildComputerSubCategory buildComputerSubCategory = new BuildComputerSubCategory();
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
    ReferAProductEmailSuccessVerification referAProductEmailSuccessVerification = new ReferAProductEmailSuccessVerification();
    News news = new News();
    LeaveYourComment leaveYourComment = new LeaveYourComment();
    NewsMessageSentSuccess newsMessageSentSuccess = new NewsMessageSentSuccess();

    @Test
    public void userShouldBeAbleToRegisterSuccessfully()
    {
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegistrationPage();
        registrationPage.userEnteringRegistrationDetails();
        registerSuccessPage.userHasRegisteredSuccessfully();
    }

    @Test

    public void userShouldBeAbleToNavigateToSubCategoryDesktops()
    {
        homePage.clickOnComputersCategory();
        categoryComputer.userShouldBeAbleToClickOnDesktopCategory();
        subCategoryDesktop.verifyUserIsOnDesktopPage();
    }

    @Test

    public void userShouldBeAbleToReferAProductToFriend()
    {
        userShouldBeAbleToRegisterSuccessfully();
        homePage.clickOnComputersCategory();
        categoryComputer.userShouldBeAbleToClickOnDesktopCategory();
        subCategoryDesktop.userShouldBeAbleToClickOnAddToCartButton();
        buildComputerSubCategory.userShouldBeAbleClickOnEmailAFriendButton();
        productEmailAFriend.verifyRegisteredUserCanReferAProductToFriend();
        referAProductEmailSuccessVerification.userHasSuccessfullySentMessageToFriend();
    }

    @Test

    public void  userShouldBeAbleToAddAComment()
    {
        homePage.clickOnNewsButton();
        news.clickOnDetailsPage();
        leaveYourComment.userAbleToEnterDetailsInCommentSection();
        newsMessageSentSuccess.verifyUserHasAddedAComment();
    }
}