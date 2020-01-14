import lombok.val;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class TestAppIbank {
    @Test
        void testFieldFirstCard() {
        open("http://localhost:9999");
        val loginPage = new LoginPage();
        val authInfo = DataHelper.getAuthInfo();
        val verificationPage = loginPage.validLogin(authInfo);
        val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        val dashboardPage = new DashboardPage();
        dashboardPage.openFirstAmount();
        val refillCard = new RefillCard();
        val dateForFirstAmount = DataHelper.getDateForFirstAmount();
        refillCard.setFirstAmount(dateForFirstAmount);
        dashboardPage.dashboardSuccess(dateForFirstAmount);
    }

    @Test
    void testFieldSecondCard() {
        open("http://localhost:9999");
        val loginPage = new LoginPage();
        val authInfo = DataHelper.getAuthInfo();
        val verificationPage = loginPage.validLogin(authInfo);
        val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        val dashboardPage = new DashboardPage();
        dashboardPage.openSecondAmount();
        val refillCard = new RefillCard();
        val dateForSecondAmount = DataHelper.getDateForSecondAmount();
        refillCard.setSecondAmount(dateForSecondAmount);
        dashboardPage.dashboardSuccessSecond(dateForSecondAmount);
    }
}
