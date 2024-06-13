package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Componentes {

    private WebElement button;

    private WebDriver driver;
    public void inicializa(){
        String chromeDriver = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/drivers/componentes.html");
    }

    public void fechar(){
        driver.quit();
    }

    public void cadastro(){
        preencherCampo(By.id("elementosForm:nome"), "Luis");
        preencherCampo(By.id("elementosForm:sobrenome"), "Bernardo");
        clicarElemento(By.id("elementosForm:sexo:0"));
        clicarElemento(By.id("elementosForm:comidaFavorita:1"));
        selecionarDropdown(By.id("elementosForm:escolaridade"), "1o grau completo");
        selecionarDropdown(By.id("elementosForm:esportes"), "Natacao");
        preencherCampo(By.id("elementosForm:sugestoes"), "aqui esta uma sugestao");
        clicarElemento(By.id("elementosForm:cadastrar"));
    }

    public void cadastroValidacao(){
        validarTexto(By.id("descNome"), "Nome: Luis");
        validarTexto(By.id("descSobrenome"), "Sobrenome: Bernardo");
        validarTexto(By.id("descSexo"), "Sexo: Masculino");
        validarTexto(By.id("descComida"), "Comida: Frango");
        validarTexto(By.id("descEscolaridade"), "Escolaridade: 1graucomp");
        validarTexto(By.id("descEsportes"), "Esportes: Natacao");
        validarTexto(By.id("descSugestoes"), "Sugestoes: aqui esta uma sugestao");
    }

    private void preencherCampo(By by, String texto){
        driver.findElement(by).sendKeys(texto);
    }

    private void clicarElemento(By by){
        driver.findElement(by).click();
    }

    private void selecionarDropdown(By by, String textoVisivel){
        WebElement dropdownElement = driver.findElement(by);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(textoVisivel);
    }

    private void validarTexto(By by, String textoEsperado){
        WebElement elemento = driver.findElement(by);
        Assert.assertEquals(textoEsperado, elemento.getText());
    }



}
