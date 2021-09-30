package co.com.choucair.retoAtomatizacion.tasks;

import co.com.choucair.retoAtomatizacion.model.UTestsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.retoAtomatizacion.userInterface.FillOutTheFourthFormPage.*;

public class FillOutTheFourthFormPage implements Task {

    public FillOutTheFourthFormPage(UTestsData uTestsData) {
        this.uTestsData = uTestsData;
    }

    UTestsData uTestsData;
    public static FillOutTheFourthFormPage security(UTestsData uTestsData) {

        return Tasks.instrumented(FillOutTheFourthFormPage.class,uTestsData );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("William123*Choucair").into(INPUT_PASSWORD),
                Enter.theValue("William123*Choucair").into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_STAY_INFORMED),
                Click.on(CHECK_CONDITIONS),
                Click.on(CHECK_PRIVACY),
                Click.on(BUTTON_FINAL)

        );

    }
}
