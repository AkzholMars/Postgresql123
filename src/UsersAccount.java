import java.math.BigDecimal;
import java.util.Objects;

public class UsersAccount {
    private String login;
    private String email;
    private String accountNumber;
    private BigDecimal currency;

    public UsersAccount(String login, String email, String accountNumber, BigDecimal currency) {
        this.login = login;
        this.email = email;
        this.accountNumber = accountNumber;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "UsersAccount{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", currency=" + currency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersAccount that = (UsersAccount) o;
        return Objects.equals(login, that.login) && Objects.equals(email, that.email) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email, accountNumber, currency);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getCurrency() {
        return currency;
    }

    public void setCurrency(BigDecimal currency) {
        this.currency = currency;
    }
}
