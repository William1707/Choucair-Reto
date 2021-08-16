package co.com.choucair.retoAtomatizacion.tasks;

import co.com.choucair.retoAtomatizacion.userInterface.RegisterUTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;


public class Register implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strCity;
    private String strPostalCode;

    public Register(String strFirstName,String strLastName, String strEmail, String strMonth,
                    String strDay, String strYear, String strCity, String strPostalCode) {

        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;

    }
    public static Register onThePage(String strFirstName,String strLastName, String strEmail,String strMonth,
                                     String  strDay,String strYear, String strCity, String strPostalCode)
    {
        return Tasks.instrumented(Register.class, strFirstName, strLastName, strEmail,
                strMonth,strDay,strYear,strCity,strPostalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(RegisterUTestPage.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(RegisterUTestPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(RegisterUTestPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(RegisterUTestPage.INPUT_EMAIL),
                Click.on(RegisterUTestPage.OPTION_MONTH),
                SelectFromOptions.byVisibleText(strMonth).from(RegisterUTestPage.OPTION_MONTH),
                Click.on(RegisterUTestPage.OPTION_DAY),
                SelectFromOptions.byVisibleText(strDay).from(RegisterUTestPage.OPTION_DAY),
                Click.on(RegisterUTestPage.OPTION_YEAR),
                SelectFromOptions.byVisibleText(strYear).from(RegisterUTestPage.OPTION_YEAR),
                Click.on(RegisterUTestPage.NEXT_BUTTON),


                Enter.theValue(strCity).into(RegisterUTestPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(RegisterUTestPage.INPUT_CITY),

                Clear.field(RegisterUTestPage.INPUT_POSTAL_CODE),
                Enter.theValue(strPostalCode).into(RegisterUTestPage.INPUT_POSTAL_CODE),

                Click.on(RegisterUTestPage.NEXT_BUTTON2),
                Click.on(RegisterUTestPage.BUTTON_NEXT3),
                Enter.theValue("William123*Choucair").into(RegisterUTestPage.INPUT_PASSWORD),
                Enter.theValue("William123*Choucair").into(RegisterUTestPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RegisterUTestPage.CHECK_STAY_INFORMED),
                Click.on(RegisterUTestPage.CHECK_CONDITIONS),
                Click.on(RegisterUTestPage.CHECK_PRIVACY),
                Click.on(RegisterUTestPage.BUTTON_FINAL)

        );

    }
}
