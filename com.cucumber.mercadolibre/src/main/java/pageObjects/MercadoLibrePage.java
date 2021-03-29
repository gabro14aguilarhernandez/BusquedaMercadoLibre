package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;



public class MercadoLibrePage extends Base{

	
	int cantidadd;

    By mexico = By.cssSelector("#MX");
    By cuadroBusqueda = By.cssSelector("body > header > div > form > input");
    By lupa = By.cssSelector("body > header > div > form > button");
    By popUpIngresaCP = By.cssSelector("body > div.onboarding-cp > div > div > div.andes-tooltip-inner > div > span");
    By ingresa = By.cssSelector("#nav-header-menu > a:nth-child(2)");
    By usuario = By.id("user_id");
    By continuar = By.cssSelector("#login_user_form > div.login-form__actions > button");
    By contraseña = By.id("password"); 
    By ingresar = By.id("action-complete");
    By playcinco = By.cssSelector("#root-app > div > div.ui-search-main.ui-search-main--exhibitor.ui-search-main--only-products > section > ol > li:nth-child(1) > div > div > div.ui-search-result__content-wrapper > div.ui-search-item__group.ui-search-item__group--title > a.ui-search-item__group__element.ui-search-link > h2");
    By piezas = By.cssSelector("#root-app > div.ui-pdp > div.ui-pdp-container.ui-pdp-container--pdp > div.ui-pdp-container__row.ui-pdp--relative.ui-pdp-with--separator--fluid.pb-40 > div.ui-pdp-container__col.col-1.ui-pdp-container--column-right.mt-16.pr-16 > div:nth-child(1) > form > div.ui-pdp-buybox__quantity.mb-20 > div.andes-tooltip__trigger > div > button > span");   
    By unapieza = By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div[2]/div/div[3]/div/ul/li[1]/button");
    By dospiezas = By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div[2]/div/div[3]/div/ul/li[2]/button");
    By trespiezas = By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div[2]/div/div[3]/div/ul/li[3]/button");
    By cuatropiezas = By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div[2]/div/div[3]/div/ul/li[4]/button");   
    By agregarcarrito = By.cssSelector("#root-app > div.ui-pdp > div.ui-pdp-container.ui-pdp-container--pdp > div.ui-pdp-container__row.ui-pdp--relative.ui-pdp-with--separator--fluid.pb-40 > div.ui-pdp-container__col.col-1.ui-pdp-container--column-right.mt-16.pr-16 > div:nth-child(1) > form > div.ui-pdp-actions > div > button.andes-button.andes-button--quiet");
    By botonentendido = By.id("cookieDisclaimerButton");
    //    By etiquetaProducto = By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[1]/div/div/div[2]/div[2]/a[1]/h2");

    public MercadoLibrePage(WebDriver driver) {
        super(driver);
    }

    public void loginUser() throws InterruptedException {
    	click(ingresa);
    	type("mendrano254@hotmail.com",usuario);
    	Thread.sleep(1500);
    	click(continuar);
    	    	
    }
    
    public void loginPass() throws InterruptedException {
    	    	
    	type("A1s2d3f4g5.",contraseña);
    	click(ingresar);
    	esperaMientras(botonentendido);
        String nombot = getText(botonentendido);
        System.out.println("el mensaje si salio y es:" + nombot);
       
    	}
    
    public void pais (){
        click(mexico); 
    }

    public void popupCp (){
        click(popUpIngresaCP); 
    }
    public void buscar(){
        type("PlayStation5",cuadroBusqueda);
        
    }

    public void lupaBusqueda(){
        click(lupa);
    }
    
    public void producto() {
    	String productoSeleccionado = getText(playcinco);
    	System.out.print(productoSeleccionado);
    	click(playcinco);
    }
    public void cantidad () {
    	click(piezas);
    	System.out.println(playcinco);
    }
    
    public void tresp() {
    	click(trespiezas);  	
    }
    
    public void cuatrop() {
    	click(cuatropiezas);
    }

    public void cantidadProducto(int cantidad) {
    	
    	this.cantidadd = cantidad;
    	
    	if (cantidadd == 1) { click(unapieza);
			
		} else click(dospiezas);

    }
    
    
    public void carrito () {
    	
    	click(agregarcarrito);
    }


}
