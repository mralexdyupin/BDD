import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import javax.xml.crypto.Data;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RefillCard {
    private SelenideElement head = $(byText("Пополнение карты"));
    private SelenideElement amount = $("[data-test-id = amount] .input__control");
    private SelenideElement from = $("[data-test-id= from] .input__control");
    private SelenideElement actionTransfer = $("[data-test-id = action-transfer]");

    public RefillCard() {
        head.shouldBe(Condition.visible);
    }

    public DashboardPage setFirstAmount(DataHelper.DateForFirstAmount dateForFirstAmount) {
        amount.setValue(dateForFirstAmount.getAmount());
        from.setValue(dateForFirstAmount.getFrom());
        actionTransfer.click();
        return new DashboardPage();
    }
    public DashboardPage setSecondAmount(DataHelper.DateForSecondAmount dateForSecondAmount) {
        amount.setValue(dateForSecondAmount.getAmount());
        from.setValue(dateForSecondAmount.getFrom());
        actionTransfer.click();
        return new DashboardPage();
    }
}
