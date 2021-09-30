package co.com.choucair.retoAtomatizacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillOutSecondFormPage {
    //-------Step 2 -----------//

    public static final Target INPUT_CITY = Target.
            the("field to complete the city").
            located(By.id("city"));

    public static final Target INPUT_POSTAL_CODE = Target.
            the("field to complete the postal code of the city").
            located(By.id("zip"));

    public static final Target OPTION_COUNTRY = Target.
            the("country of residence").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));

    public static final Target NEXT_BUTTON2 = Target.
            the("button to continue registration").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));


}