public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            return true;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            System.out.println("Transferencia realizada com sucesso");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}
