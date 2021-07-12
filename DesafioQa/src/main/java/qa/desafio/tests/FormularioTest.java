package qa.desafio.tests;

import org.junit.Test;

import qa.desafio.page.FormularioPage;

public class FormularioTest {

	FormularioPage formularioPage = new FormularioPage();

	@Test
	public void cadastro() throws InterruptedException {

		formularioPage.deveAcessarSite();
		formularioPage.setNome();
		formularioPage.setEmail();
		formularioPage.setEstado();
		formularioPage.setCidade();
		formularioPage.setRua();
		formularioPage.setBairro();
		formularioPage.setCep();
		formularioPage.setCep2();
		formularioPage.setSenha();
		formularioPage.setCadastra();
	}

	@Test
	public void testeemail() throws InterruptedException {

		formularioPage.deveAcessarSite();
		formularioPage.setNome();
		formularioPage.setEmail2();
		formularioPage.setEstado();
		formularioPage.setCidade();
		formularioPage.setRua();
		formularioPage.setBairro();
		formularioPage.setCep();
		formularioPage.setCep2();
		formularioPage.setSenha();
		formularioPage.setCadastra();

	}

	@Test
	public void testecamposembranco() throws InterruptedException {

		formularioPage.deveAcessarSite();
		formularioPage.setNome();
		formularioPage.setEmail();
		formularioPage.setCidade();
		formularioPage.setRua();
		formularioPage.setCep();
		formularioPage.setCep2();
		formularioPage.setCadastra();

	}

	@Test
	public void botaologin() throws InterruptedException {

		formularioPage.deveAcessarSite();
		formularioPage.setLogin();
		formularioPage.setCadastroBotton();
		formularioPage.setNome();
		formularioPage.setEmail();
		formularioPage.setEstado();
		formularioPage.setCidade();
		formularioPage.setRua();
		formularioPage.setBairro();
		formularioPage.setCep();
		formularioPage.setCep2();
		formularioPage.setSenha();
		formularioPage.setCadastra();

	}

	@Test
	public void verificarcamposobrigatorios() throws InterruptedException {

		formularioPage.deveAcessarSite();
		formularioPage.setCadastra();
		formularioPage.setNome();
		formularioPage.setCadastra();
		formularioPage.setEmail();
		formularioPage.setCadastra();
		formularioPage.setEstado();
		formularioPage.setCadastra();
		formularioPage.setCidade();
		formularioPage.setCadastra();
		formularioPage.setRua();
		formularioPage.setCadastra();
		formularioPage.setBairro();
		formularioPage.setCadastra();
		formularioPage.setCep();
		formularioPage.setCadastra();
		formularioPage.setCep2();
		formularioPage.setCadastra();
		formularioPage.setSenha();
		formularioPage.setCadastra();

	}

	@Test
	public void preenchelimpacampos() throws InterruptedException {

		formularioPage.deveAcessarSite();
		formularioPage.setNome();
		formularioPage.limparnome();
		formularioPage.setNome();
		formularioPage.setEmail2();
		formularioPage.limparemail();
		formularioPage.setEmail2();
		formularioPage.setEstado();
		formularioPage.limparestado();
		formularioPage.setEstado();
		formularioPage.limparestado();
		formularioPage.setEstado();
		formularioPage.setCidade();
		formularioPage.limparcidade();
		formularioPage.setCidade();
		formularioPage.setRua();
		formularioPage.limparrua();
		formularioPage.setRua();
		formularioPage.setBairro();
		formularioPage.limparbairro();
		formularioPage.setBairro();
		formularioPage.setCep();
		formularioPage.limparcep();
		formularioPage.setCep();
		formularioPage.setCep2();
		formularioPage.limparcep2();
		formularioPage.setCep2();
		formularioPage.setSenha();
		formularioPage.limparsenha();
		formularioPage.setSenha();

	}

	@Test
	public void validacampos() throws InterruptedException {

		formularioPage.deveAcessarSite();
		formularioPage.setNome();
		formularioPage.setEmail();
		formularioPage.validanome();
		formularioPage.validaemail();

	}

	@Test
	public void loginsemcadastro() throws InterruptedException {

		formularioPage.deveAcessarSite();
		formularioPage.setLogin();
		formularioPage.nomelogin();
		formularioPage.emaillogin();
		formularioPage.manterlogado();
		formularioPage.logor();

	}

	@Test
	public void resetar() throws InterruptedException {

		formularioPage.deveAcessarSite();
		formularioPage.setNome();
		formularioPage.setEmail2();
		formularioPage.setEstado();
		formularioPage.setCidade();
		formularioPage.setRua();
		formularioPage.setBairro();
		formularioPage.setCep();
		formularioPage.setCep2();
		formularioPage.setSenha();
		formularioPage.setResetar();

	}

	@Test
	public void testesenha() throws InterruptedException {

		formularioPage.deveAcessarSite();
		formularioPage.setNome();
		formularioPage.setEmail();
		formularioPage.setEstado();
		formularioPage.setCidade();
		formularioPage.setRua();
		formularioPage.setBairro();
		formularioPage.setCep();
		formularioPage.setCep2();
		formularioPage.setSenhaincorreta();
		formularioPage.setCadastra();

	}

}
