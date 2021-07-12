package qa.desafio.page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import qa.desafio.core.BasePage;

public class FormularioPage extends BasePage {
	private WebDriver driver;

	public void deveAcessarSite() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "\\src\\test\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://letsbomfin.github.io/cadastro.github.io/");
		driver.manage().window().maximize();

	}

	public void setNome() {

		driver.findElement(By.id("nome_cad")).sendKeys("Amanda Nogueira");

	}

	public void validanome() {

		assertEquals("Amanda Nogueira", driver.findElement(By.id("nome_cad")).getAttribute("value"));

	}

	public void validaemail() {

		assertEquals("emailteste@gmail.com", driver.findElement(By.id("email_cad")).getAttribute("value"));

	}

	public void tempo() throws InterruptedException {

		Thread.sleep(5000);

	}

	public void Verificarbotao() {

		driver.findElement(By.id("cadastre_botton")).getAttribute("Value");
		assertEquals("Cadastre-se", "Value");

	}

	public void setEmail() {

		driver.findElement(By.id("email_cad")).sendKeys("emailteste@gmail.com");
	}

	public void setEmail2() {

		driver.findElement(By.id("email_cad")).sendKeys("emailtestegmail.com");
	}

	public void setEstado() {

		driver.findElement(By.id("estado_cad")).sendKeys("RS");

	}

	public void setCidade() {

		driver.findElement(By.id("cidade_cad")).sendKeys("Porto Alegre");

	}

	public void setRua() {

		driver.findElement(By.id("rua_cad")).sendKeys("Rua matriz");
	}

	public void setBairro() {

		driver.findElement(By.id("bairro_cad")).sendKeys("Riachuello");
	}

	public void setCep() {
		driver.findElement(By.name("cep")).sendKeys("22753");

	}

	public void setCep2() {
		driver.findElement(By.name("cep2")).sendKeys("703");

	}

	public void setSenha() {

		driver.findElement(By.id("senha_cad")).sendKeys("Sist@1#2");
	}

	public void setCadastra() {

		driver.findElement(By.xpath("//*[@id=\"cadastro\"]/form/p[9]/input")).click();
	}

	public void setResetar() {

		driver.findElement(By.xpath("//*[@id=\"cadastro\"]/form/p[10]/input")).click();
	}

	public void setSair() {
		driver.quit();

	}

	public void setLogin() {

		driver.findElement(By.linkText("Login")).click();

	}

	public void setCadastroBotton() {

		driver.findElement(By.id("cadastre_botton")).click();

	}

	public void setCadast() {

		driver.findElement(By.id("cadastre_botton")).click();

	}

	public void limparnome() {

		driver.findElement(By.id("nome_cad")).clear();

	}

	public void limparemail() {

		driver.findElement(By.id("email_cad")).clear();

	}

	public void limparestado() {

		driver.findElement(By.id("estado_cad")).clear();

	}

	public void limparcidade() {

		driver.findElement(By.id("cidade_cad")).clear();

	}

	public void limparrua() {

		driver.findElement(By.id("rua_cad")).clear();

	}

	public void limparbairro() {
		driver.findElement(By.id("bairro_cad")).clear();

	}

	public void limparcep() {

		driver.findElement(By.name("cep")).clear();

	}

	public void limparcep2() {

		driver.findElement(By.name("cep2")).clear();

	}

	public void limparsenha() {

		driver.findElement(By.id("senha_cad")).clear();

	}

	public void logor() {

		driver.findElement(By.xpath("//*[@id=\"login\"]/form/p[4]/input")).click();

	}

	public void nomelogin() {

		driver.findElement(By.id("nome_login")).sendKeys("leonardo");

	}

	public void emaillogin() {

		driver.findElement(By.id("email_login")).sendKeys("email@teste.com.br");

	}

	public void manterlogado() {

		driver.findElement(By.id("manterlogado")).click();

	}

	public void setSenhaincorreta() {

		driver.findElement(By.id("senha_cad")).sendKeys("irrr");
	}

}