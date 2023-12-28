package stepDefinitions.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;

import static driver.DriverFactory.getDriver;
import static stepDefinitions.base.Hooks.captureImage;

public class Home_Steps {
    private WebDriver driver = getDriver();

    @And("Navegamos al localizador de tiendas")
    public void navegamos_al_localizador_de_tiendas() {
        try {
            driver.findElement(By.xpath("//span[contains(text(),'LOCALIZADOR DE TIENDAS')]")).click();
            Thread.sleep(5000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en preguntas frecuentes")
    public void hacemos_click_en_preguntas_frecuentes() {
        try {
            driver.findElement(By.xpath("//a[contains(text(),'PREGUNTAS FRECUENTES')]")).click();
            Thread.sleep(2000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Escogemos un pais y provincia")
    public void escogemos_un_pais_y_provincia() {
        try {
            driver.findElement(By.xpath("//body/div[@id='contentWrapper']/div[@id='content']/div[@id='container_']/div[1]/div[1]/div[2]/form[1]/div[1]/span[1]/span[2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[contains(text(),'Estados Unidos')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//body/div[@id='contentWrapper']/div[@id='content']/div[@id='container_']/div[1]/div[1]/div[2]/form[1]/div[2]/span[1]/span[2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[contains(text(),'California')]")).click();
            Thread.sleep(1500);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en cambio de pais e idioma")
    public void hacemos_click_en_cambio_de_pais_e_idioma() {
        try {
            driver.findElement(By.xpath("//a[@id='link-country']")).click();
            Thread.sleep(1500);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Cambiamos el pais y el idioma")
    public void cambiamos_el_pais_y_el_idioma() {
        try {
            driver.findElement(By.xpath("//a[@id='link-country']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@id='modal-container' and contains(@class, 'active overflow-modal')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[@id='lblCountry-option-715837885']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[contains(text(),'IDIOMA')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[@id='lblLanguage-option-https://chcarolinaherrera.com/us/en']")).click();
            Thread.sleep(1000);
            captureImage();
            driver.findElement(By.xpath("//button[contains(text(),'Volver a la tienda')]")).click();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en el enlace de Instagram en el footer")
    public void hacemos_click_en_el_enlace_de_instagram_en_el_footer() {

        try {
            driver.findElement(By.xpath("//body/div[@id='page']/div[@id='contentWrapper']/div[@id='footerWrapper']/div[@id='footer']/div[@id='footerRow1']/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")).click();
            Thread.sleep(7000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en el enlace de Facebook en el footer")
    public void hacemos_click_en_el_enlace_de_facebook_en_el_footer() {
        try {
            driver.findElement(By.xpath("//body/div[@id='page']/div[@id='contentWrapper']/div[@id='footerWrapper']/div[@id='footer']/div[@id='footerRow1']/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
            Thread.sleep(5000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en el enlace de X en el footer")
    public void hacemos_click_en_el_enlace_de_x_en_el_footer() {


    }


    @And("Hacemos click en el enlace de Youtube en el footer")
    public void hacemos_click_en_el_enlace_de_youtube_en_el_footer() {
        try {

            driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[6]/div[2]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]/img[1]")).click();
            Thread.sleep(7000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en atencion al cliente y no cubrimos todos los datos")
    public void hacemos_click_en_atencion_al_cliente_y_no_cubrimos_todos_los_datos() {
        try {
            driver.findElement(By.xpath("//span[contains(text(),'Atención al Cliente')]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@id='firstName']")).isDisplayed();
            driver.findElement(By.xpath("//input[@id='firstName']")).isDisplayed();
            driver.findElement(By.xpath("//body/div[@id='page']/div[@id='modal-container']/div[@id='modal-content']/div[@id='modal-customer-service']/div[1]/form[1]/div[3]/div[3]/div[1]/span[1]/span[1]")).isDisplayed();
            driver.findElement(By.xpath("//input[@id='mobilePhone1']")).isDisplayed();
            driver.findElement(By.xpath("//input[@id='sender-email']")).isDisplayed();
            driver.findElement(By.xpath("//textarea[@id='message']")).isDisplayed();
            driver.findElement(By.xpath("//label[@id='lblTermsConditions']")).isDisplayed();
            driver.findElement(By.xpath("//body/div[@id='page']/div[@id='modal-container']/div[@id='modal-content']/div[@id='modal-customer-service']/div[1]/form[1]/div[7]/button[1]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en politica de privacidad")
    public void hacemos_click_en_politica_de_privacidad() {
        try {
            driver.findElement(By.xpath("//span[contains(text(),'Política de privacidad')]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en terminos y condiciones de venta")
    public void hacemos_click_en_terminos_y_condiciones_de_venta() {
        try {
            driver.findElement(By.xpath("//span[contains(text(),'Términos y Condiciones de Venta')]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Hacemos click en terminos y condiciones de uso")
    public void hacemos_click_en_terminos_y_condiciones_de_uso() {
        try {
            driver.findElement(By.xpath("//span[contains(text(),'Términos y Condiciones de Uso')]")).click();
            Thread.sleep(3000);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Then("Se muestran las tiendas de esa zona")
    public void se_muestran_las_tiendas_de_esa_zona() {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,750)");
            Thread.sleep(3000);
            String textoTienda = driver.findElement(By.xpath("//h2[contains(text(),'CH LIVERMORE OUTLET')]")).getText().toUpperCase();
            String textoTiendaEsperado = "CH LIVERMORE OUTLET".toUpperCase();
            Assert.assertEquals(textoTienda, textoTiendaEsperado);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Se abre el pop up de preguntas frecuentes")
    public void se_abre_el_pop_up_de_preguntas_frecuentes() {
        String textoPreguntasFrecuentes = driver.findElement(By.xpath("//h2[contains(text(),'Preguntas Frecuentes')]")).getText().toUpperCase();
        String textoPreguntasFrecuentesEsperado = "PREGUNTAS FRECUENTES".toUpperCase();
        Assert.assertEquals(textoPreguntasFrecuentes, textoPreguntasFrecuentesEsperado);
        captureImage();
    }

    @Then("Somos redirigidos al pais en cuestion")
    public void somos_redirigidos_al_pais_en_cuestion() {
        String urlRedireccion = driver.getCurrentUrl().toUpperCase();
        String urlRedireccionEsperado = "https://chcarolinaherrera.com/us/es";
        Assert.assertEquals(urlRedireccion, urlRedireccionEsperado);
        captureImage();
    }

    @Then("Se abre el pop up de la politica de privacidad")
    public void Se_abre_el_pop_up_de_la_politica_de_privacidad() {
        String politicaPrivacidadTexto = driver.findElement(By.xpath("//span[contains(text(),'Política de Privacidad')]")).getText().toUpperCase();
        String politicaPrivacidadTextoEsperado = "Política de Privacidad".toUpperCase();
        Assert.assertEquals(politicaPrivacidadTexto, politicaPrivacidadTextoEsperado);
        captureImage();
    }

    @Then("Se abre el pop up de terminos y condiciones de venta")
    public void Se_abre_el_pop_up_de_terminos_y_condiciones_de_venta() {
        String terminosCondicionesVenta = driver.findElement(By.xpath("//span[contains(text(),'TÉRMINOS Y CONDICIONES GENERALES DE COMPRA')]")).getText().toUpperCase();
        String terminosCondicionesVentaEsperado = "TÉRMINOS Y CONDICIONES GENERALES DE COMPRA".toUpperCase();
        Assert.assertEquals(terminosCondicionesVenta, terminosCondicionesVentaEsperado);
        captureImage();
    }

    @Then("Se abre el pop up de terminos y condiciones de uso")
    public void Se_abre_el_pop_up_de_terminos_y_condiciones_de_uso() {
        String terminosCondicionesUso = driver.findElement(By.xpath("//span[contains(text(),'TERMINOS Y CONDICIONES DE USO')]")).getText().toUpperCase();
        String terminosCondicionesUsoEsperado = "TERMINOS Y CONDICIONES DE USO".toUpperCase();
        Assert.assertEquals(terminosCondicionesUso, terminosCondicionesUsoEsperado);
        captureImage();
    }

    @Then("somos redirigidos a Youtube")
    public void somos_redirigidos_a_youtube() {
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        try {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//span[contains(text(), 'Aceptar todo')]")).click();
            Thread.sleep(5000);
            String urlYoutube = driver.getCurrentUrl();
            String urlYoutubeEsperada = "https://www.youtube.com/user/carolinaherrera/carolinaherrera";
            Assert.assertEquals(urlYoutube, urlYoutubeEsperada);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("Somos redirigidos a Facebook")
    public void somos_redirigidos_a_facebook() {
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        try {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/span")).click();
            Thread.sleep(5000);
            String urlFacebook = driver.getCurrentUrl();
            String urlFacebookEsperada = "https://www.facebook.com/CarolinaHerreraNY";
            Assert.assertEquals(urlFacebook, urlFacebookEsperada);
            captureImage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("somos redirigidos a X")
    public void somos_redirigidos_a_x() {

    }

    @Then("Somos redirigidos a Instagram")
    public void somos_redirigidos_a_instagram() {

        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);

        }
        String urlInstagram = driver.getCurrentUrl();
        String urlInstagramEsperada = "https://www.instagram.com/carolinaherrera/";
        Assert.assertEquals(urlInstagram, urlInstagramEsperada);
        captureImage();
    }

    @Then("Se muestran mensajes de error de informacion obligatoria")
    public void se_muestran_mensajes_de_error_de_informacion_obligatoria() {
        String textoInformacionObligatoria = driver.findElement(By.xpath("//body/div[@id='page']/div[@id='modal-container']/div[@id='modal-content']/div[@id='modal-customer-service']/div[1]/form[1]/div[4]/span[2]")).getText();
        String textoInformacionObligatoriaEsperado = "Información obligatoria".toUpperCase();
        Assert.assertEquals(textoInformacionObligatoria, textoInformacionObligatoriaEsperado);
        captureImage();
    }

}
