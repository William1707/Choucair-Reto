package co.com.choucair.retoAtomatizacion.tasks;

import co.com.choucair.retoAtomatizacion.userInterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UTestPage uTestPage;
    public static OpenUp thePage(){ return Tasks.instrumented(OpenUp.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(uTestPage));

    }
}
