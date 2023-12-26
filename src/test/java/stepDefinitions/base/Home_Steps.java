package stepDefinitions.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;

import static driver.DriverFactory.getDriver;
import static stepDefinitions.base.Hooks.captureImage;

public class Home_Steps {
    private WebDriver driver = getDriver();

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


    @And("Hacemos click en el enlace de X en el footer")
    public void hacemos_click_en_el_enlace_de_x_en_el_footer() {

    }


    @And("Hacemos click en el enlace de Youtube en el footer")
    public void hacemos_click_en_el_enlace_de_youtube_en_el_footer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("Hacemos click en atencion al cliente")
    public void hacemos_click_en_atencion_al_cliente() {

    }

    @Then("somos redirigidos a Youtube")
    public void somos_redirigidos_a_youtube() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("somos redirigidos a X")
    public void somos_redirigidos_a_x() {

    }

    @Then("somos redirigidos a Instagram")
    public void somos_redirigidos_a_instagram() {

        String urlInstagram = driver.getCurrentUrl();
        String urlInstagramEsperada = "https://www.instagram.com/carolinaherrera/";
        Assert.assertEquals(urlInstagram, urlInstagramEsperada);
    }

}
