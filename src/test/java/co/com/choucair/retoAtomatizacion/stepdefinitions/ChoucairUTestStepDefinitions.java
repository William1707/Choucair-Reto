package co.com.choucair.retoAtomatizacion.stepdefinitions;

import co.com.choucair.retoAtomatizacion.model.UTestsData;
import co.com.choucair.retoAtomatizacion.questions.Answer;
import co.com.choucair.retoAtomatizacion.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ChoucairUTestStepDefinitions {
    @Before
    public void setStage() { setTheStage(new OnlineCast());}

    @Given("^than William wants to register on the UTest platform$")
    public void thanStevenWantsToRegisterOnTheUTestPlatform() {

        theActorCalled("William").wasAbleTo(OpenUp.thePage());

    }

    @When("^you fill out the registration form$")
    public void youFillOutTheRegistrationForm( List<UTestsData> uTestsData) {

        theActorInTheSpotlight().attemptsTo(
                FillOutFirstRecord.personalData(uTestsData.get(0)),
                FillOutSecondForm.usersLocation(uTestsData.get(0)),
                FillOutTheThirdOptionalForm.devices(uTestsData.get(0)),
                FillOutTheFourthFormPage.security(uTestsData.get(0))
    );

    }


    @Then("^the new user will be created on the platform$")
    public void theNewUserWillBeCreatedOnThePlatform() {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));

    }
}
