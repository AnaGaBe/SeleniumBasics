package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class EjercicioLocalizacionDeElementos
{
    public static void main( String[] args )
    {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Buscar por id
        WebElement openWindowsBtn = driver.findElement(By.id("openwindow"));
        WebElement openTabBtn = driver.findElement(By.id("opentab"));
        WebElement enterYourNameInp = driver.findElement(By.id("name"));
        WebElement alertBtn= driver.findElement(By.id("alertbtn"));
        WebElement confirmBtn = driver.findElement(By.id("confirmbtn"));
        WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        WebElement hideShowExample = driver.findElement(By.id("displayed-text"));

        //Buscar por Name
        WebElement enterYourName = driver.findElement(By.name("enter-name"));
        WebElement hideShow = driver.findElement(By.name("show-hide"));

        //Buscar por Classname
        WebElement  radio1Inp= driver.findElement(By.className("radioButton"));
        WebElement  radio2Inp= driver.findElement(By.className("radioButton"));
        WebElement  radio3Inp= driver.findElement(By.className("radioButton"));

        //Buscar por Link Text o Partial Link Text
        WebElement  qAMeetup= driver.findElement(By.partialLinkText("QA Meetup with Rahul Shetty"));
        WebElement  restApi= driver.findElement(By.partialLinkText("REST API"));
        WebElement  brokenLink= driver.findElement(By.partialLinkText("Broken Link"));






    }
}
