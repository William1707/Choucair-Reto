package co.com.choucair.retoAtomatizacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUTestPage {
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


    //-------Step 4 -----------//

    public static final Target BUTTON_NEXT3 =
            Target.the("Continue to the next phase")
                    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
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
