package co.com.choucair.retoAtomatizacion.tasks;

import co.com.choucair.retoAtomatizacion.model.UTestsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.choucair.retoAtomatizacion.userInterface.FillOutSecondFormPage.*;

public class FillOutSecondForm  implements Task {

    public FillOutSecondForm(UTestsData uTestsData) {
        this.uTestsData = uTestsData;
    }

    UTestsData uTestsData;
    public static FillOutSecondForm usersLocation(UTestsData uTestsData) {
        return Tasks.instrumented(FillOutSecondForm.class,uTestsData );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(uTestsData.getStrCity()).into(INPUT_CITY),

                Hit.the(Keys.ARROW_DOWN).keyIn(INPUT_CITY),

                Clear.field(INPUT_POSTAL_CODE),
                Enter.theValue(uTestsData.getStrPostalCode()).into(INPUT_POSTAL_CODE),

                Click.on(NEXT_BUTTON2)


        );

    }
}
