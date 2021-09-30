package co.com.choucair.retoAtomatizacion.tasks;

import co.com.choucair.retoAtomatizacion.model.UTestsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.retoAtomatizacion.userInterface.FillOutTheThirdFormPage.BUTTON_NEXT3;

public class FillOutTheThirdOptionalForm implements Task {

    public static FillOutTheThirdOptionalForm devices(UTestsData uTestsData) {

        return Tasks.instrumented(FillOutTheThirdOptionalForm.class,uTestsData );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Click.on(BUTTON_NEXT3)
        );

    }
}
