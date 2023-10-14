package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;


public class CheckIssueSelenideTest extends TestBase {

    @Test
    public void testIssueSearchTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        gitHubPage.openUrl()
                .sendKeys()
                .clickSearchResult()
                .clickIssueTab()
                .checkIssueName();

    }

}
