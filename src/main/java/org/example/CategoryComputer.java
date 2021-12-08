package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.clickOnElement;

public class CategoryComputer extends Utils{

    By _categoryDesktop = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/h2/a");

    public void userShouldBeAbleToClickOnDesktopCategory(){

        //click on desktop
        clickOnElement(_categoryDesktop);


    }

}
