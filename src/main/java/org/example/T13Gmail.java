package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class T13Gmail {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            link.click();
        }

        Thread.sleep(2000);

        driver.quit();
    }
}
