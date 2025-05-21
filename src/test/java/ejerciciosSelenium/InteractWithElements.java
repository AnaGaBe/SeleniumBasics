package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get ("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        //1.Ejemplo del click
        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        showBtn.click();
        //2.BuscarShow Button
        WebElement hideBtn = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
        //3.Dar click en el boton show
        showBtn.click();
        //4.Dar click en el boton hide
        hideBtn.click();
        //5.Dar click en el boton show
        showBtn.click();
        //6.Dar click en el boton hide
        hideBtn.click();

        //Ejemplo de sendKeys()
        //1. Buscar Elemento
        WebElement countryTxtbtn = driver.findElement(By.id("autocomplete"));

        //2.Ecribir usando sendKeys
        countryTxtbtn.sendKeys("Mexico");
        WebElement nameTxtbx = driver.findElement(By.id("name"));
        nameTxtbx.sendKeys("Anahi Galindo");

        Thread.sleep(1000);

        //3.Borrar los text box
        countryTxtbtn.clear();
        nameTxtbx.clear();

        //COMANDOS GET
        //getTitle()- Traer el titulo de la pagina

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //getText()
        //1.Encontarr el elemento
        WebElement radioBtnLbl = driver.findElement(By.xpath("<legend>Radio Button Example</legend>"));
        //System.out.println(radioBtnLbl());

        WebElement hideshowTxtbtx = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println("El estatus del textbox isDisplayed es:" + hideshowTxtbtx.isDisplayed());
        System.out.println("Ahora el estatus del textbox isDisplayed es:"+hideshowTxtbtx.isDisplayed());

        //Buscar el radiobutton 1

        //Dar click en el radiobutton1, Verificar si si esta checked con el comando "isSelected()" e imorimir el status
        WebElement radio1 = driver.findElement(By.xpath("//label[@for='radio1']/input"));
        System.out.println("El radio boton  esta:" + radio1.isSelected());
        radio1.click();
        System.out.println("El radio boton  esta:" + radio1.isSelected());

        //Repetimos para los checkbox quiero que seleccione la segunda opcion "Option2"
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        System.out.println("El radio boton  esta:" + checkBox.isSelected());
        radio1.click();
        System.out.println("El radio boton  esta:" + checkBox.isSelected());
        checkBox.click();
        System.out.println("El radio boton  esta:" + checkBox.isSelected());

        Thread.sleep(5000);
        driver.quit();

        //Dar click a radio 3 y que el primero se desabilito que es falso

     //Y en el chekckbox que este habilitado
    }
}
