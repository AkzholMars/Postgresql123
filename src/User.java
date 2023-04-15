import java.math.BigDecimal;

public class User {
    private String login;
    private String fullname;
    private String email;
    private int age;
    private String gender;
    private Account userAccount;

    public static class Account {

        private int accountNumber;
        private int currency;

        @Override
        public String toString() {
            return "Account{" +
                    "accountNumber=" + accountNumber +
                    ", currency=" + currency +
                    '}';
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public int getCurrency() {
            return currency;
        }

        public void setCurrency(int currency) {
            this.currency = currency;
        }

        public Account(int accountNumber, int currency) {
            this.accountNumber = accountNumber;
            this.currency = currency;
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", userAccount=" + userAccount +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Account getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(Account userAccount) {
        this.userAccount = userAccount;
    }

    public User(String login, String fullname, String email, int age, String gender, Account userAccount) {
        this.login = login;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.userAccount = userAccount;
    }
}
