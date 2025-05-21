package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectoresRobustosUnicos {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        //greenkart
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        WebElement searchInp = driver.findElement(By.xpath("//input[@type='search']"));
        WebElement linkedText = driver.findElement(By.xpath("//a[text()='Career Focussed QA Meetup with Rahul Shetty @Pune - Limited Seats! Book Now!']"));
        WebElement logoText = driver.findElement(By.xpath("//div[@class='brand greenLogo']"));
        WebElement topDeals = driver.findElement(By.xpath("//a[@href='#/offers']"));
        WebElement flightBooking = driver.findElement(By.xpath("//a[text()='Flight Booking']"));





        WebElement cartIcon = driver.findElement(By.cssSelector("a.cart-icon"));
        WebElement searchBtn = driver.findElement(By.cssSelector("button.search-button"));


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement optionOneCheck = driver.findElement(By.cssSelector("input#checkBoxOption1"));
        WebElement iFrameExampleBtn = driver.findElement(By.cssSelector("iframe#courses-iframe"));
        WebElement selectBtn = driver.findElement(By.cssSelector("select#dropdown-class-example"));
        WebElement radioOne = driver.findElement(By.cssSelector("input[value='radio1']"));
        WebElement option = driver.findElement(By.cssSelector("button#openwindow"));
        WebElement blinkingText = driver.findElement(By.cssSelector("a.blinkingText"));
        WebElement logoImg = driver.findElement(By.cssSelector("img.logoClass"));


    }
}


