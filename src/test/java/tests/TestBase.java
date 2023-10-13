package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.GitHubPage;

public class TestBase {
    GitHubPage gitHubPage = new GitHubPage();
    @BeforeAll
    static void beforeAll() {

        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }
}
