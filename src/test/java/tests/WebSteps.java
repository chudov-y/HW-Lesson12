package tests;

import io.qameta.allure.Step;
import pages.GitHubPage;

public class WebSteps extends TestBase {

    @Step("Открываем главную страницу")
    public void openPage (){
        gitHubPage.openUrl();
    }

    @Step("Ищем репозиторий " + GitHubPage.REPOSITORY)
    public void searchForRepository() {
        gitHubPage.sendKeys();
    }

    @Step("Кликаем по ссылке репозитория " + GitHubPage.REPOSITORY)
    public void clickOnRepositoryLink() {
        gitHubPage.clickSearchResult();
    }

    @Step("Открываем таб Issues")
    public void openIssuesTab() {
        gitHubPage.clickIssueTab();
    }

    @Step("Проверяем наличие Issue с текстом " + GitHubPage.ISSUE)
    public void shouldSeeIssueWithNumber() {
        gitHubPage.checkIssueName();
    }
}
