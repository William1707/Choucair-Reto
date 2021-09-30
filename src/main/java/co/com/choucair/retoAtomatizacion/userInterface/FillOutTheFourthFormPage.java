package co.com.choucair.retoAtomatizacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillOutTheFourthFormPage {
    //-------Step 4 -----------//
    public static final Target INPUT_PASSWORD =
            Target.the("Create Password")
                    .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD=
            Target.the("Confirm Password")
                    .located(By.id("confirmPassword"));

    public static final Target CHECK_STAY_INFORMED=
            Target.the("Check-box Stay informed")
                    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CHECK_CONDITIONS=
            Target.the("Terms and Conditions")
                    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_PRIVACY=
            Target.the("Privacy Policy")
                    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_FINAL=
            Target.the("Complete setup")
                    .located(By.id("laddaBtn"));
}


