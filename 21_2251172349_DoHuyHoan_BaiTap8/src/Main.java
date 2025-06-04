public class Main {
    public static void main(String[] args) {
        // Tạo mediator trước
        AccountMediator mediator = new AccountMediator();

        // Tạo các component
        AccountComponent account = new AccountComponent(500);
        WithdrawComponent withdraw = new WithdrawComponent();

        // Thiết lập mediator cho các component
        account.setMediator(mediator);
        withdraw.setMediator(mediator);

        // Thiết lập component cho mediator
        mediator.setAccount(account);
        mediator.setWithdraw(withdraw);

        // Thử rút tiền
        System.out.println("Rút 300 lần 1:");
        withdraw.withdraw(300);

        System.out.println("Rút 300 lần 2:");
        withdraw.withdraw(300);

        System.out.println("Số dư cuối cùng: " + account.getBalance());
    }
}
