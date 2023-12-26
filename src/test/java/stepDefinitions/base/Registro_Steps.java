package stepDefinitions.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import static driver.DriverFactory.getDriver;
import static stepDefinitions.base.Hooks.captureImage;

public class Registro_Steps {
    private WebDriver driver = getDriver();

    @Given("Accedemos a la home de CH")
    public void accedemos_a_la_home_de_ch() {
        try {
            driver.get("https://chcarolinaherrera.com/es/es");
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("Acepto todas las cookies")
    public void acepto_todas_las_cookies() {


        try {
            driver.findElement(By.xpath("//button[@id='accept-cookies']")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hago click en iniciar sesion")
    public void hago_click_en_iniciar_sesion() {

        try {
            driver.findElement(By.xpath("(//span[contains(.,'Iniciar sesión')])[2]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Pulso el boton de registrarse")
    public void pulso_el_boton_de_registrarse() {

        try {
            driver.findElement(By.xpath("//button[contains(text(),'REGISTRARSE')]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Cubro el campo correo con uno ya registrado previamente")
    public void cubro_el_campo_correo_con_uno_ya_registrado_previamente() {
        driver.findElement(By.xpath("//input[@id='logonId']")).sendKeys("damianviewnext@gmail.com");
        captureImage();
    }

    @And("Cubro el campo correo")
    public void cubro_el_campo_correo() {
        int numero1 = (int) (Math.random() * 999999999) + 9999;
        int numero2 = (int) (Math.random() * 999999999) + 999;
        int numero3 = (int) (Math.random() * 999999999) + 1;
        driver.findElement(By.xpath("//input[@id='logonId']")).sendKeys("damianviewnext+" + "CHES_" + numero1 + "_" + numero2 + "_" + numero3 + "@gmail.com");
        captureImage();
    }

    @And("Cubro el campo de contraseña")
    public void cubro_el_campo_de_contraseña() {
        driver.findElement(By.xpath("//input[@id='logonPassword']")).sendKeys("Insa2018");
        captureImage();
    }

    @And("Cubro el campo de confirmacion de contraseña")
    public void cubro_el_campo_de_confirmacion_de_contraseña() {
        driver.findElement(By.xpath("//input[@id='logonPasswordVerify']")).sendKeys("Insa2018");
        captureImage();
    }

    @And("Acepto los terminos y condiciones")
    public void acepto_los_terminos_y_condiciones() {
        driver.findElement(By.xpath("//label[@id='lblTermsConditions']")).click();
        captureImage();
    }

    @And("Hago click en el boton de nuevo cliente")
    public void hago_click_en_el_boton_de_nuevo_cliente() {

        try {
            driver.findElement(By.xpath("//body/div[@id='page']/div[@id='modal-container']/div[@id='modal-content']/div[@id='modal-register']" +
                    "/div[1]/form[1]/div[1]/div[9]/button[1]")).click();
            Thread.sleep(5000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Deberia de aparecer un mensaje de error")
    public void deberia_de_aparecer_un_mensaje_de_error() {
        String errorMessage = "LA INFORMACIÓN DE CLIENTE QUE HA FACILITADO YA EXISTE. POR FAVOR, INICIE SESIÓN O UTILICE NUESTRA OPCIÓN DE RECORDAR CONTRASEÑA.";
        String currentError = driver.findElement(By.xpath("//span[contains(text(),'La información de Cliente que ha facilitado ya exi')]")).getText();
        Assert.assertEquals(currentError, errorMessage);
        captureImage();
    }

    @Then("Deberian de aparecer mensajes de error")
    public void deberian_de_aparecer_mensajes_de_error() {
        String errorCorreo = "INFORMACIÓN OBLIGATORIA";
        String errorContrasena = "INFORMACIÓN OBLIGATORIA";
        String errorConfirmarContrasena = "INFORMACIÓN OBLIGATORIA";
        String errorTerminosYCondiciones = "INFORMACIÓN OBLIGATORIA";

        String currentErrorCorreo = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/span[1]")).getText();
        String currentErrorContrasena = driver.findElement(By.xpath("//body/div[@id='page']/div[@id='modal-container']/div[@id='modal-content']/div[@id='modal-register']/div[1]/form[1]/div[1]/div[4]/span[1]")).getText();
        String currentErrorConfirmarContrasena = driver.findElement(By.xpath("//body/div[@id='page']/div[@id='modal-container']/div[@id='modal-content']/div[@id='modal-register']/div[1]/form[1]/div[1]/div[5]/span[1]")).getText();
        String currEnterrorTerminosYCondiciones = driver.findElement(By.xpath("//body/div[@id='page']/div[@id='modal-container']/div[@id='modal-content']/div[@id='modal-register']/div[1]/form[1]/div[1]/div[6]/span[2]")).getText();

        Assert.assertEquals(currentErrorCorreo, errorCorreo);
        Assert.assertEquals(currentErrorContrasena, errorContrasena);
        Assert.assertEquals(currentErrorConfirmarContrasena, errorConfirmarContrasena);
        Assert.assertEquals(currEnterrorTerminosYCondiciones, errorTerminosYCondiciones);
        captureImage();
    }

    @Then("Deberia de ser redirigido a la home y poder ver mi cuenta")
    public void deberia_de_ser_redirigido_a_la_home_y_poder_ver_mi_cuenta() {
        String textoMiCuenta = "MI CUENTA";
        String currentText = driver.findElement(By.xpath("//span[contains(text(),'Mi Cuenta')]")).getText();
        Assert.assertEquals(currentText, textoMiCuenta);
        captureImage();
    }
}
