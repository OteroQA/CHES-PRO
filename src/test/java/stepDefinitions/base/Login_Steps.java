package stepDefinitions.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Locale;

import static driver.DriverFactory.getDriver;
import static stepDefinitions.base.Hooks.captureImage;

public class Login_Steps {
    private WebDriver driver = getDriver();

    @Given("Accedemos a la web de CH")
    public void accedemos_a_la_web_de_ch() {

        try {
            driver.get("https://chcarolinaherrera.com/");
            Thread.sleep(7000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("Aceptamos todas las cookies")
    public void aceptamos_todas_las_cookies() {
        try {
            driver.findElement(By.xpath("//button[@id='accept-cookies']")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en iniciar sesion")
    public void hacemos_click_en_iniciar_sesion() {

        try {
            driver.findElement(By.xpath("(//span[contains(.,'Iniciar sesión')])[2]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Escribimos el correo incorrectamente")
    public void escribimos_el_correo_incorrectamente() {
        try {
            driver.findElement(By.xpath("//input[@id='logonId']")).sendKeys("damianviewnex@gmail.com");
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Escribimos el correo correctamente")
    public void escribimos_el_correo_correctamente() {
        try {
            driver.findElement(By.xpath("//input[@id='logonId']")).sendKeys("damianviewnext+pass@gmail.com");
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Cubrimos el correo incorrectamente")
    public void cubrimos_el_correo_incorrectamente() {
        try {
            driver.findElement(By.xpath("//input[@id='logonId']")).sendKeys("adjashfsadfewacdcdfkdsfaewjfds@gmail.com");
            Thread.sleep(1500);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Cubrimos el correo")
    public void cubrimos_el_correo() {
        try {
            driver.findElement(By.xpath("//input[@id='logonId']")).sendKeys("damianviewnext@gmail.com");
            Thread.sleep(1500);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Escribimos contraseña incorrecta")
    public void escribimos_contraseña_incorrecta() {
        try {
            driver.findElement(By.xpath("//input[@id='logonPassword']")).sendKeys("abc123..");
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Escribimos contraseña correctamente")
    public void escribimos_contraseña_correctamente() {
        try {
            driver.findElement(By.xpath("//input[@id='logonPassword']")).sendKeys("Insa2018");
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en iniciar sesion pop up")
    public void hacemos_click_en_iniciar_sesion_pop_up() {
        try {
            driver.findElement(By.xpath("//body/div[@id='page']/div[@id='modal-container']/div[@id='modal-content']/div[@id='modal-login']/div[1]/form[1]/div[1]/div[4]/button[1]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en restaurar contraseña")
    public void hacemos_click_en_restaurar_contraseña() {
        try {
            driver.findElement(By.xpath("//button[contains(text(),'RESTAURAR CONTRASEÑA')]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click ha olvidado su contraseña")
    public void hacemos_click_ha_olvidado_su_contraseña() {
        try {
            driver.findElement(By.xpath("//button[contains(text(),'¿HA OLVIDADO SU CONTRASEÑA?')]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en volver")
    public void hacemosClickEnVolver() {
        try {
            driver.findElement(By.xpath("//button[contains(text(),'< Volver')]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Se debe mostrar un error de campos obligatorios")
    public void se_debe_mostrar_un_error_de_campos_obligatorios() {

        String errorEmailObtenido = driver.findElement(By.xpath("//body/div[@id='page']/div[@id='modal-container']/div[@id='modal-content']/div[@id='modal-login']/div[1]/form[1]/div[1]/div[1]/span[1]")).getText();
        String errorPasswordObtenida = driver.findElement(By.xpath("//body/div[@id='page']/div[@id='modal-container']/div[@id='modal-content']/div[@id='modal-login']/div[1]/form[1]/div[1]/div[2]/span[1]")).getText();
        String errorEmailEsperado = "INFORMACIÓN OBLIGATORIA";
        String errorPasswordEsperada = "INFORMACIÓN OBLIGATORIA";
        Assert.assertEquals(errorEmailObtenido, errorEmailEsperado);
        Assert.assertEquals(errorPasswordObtenida, errorPasswordEsperada);
        captureImage();
    }

    @Then("Se debe mostrar un error de inicio de sesion erroneo")
    public void se_debe_mostrar_un_error_de_inicio_de_sesion_erroneo() {
        String errorObtenido = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[2]/div[1]/div[1]/span[1]")).getText();
        String errorEsperado = "EL EMAIL O LA CONTRASEÑA SON INCORRECTOS. POR FAVOR, INTÉNTELO DE NUEVO.";
        captureImage();
    }

    @Then("Somos redirigidos a la home y estamos con la sesion iniciada")
    public void somos_redirigidos_a_la_home_y_estamos_con_la_sesion_iniciada() {
        try {
            Thread.sleep(5000);
            String textoMiCuenta = driver.findElement(By.xpath("//span[contains(text(),'Mi Cuenta')]")).getText().toUpperCase(Locale.ROOT);
            String textoEsperado = "MI CUENTA";
            Assert.assertEquals(textoMiCuenta, textoEsperado);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Then("Nos salta una alerta para restablecer la contraseña")
    public void nos_salta_una_alerta_para_restablecer_la_contraseña() {
        try {
            String mensajeRecibido = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[2]/div[1]/div[1]")).getText();
            String mensajeEsperado = "Su solicitud se ha tramitado con éxito.";
            Assert.assertEquals(mensajeRecibido, mensajeEsperado);
            Thread.sleep(2000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Then("Error de que el correo no existe")
    public void error_de_que_el_correo_no_existe() {
        String mensajeRecibido = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[2]/div[1]/div[1]")).getText();
        String mensajeEsperado = "No se ha podido encontrar la dirección de correo electrónico del usuario: \"adjashfsadfewacdcdfkdsfaewjfds@gmail.com\"";
        Assert.assertEquals(mensajeRecibido, mensajeEsperado);
        captureImage();
    }




}
