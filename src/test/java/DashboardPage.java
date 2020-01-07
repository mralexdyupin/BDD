

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
    private SelenideElement heading = $("[data-test-id=dashboard]");
    private SelenideElement firstCardButton = $$("[data-test-id=action-deposit]").first();
    private SelenideElement secondCardButton = $$("[data-test-id=action-deposit]").last();

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


}