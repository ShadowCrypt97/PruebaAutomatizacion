package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/crear_nuevo_pc.feature",
                 tags = "@HistoriaDeUsuario",
                 glue = "definition",
                 snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerTags {
}
