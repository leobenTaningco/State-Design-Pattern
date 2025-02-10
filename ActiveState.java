public class ActiveState implements AccountState {
    Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    public void deposit(Double depositAmount) {
        account.balance += depositAmount;
        System.out.println("Deposit. Account number " + account.getAccountNumber() + " has a balance of " + account.getBalance());
    }

    public void withdraw(Double withdrawAmount) {
        account.balance -= withdrawAmount;
        System.out.println("Withdraw. Account number " + account.getAccountNumber() + " has a balance of " + account.getBalance());
    }

    public void activate() {
        System.out.println("Account already active");
    }

    public void suspend() {
        account.setState(new SuspendedState(account));
    }

    public void close() {
        account.setState(new ClosedState(account));
    }
}
