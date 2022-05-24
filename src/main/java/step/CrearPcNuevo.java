package step;

import net.thucydides.core.annotations.Step;
import pageobject.PaginaUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CrearPcNuevo {
    private PaginaUrl paginaUrl;

    @Step
    public void abrirFormularioDeRegistroPcNuevo(){
        paginaUrl.addNewPc.click();
    }

    @Step
    public void ingresarDatosPC(){
        paginaUrl.pcName.sendKeys("ASUS");
        paginaUrl.introducedDate.sendKeys("2022-05-24");
        paginaUrl.discontinuedDate.sendKeys("2027-05-23");
        paginaUrl.company.select().byValue("1");
    }
    @Step
    public void crearPC(String buttonSubmit) {
        paginaUrl.btnSubmit.click();
    }
    @Step
    public void validation() {
        assertThat(paginaUrl.registroCreado.isCurrentlyVisible(), is(true));
    }
}
