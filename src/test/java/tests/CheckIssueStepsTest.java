package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class CheckIssueStepsTest {

    @Test
    public void testAnnotatedStepTest() {
    SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openPage();
        steps.searchForRepository();
        steps.clickOnRepositoryLink();
        steps.openIssuesTab();
        steps.shouldSeeIssueWithNumber();

    }

}
