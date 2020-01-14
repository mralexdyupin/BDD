import com.github.javafaker.Faker;
import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    @Value
    public static class DateForFirstAmount {
        private String amount;
        private final String from = "5559 0000 0000 0002";
        private String result;
    }
    public static DateForFirstAmount getDateForFirstAmount() {
        Faker faker = new Faker();
        int number = faker.number().numberBetween(0,10000);
        String result = number + 10000 + "";
        String amountDate = String.valueOf((number));
        return new DateForFirstAmount(amountDate, result);
    }

    @Value
    public static class DateForSecondAmount {
        private String amount;
        private final String from = "5559 0000 0000 0001";
        private String result;
    }
    public static DateForSecondAmount getDateForSecondAmount() {
        Faker faker = new Faker();
        int number = faker.number().numberBetween(0,10000);
        String result = number + 10000 + "";
        String amountDate = String.valueOf(number);
        return new DateForSecondAmount(amountDate,result);
    }
}
