public class SuspendedState implements AccountState{
    Account account;

    public SuspendedState(Account account) {
        this.account = account;
    }

    public void deposit(Double depositAmount){
        System.out.println("You cannot deposit on a suspended account");
    }

    public void withdraw(Double withdrawAmount){
        System.out.println("You cannot withdraw on a suspended account");
    }

    public void activate() {
        account.setState(new ActiveState(account));
    }

    public void suspend() {
        System.out.println("Account already suspended");    
    }

    public void close() {
        account.setState(new ClosedState(account));
    }
}