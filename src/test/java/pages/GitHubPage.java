package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class GitHubPage {
    public static final String REPOSITORY = "chudov-y/HW_Lesson11";
    public static final String ISSUE = "New issue for test";

    public GitHubPage openUrl() {
        open("https://github.com");
        return this;
    }

    public GitHubPage sendKeys() {
        $(".search-input").click();
        $("#query-builder-test").sendKeys(REPOSITORY);
        $("#query-builder-test").pressEnter();
        return this;
    }
    public GitHubPage clickSearchResult () {
        $(linkText("chudov-y/HW-Lesson11")).click();
        return this;
    }

    public GitHubPage clickIssueTab () {
        $("#issues-tab").click();
        return this;
    }

    public void checkIssueName () {
        $(withText(ISSUE)).should(Condition.exist);
    }


}
