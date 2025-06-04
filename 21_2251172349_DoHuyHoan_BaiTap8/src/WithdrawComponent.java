public class WithdrawComponent {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void withdraw(double amount) {
        mediator.notify("withdraw", amount);
    }
}
