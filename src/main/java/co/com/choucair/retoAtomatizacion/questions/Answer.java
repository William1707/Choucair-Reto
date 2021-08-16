package co.com.choucair.retoAtomatizacion.questions;

import co.com.choucair.retoAtomatizacion.userInterface.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import javax.xml.transform.Result;
import java.sql.Struct;

public class Answer implements Question <Boolean> {


    public static Answer toThe() {
        return new Answer();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
       boolean result;
       String interfaceUser = Text.of(UserPage.TEXT_USER_REGISTERED).viewedBy(actor).asString();

       if (interfaceUser.equals(null)){
           result = false;
       } else {
           result = true;
       }
        return result;
    }


}
