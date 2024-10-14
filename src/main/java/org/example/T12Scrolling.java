package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T12Scrolling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://reddit.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, 500)");
        Thread.sleep(1000);

        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(1000);

        driver.quit();
    }
}
