package co.com.choucair.retoAtomatizacion.tasks;

import co.com.choucair.retoAtomatizacion.model.UTestsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


import static co.com.choucair.retoAtomatizacion.userInterface.FillOutFirstRecordPage.*;


public class FillOutFirstRecord implements Task {

    public FillOutFirstRecord(UTestsData uTestsData) {
        this.uTestsData = uTestsData;
    }

    UTestsData uTestsData;

    public static FillOutFirstRecord personalData(UTestsData uTestsData) {
        return Tasks.instrumented(FillOutFirstRecord.class,uTestsData );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(REGISTER_BUTTON),
                Enter.theValue(uTestsData.getStrFirstName()).into(INPUT_FIRSTNAME),
                Enter.theValue(uTestsData.getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(uTestsData.getStrEmail()).into(INPUT_EMAIL),
                Click.on(OPTION_MONTH),
                SelectFromOptions.byVisibleText(uTestsData.getStrMonth()).from(OPTION_MONTH),
                Click.on(OPTION_DAY),
                SelectFromOptions.byVisibleText(uTestsData.getStrDay()).from(OPTION_DAY),
                Click.on(OPTION_YEAR),
                SelectFromOptions.byVisibleText(uTestsData.getStrYear()).from(OPTION_YEAR),
                Click.on(NEXT_BUTTON)

        );

    }
}
