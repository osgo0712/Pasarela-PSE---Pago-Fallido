package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;


@DefaultUrl ("https://www.colsubsidio.com/ssoc/#/ingresar?goto=http:%2F%2F40.117.63.112%2Fportal%2Fsalud")

public class PagoFallidoPageObject extends PageObject {


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	Properties loadProperty = new Properties();	
	
	//HOME
	static By User = PagoFallidoElements.txtUser.getValor_campo();
	static By Pass = PagoFallidoElements.txtPass.getValor_campo();
	static By Ing = PagoFallidoElements.btningreso.getValor_campo();
	static By Servicio = PagoFallidoElements.btnserv.getValor_campo();
	static By Ingreso = PagoFallidoElements.btningresarportal.getValor_campo();
	//AGENDAR CITA
	static By Agendar = PagoFallidoElements.btnagendar.getValor_campo();
	//TIPO DE CITA
	static By TipoCita = PagoFallidoElements.btntipocita.getValor_campo();
	static By CitaPresencial = PagoFallidoElements.btncitapresencial.getValor_campo();
	//SELECCION DE CIUDAD
	static By Ciudad = PagoFallidoElements.btnciudad.getValor_campo();
	static By Bogota = PagoFallidoElements.btnBogota.getValor_campo();
	static By ConfirmarCiudad = PagoFallidoElements.btnconfirmarciudad.getValor_campo();
	//SELECCION CENTRO MEDICO
	static By CentroMedico = PagoFallidoElements.btncentromedico.getValor_campo();
	static By CentroMedicoSuba = PagoFallidoElements.btncentromedicosuba.getValor_campo();
	static By Horario = PagoFallidoElements.btnhorario.getValor_campo();
	static By ConfirmarHorario = PagoFallidoElements.btnconfirmarhora.getValor_campo();
	//SELECCION FECHA
	static By Fecha = PagoFallidoElements.btnfecha.getValor_campo();
	static By ValidacionDisponibilidad = PagoFallidoElements.txtValidacionDisponibilidad.getValor_campo();
	static By Atras = PagoFallidoElements.btnAtras.getValor_campo();
	static By Hora = PagoFallidoElements.btnconfirmarhora.getValor_campo();
	static By Medico = PagoFallidoElements.btnmedico.getValor_campo();
	static By ConfirmarFecha = PagoFallidoElements.btnconfirmarfecha.getValor_campo();
	//ConfirmarReserva
	static By ConfirmarReserva = PagoFallidoElements.btnconfirmarreserva.getValor_campo();
	//PAGO
	static By BtnCitasAegndadas = PagoFallidoElements.btnCitasAgendadas.getValor_campo();
	static By BtnPagarCitaAgendada = PagoFallidoElements.btnPagarCitaAgendada.getValor_campo();
	static By BtnIconoPago = PagoFallidoElements.btnIcono.getValor_campo();
	static By TxtCel = PagoFallidoElements.txtCel.getValor_campo();
	static By TxtEmail = PagoFallidoElements.txtemail.getValor_campo();
	static By Captchat = PagoFallidoElements.btnCaptchat.getValor_campo();
	static By BtnConfirmarDatos = PagoFallidoElements.btnPagar.getValor_campo();
	static By BtnPSE = PagoFallidoElements.btnPSE.getValor_campo();
	static By MsjCreacion = PagoFallidoElements.MnsjCreacion.getValor_campo();
	//TIPO PERSONA
	static By BtnTipoPersona = PagoFallidoElements.btnTipoPersona.getValor_campo();
	static By BtnPersonaNatural = PagoFallidoElements.btnPersonaNatural.getValor_campo();
	static By BtnBanco = PagoFallidoElements.btnBanco.getValor_campo();
	static By BtnBancoUnionColombiano = PagoFallidoElements.btnBancoUnionColombia.getValor_campo();
	static By BtnContinuarPago = PagoFallidoElements.btnContinuarPago.getValor_campo();
	//EMAIL PSE
	static By TxtEmailPSE = PagoFallidoElements.txtEamilPSE.getValor_campo();
	static By BtnAceptar = PagoFallidoElements.btnAceptar.getValor_campo();
	static By BtnIrBanco = PagoFallidoElements.btnIrBanco.getValor_campo();
	//INFORMACION PAGO
	static By BtnDebug = PagoFallidoElements.btnDebug.getValor_campo();
	static By BtnEstado = PagoFallidoElements.btnEstado.getValor_campo();
	static By BtnFallido = PagoFallidoElements.btnFallido.getValor_campo();
	static By TxtFecha = PagoFallidoElements.txtFecha.getValor_campo();
	static By TxtCodigo = PagoFallidoElements.txtCodigo.getValor_campo();
	static By BtnCall = PagoFallidoElements.btnCall.getValor_campo();
	static By BtnPPE = PagoFallidoElements.btnPpe.getValor_campo();



	public void ClickAgendar() throws InterruptedException, AWTException {
		if (element(User).isDisplayed()) {
			Thread.sleep(1000);
			find(User).click();
			find(User).sendKeys("53084100");
			Thread.sleep(1000);	
			find(Pass).click();
			find(Pass).sendKeys("Mafe2408");
			Thread.sleep(1500);	
			find(Ing).click();
			Thread.sleep(5000);	
			find(Servicio).click();
			Thread.sleep(1000);	
			find(Ingreso).click();
			Thread.sleep(3000);	
			find(Agendar).click();
			Thread.sleep(3000);	
		}		
	}

	public void TipoCita() throws InterruptedException {
		find(TipoCita).click();
		Thread.sleep(2000);	
		find(CitaPresencial).click();
		Thread.sleep(4000);	
	}

	public void SeleccionarCiudad() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		find(Ciudad).click();
		Thread.sleep(1000);
		find(Bogota).click();
		Thread.sleep(1000);
		//robot.keyPress(KeyEvent.VK_DOWN);
		//robot.keyPress(KeyEvent.VK_ENTER);
		find(ConfirmarCiudad).click();
		Thread.sleep(1000);
	}

	public void SeleccionCentroMedico() throws InterruptedException, AWTException {
		find(CentroMedico).click();
		Thread.sleep(1000);
		find(CentroMedicoSuba).click();
		Thread.sleep(1000);	
		find(Horario).click();
		Thread.sleep(1000);	
		find(ConfirmarHorario).click();
		Thread.sleep(1000);	

	}

	public void SeleccionFecha() throws AWTException, InterruptedException {

		Robot robot = new Robot();	
			Thread.sleep(1000);	
			find(Fecha).click();
			Thread.sleep(3000);		
			//HORA
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			//MEDICO
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			find(ConfirmarFecha).click();
			Thread.sleep(3000);
		
	}

	public void ConfirmarReserva() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(3000);
		find(ConfirmarReserva).click();
		Thread.sleep(9000);

	}

	public void CitaAgendada() throws InterruptedException {
		if(element(BtnCitasAegndadas).isDisplayed()) {
			find(BtnCitasAegndadas).click();
			Thread.sleep(1000);
		}
	}

	public void ClickBtnPagar() throws InterruptedException {


		String mainTab = getDriver().getWindowHandle();
		String newTab = "";	
		System.out.println("Main Tab" + mainTab);
		find(BtnPagarCitaAgendada).click();
		Thread.sleep(2000);

		Set<String> handles = getDriver().getWindowHandles();
		for (String actual : handles) {
			System.out.println("Handle id:" + actual);	
			if (!actual.equalsIgnoreCase(mainTab)) {
				//Cambio de Pestaña
				getDriver().switchTo().window(actual);
			}
		}

	}


	public void RegistrarDatos()  {
		try {
			//Robot robot = new Robot();
			find(BtnIconoPago).click();
			Thread.sleep(2000);
			find(TxtCel).sendKeys("3104985492");
			Thread.sleep(1000);
			find(TxtEmail).sendKeys("Test@gmail.com");
			Thread.sleep(2000);
			getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@id=\"ngrecaptcha-0\"]/div/div/iframe")));
			Thread.sleep(1000);
			find(Captchat).click();
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			getDriver().switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

	public void ConfirmarDatos() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		find(BtnConfirmarDatos).click();	
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		find(BtnPSE).click();	
		Thread.sleep(2000);
	}

	public void ValidarMensajeCreacion() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
	}

	public void RegistroDatosPago() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,500)");
		find(BtnTipoPersona).click();
		Thread.sleep(2000);
		find(BtnPersonaNatural).click();
		Thread.sleep(2000);
		find(BtnBanco).click();
		Thread.sleep(2000);
		find(BtnBancoUnionColombiano).click();
		Thread.sleep(2000);
		find(BtnContinuarPago).click();
		Thread.sleep(3000);

	}

	public void IngresoEmailPSE() throws InterruptedException {

		find(TxtEmailPSE).sendKeys("oscaesgo@colsubsidio.com");
		Thread.sleep(2000);
		find(BtnAceptar).click();
		Thread.sleep(1000);
		find(BtnIrBanco).click();
		Thread.sleep(2000);
	}

	public void FlujoDebug() throws InterruptedException {
		find(BtnDebug).click();
		Thread.sleep(2000);
	}
	
	public void IngresoDatos() throws InterruptedException {
		
		find(BtnEstado).click();
		Thread.sleep(1000);
		find(BtnFallido).click();
		Thread.sleep(1000);
		//CAMBIAR POR FECHA ACTUAL 
		find(TxtFecha).sendKeys("30/11/2021");
		Thread.sleep(1000);
		find(TxtCodigo).sendKeys("000012");
		Thread.sleep(1000);

	}

	public void Call() throws InterruptedException {
		find(BtnCall).click();
		Thread.sleep(1000);
		find(BtnPPE).click();	
		Thread.sleep(5000);		
	}
	

	public void MensajeFallida() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(5000);		
	}

}