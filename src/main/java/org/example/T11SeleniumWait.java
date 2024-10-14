package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T11SeleniumWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        driver.get("https://google.com");

        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("div[aria-label=\"Before you continue to Google Search\"]")));

        System.out.println(element.getText());

        driver.quit();
    }
}
