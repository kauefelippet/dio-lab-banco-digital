public class Main {

    public static void main(String[] args) {

        Conta corrente = new ContaCorrente(new Cliente("Juninho"));
        Conta poupanca = new ContaPoupanca(new Cliente("Cleber"));

        corrente.depositar(1500);
        corrente.transferir(750, poupanca);
        poupanca.sacar(350);

        System.out.println(corrente.extrato());
        System.out.println(poupanca.extrato());
    }
}
