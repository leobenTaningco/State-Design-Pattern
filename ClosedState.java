public class ClosedState implements AccountState{

        Account account;
        public ClosedState(Account account) {
            this.account = account;
        }
    
        public void deposit(Double depositAmount){
            System.out.println("You cannot deposit on a suspended account");
        }
    
        public void withdraw(Double withdrawAmount){
            System.out.println("You cannot withdraw on a suspended account");
        }    
    
        public void activate() {
            System.out.println("You cannot activate a closed account");
        }    
        public void suspend() {
            System.out.println("You cannot suspend a closed account");
        }
        public void close(){
            System.out.println("Account already closed");
        }

}
