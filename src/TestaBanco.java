public class TestaBanco {
    public static void main(String[] args) {
        Conta contaJoao = new Conta();
        contaJoao.titular = new Cliente();
        contaJoao.titular.nome = "João";
        contaJoao.titular.cpf = "123.456.789-00";
        contaJoao.titular.profissao = "Programador";
        contaJoao.agencia = 123;
        contaJoao.numero = 456;
        contaJoao.saldo = 1000.0;

        System.out.println("Nome: " + contaJoao.titular.nome);

    }
}
