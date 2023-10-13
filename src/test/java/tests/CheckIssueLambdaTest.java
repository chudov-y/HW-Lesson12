package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import pages.GitHubPage;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class CheckIssueLambdaTest extends TestBase {

    @Test
    public void testLambdaStep() {
      SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу", () -> {
            gitHubPage.openUrl();
        });
        step("Ищем репозиторий " + "<" +GitHubPage.REPOSITORY + ">", () -> {
         gitHubPage.sendKeys();
        });
        step("Кликаем по ссылке репозитория " + "<" +GitHubPage.REPOSITORY + ">", () -> {
            gitHubPage.clickSearchResult();
        });
        step("Открываем таб Issues", () -> {
           gitHubPage.clickIssueTab();
        });
        step("Проверяем наличие Issue с текстом " + "<" + GitHubPage.ISSUE + ">", () -> gitHubPage.checkIssueName());
    }
}
