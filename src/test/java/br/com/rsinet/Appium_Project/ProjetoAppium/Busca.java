package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import br.com.rsinet.Appium_Project.PageObject.BuscaPage;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.AppiumDriver;

public class Busca {
	private static AppiumDriver<?> driver;

	@BeforeClass
	public void beforeMethod() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver(driver);
	}

	@AfterClass
	public void afterMethod() {
		DriverFactory.fechaDriver();
	}

	@Test (priority = 1)
	public void BuscaSucesso() {
		BuscaPage.escolheCategoria(driver).click();
    	BuscaPage.escolheItem(driver).click();
		driver.navigate().back();
		driver.navigate().back();
		
	}

	@Test (priority = 2)
	public void BuscaFalha() {

	}

}
