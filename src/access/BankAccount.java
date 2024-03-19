package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //public 메서드 : deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        }else{
            System.out.println("유효하지 않는 금액이다.");
        }
    }
    //public 메서드 : widthdraw
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) { //잔고 - 출금할 금액 > 0
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    //public 메서드
    public int getBalance(){ //잔액을 원함
        return balance;
    }

    private boolean isAmountValid(int amount) {// 검증하는 메서드(로직)
        //금액이 0원 보다 커야함
        return amount > 0;
    }
}
