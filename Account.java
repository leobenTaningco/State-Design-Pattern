public class Account {
    String accountNumber;
    Double balance;
    AccountState accountState;

    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState = new ActiveState(this);
    }

    // default state
    public void setState(AccountState accountState){
        this.accountState = accountState;
    }

    public AccountState getAccountState(){
        return accountState;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void activate() {
        accountState.activate();
    }

    public void suspend() {
        accountState.suspend();
    }

    public void close() {
        accountState.close();
    }

    public void deposit(Double depositAmount){
        accountState.deposit(depositAmount);
    }

    public void withdraw(Double withdrawAmount){
        accountState.withdraw(withdrawAmount);
    }
}


