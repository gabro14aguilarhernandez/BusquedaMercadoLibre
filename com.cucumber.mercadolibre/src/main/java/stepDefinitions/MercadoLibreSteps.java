package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import pageObjects.MercadoLibrePage;

public class MercadoLibreSteps {
	private WebDriver driver;
	MercadoLibrePage mercadolibrepage;
	int cantidad;

	@Given("Ingresas al navegador Chrome")
	public void ingresas_al_navegador_Chrome() throws Throwable {
		mercadolibrepage= new MercadoLibrePage(driver);
	    driver=mercadolibrepage.chromeDriverConnection();
	}

	@And("^Entras a la pagina de Mercado libre$")
	public void entras_a_la_pagina_de_Mercado_libre() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		mercadolibrepage.visit("https://www.mercadolibre.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^Selecciona el país de compra$")
	public void selecciona_el_país_de_compra() throws Throwable {
		mercadolibrepage.pais();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Ingresaste desde Mexico al realizar tu compra");
	
	}
	

	@And("^Ingresa y captura el usuario$")
	public void ingresa_y_captura_el_usuario() throws Throwable {
		mercadolibrepage.loginUser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@And("^captura la contraseña y inicia sesion$")
	public void captura_la_contraseña_y_inicia_sesion() throws Throwable {
		mercadolibrepage.loginPass();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^Ingresa el criterio de búsqueda$")
	public void ingresa_el_criterio_de_búsqueda() throws Throwable {
		mercadolibrepage.buscar();
	}

	@And("^Se inicia la busqueda$")
	public void se_inicia_la_busqueda() throws Throwable {
		mercadolibrepage.lupaBusqueda();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	    

	@And("^Se quita el popup de ingrese codigo postal$")
	public void se_quita_el_popup_de_ingrese_codigo_postal() throws Throwable {
	    mercadolibrepage.popupCp();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^Selecciona el producto a comprar del resultado de busqueda$")
	public void selecciona_el_producto_a_comprar_del_resultado_de_busqueda() throws Throwable {
	   	mercadolibrepage.producto();
	    Thread.sleep(1500);
	    
	}

	@And("^Dar clic en cantidad$")
	public void dar_clic_en_cantidad() throws Throwable {

	     Thread.sleep(1000);
	     mercadolibrepage.cantidad();   
	     Thread.sleep(2000);
	}

	@And("^Agregar al carrito de compra$")
	public void agregar_al_carrito_de_compra() throws Throwable {
	 mercadolibrepage.carrito();   
	}

	@And("^Cierras el navegador$")
	public void cierras_el_navegador() throws Throwable {
	    driver.close();
	}
 // se agrega el metodo para agregar la cantidad requerida de productos
	@Then("^Selecciona la cantidad de productos \"([^\"]*)\"$")
	public void selecciona_la_cantidad_de_productos_productos(int cantidad) throws Throwable {
	
		this.cantidad = cantidad;
		System.out.println("La cantidad de productos seleccionados son: " + cantidad );
		mercadolibrepage.cantidadProducto(cantidad);
		
	}	
	
    }
