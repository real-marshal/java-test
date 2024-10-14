package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class T14PrevTab {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://reddit.com");

        Thread.sleep(500);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));

        Thread.sleep(500);

        driver.quit();
    }
}
