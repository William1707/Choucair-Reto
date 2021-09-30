package co.com.choucair.retoAtomatizacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillOutTheThirdFormPage {
    public static final Target BUTTON_NEXT3 =
            Target.the("Continue to the next phase")
                    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
