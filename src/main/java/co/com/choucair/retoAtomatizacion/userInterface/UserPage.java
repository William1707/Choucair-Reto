package co.com.choucair.retoAtomatizacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserPage {

    public static final Target TEXT_USER_REGISTERED = Target.
            the("User interface of a registered user").
            located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div"));

}
