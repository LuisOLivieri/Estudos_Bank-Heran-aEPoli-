package entities;

public class SavingsAccount extends Account{ //Final evita de criar subclasses dela. Nao pode ser herdade por
    // outra
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate; //saldo + a taxa de juros
    }

    @Override //Sobrescrever para nao descontar o valor de 5.0 do saque.
    public final void withdraw(double amount){
         balance -= amount;
    }
}
