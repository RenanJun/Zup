package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagazineLuiza {
	
	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Renan Jun\\Documents\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.magazineluiza.com.br/");
		Thread.sleep(5000);
		WebElement inputProduto = driver.findElement(By.xpath("//input[@id = 'inpHeaderSearch'][1]"));
		inputProduto.sendKeys("galaxy s20");
		
		WebElement pesquisar = driver.findElement(By.xpath("//span[@id= 'btnHeaderSearch']"));
		pesquisar.click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//h1//strong[contains(text(), 'galaxy s20')]")).getText().equals("galaxy 20");
		
		Thread.sleep(5000);
		WebElement produto = driver.findElement(By.xpath("//li[@id = 'nm-product-155577200']"));
		produto.click();
		
		Thread.sleep(5000);
		WebElement adicionar = driver.findElement(By.xpath("//button[@class = 'button__buy button__buy-product-detail js-add-cart-button js-main-add-cart-button js-add-box-prime']"));
		adicionar.click();
		
		Thread.sleep(5000);
		WebElement continuar = driver.findElement(By.xpath("//a[text() = 'continuar']"));
		continuar.click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//p[contains(text(), 'Smartphone Samsung Galaxy S20+')]")).getText().equals("Smartphone Samsung Galaxy S20+");
		
		Thread.sleep(5000);
		WebElement continuarSacola = driver.findElement(By.xpath("//button[text() = 'Continuar']"));
		continuarSacola.click();
		
		driver.quit();
	}

}
