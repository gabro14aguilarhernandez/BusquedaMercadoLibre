package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	private WebDriver driver;  // Objeto Webdriver
    //Constructor de la clase  como objeto "web driver"
    public Base (WebDriver driver){
        this.driver = driver;
    }

    // se crea un metodo para lo conexion con chrome
    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hitss\\eclipse-workspace\\mercadolibre.busqueda\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
    // metodo para crear unenvoltorio al rededor de los comandos de Selenium
    public WebElement findElement(By locator) {

        return driver.findElement(locator);
    }
    // Metodo para extraer lista de elementos
    //  Public List<WebElement> findElement(By locator){
    //     return driver.findElements(locator);
    //      }
    // este metodo devuelve el texto del elemento que te esta pasando como parametro
    public String getText (WebElement element){

        return element.getText();
    }

    // este metodo devuelve el texto que estamos buscando atravez de ese localizador

    public String getText (By locator){

        return driver.findElement(locator).getText();
    }
    
	
    public void esperaMientras(By locator){
    	WebDriverWait esperaMenuPricipal = new WebDriverWait(driver,600);
        esperaMenuPricipal.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    
    // este metodo sirve para escribir texto

    public void type(String inputText, By locator){

        driver.findElement(locator).sendKeys(inputText);
    }

    //Metodo Click
    public void click(By locator){

        driver.findElement(locator).click();
    }


/*        // Est emetodo nos dice si el elemento se encuentra listo para ser utilizado
       public Boolean isDisplayed() {
               try {
                   return driver.findElement(locator).isDisplayed();

               } catch (org.openqa.selenium.NoSuchElementException e) {
                   return false;
               }
       } */
   
    //Metodo encargado de recibir la URL y de abrir la pagina
   
    public void visit(String URL){
        driver.get(URL);
    }




}
