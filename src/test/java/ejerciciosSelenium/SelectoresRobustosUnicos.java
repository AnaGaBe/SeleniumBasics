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

        //XPATH
        WebElement searchInp = driver.findElement(By.xpath("//input[@type='search']"));
        WebElement searchBtn = driver.findElement(By.cssSelector("button.search-button"));
        WebElement linkedText = driver.findElement(By.xpath("//a[text()='Career Focussed QA Meetup with Rahul Shetty @Pune - Limited Seats! Book Now!']"));
        WebElement logoText = driver.findElement(By.xpath("//div[@class='brand greenLogo']"));
        WebElement topDeals = driver.findElement(By.xpath("//a[@href='#/offers']"));
        WebElement flightBooking = driver.findElement(By.xpath("//a[text()='Flight Booking']"));
        WebElement BrocolliImg = driver.findElement(By.xpath("//img[@alt='Brocolli - 1 Kg']"));
        WebElement cartIconByAlt = driver.findElement(By.xpath("//img[@alt='Cart']"));


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //XPATH
        WebElement radio2 = driver.findElement(By.xpath("//label[@for='radio2']"));
        WebElement radio3 = driver.findElement(By.xpath("//label[@for='radio3']"));

        //CSSSELECTOR
        WebElement optionOneCheck = driver.findElement(By.cssSelector("input#checkBoxOption1"));
        WebElement iFrameExampleBtn = driver.findElement(By.cssSelector("iframe#courses-iframe"));
        WebElement selectBtn = driver.findElement(By.cssSelector("select#dropdown-class-example"));
        WebElement radioOne = driver.findElement(By.cssSelector("input[value='radio1']"));
        WebElement option = driver.findElement(By.cssSelector("button#openwindow"));
        WebElement blinkingText = driver.findElement(By.cssSelector("a.blinkingText"));
        WebElement logoImg = driver.findElement(By.cssSelector("img.logoClass"));
        WebElement enterName = driver.findElement(By.cssSelector("input[name='enter-name']"));
        WebElement alertBtn = driver.findElement(By.cssSelector("input[value='Alert']"));
        WebElement confirmBtn = driver.findElement(By.cssSelector("input[value='Confirm']"));

    }
}


