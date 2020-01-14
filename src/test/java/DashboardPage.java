

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
    private SelenideElement heading = $("[data-test-id=dashboard]");
    private SelenideElement firstCardButton = $$("[data-test-id=action-deposit]").first();
    private SelenideElement secondCardButton = $$("[data-test-id=action-deposit]").last();
    private SelenideElement firstCardField = $$(".list .list__item").first();
    private SelenideElement secondCardField = $$(".list .list__item").last();

    public DashboardPage() {
        heading.shouldBe(visible);
    }

    public RefillCard openFirstAmount() {
        firstCardButton.click();
        return new RefillCard();
    }
    public RefillCard openSecondAmount() {
        secondCardButton.click();
        return new RefillCard();
    }
    public void dashboardSuccess(DataHelper.DateForFirstAmount dateForFirstAmount) {
        firstCardField.shouldHave(text(dateForFirstAmount.getResult()));
    }
    public void dashboardSuccessSecond(DataHelper.DateForSecondAmount dateForSecondAmount) {
        secondCardField.shouldHave(text(dateForSecondAmount.getResult()));
    }

}