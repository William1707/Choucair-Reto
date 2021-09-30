package co.com.choucair.retoAtomatizacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillOutFirstRecordPage {
    public static final Target REGISTER_BUTTON = Target.
            the("button that shows us the form to register").
            located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]"));

    public static final Target INPUT_FIRSTNAME = Target.
            the("field to fill the name").
            located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.
            the("field to fill in the surnames").
            located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.
            the("field to complete the email").
            located(By.id("email"));

    public static final Target OPTION_MONTH = Target.
            the("field to complete month of birth").
            located(By.id("birthMonth"));

    public static final Target OPTION_DAY = Target.
            the("field to complete day of birth").
            located(By.id("birthDay"));

    public static final Target OPTION_YEAR = Target.
            the("field to complete year of birth").
            located(By.id("birthYear"));


    public static final Target NEXT_BUTTON = Target.
            the("country of residence").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));



}
