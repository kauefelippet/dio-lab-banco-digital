import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements InterfaceConta {

    protected static final int AGENCIA_PADRAO = 1;
    protected static int NUMERADOR_CONTA = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int conta;
    protected double saldo;
    private List<Double> extrato = new ArrayList<>();

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        conta = NUMERADOR_CONTA;
        agencia = AGENCIA_PADRAO;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.saldo += valor;
        extrato.add(-valor);
    }

    @Override
    public void sacar(double valorSaque) {
        if(valorSaque > 0) {
            this.saldo -= valorSaque;
            extrato.add(-valorSaque);
            System.out.println("Valor de R$" + valorSaque + " sacado.");
        } else {
            System.out.println("O saque deve ser um valor positivo.");
        }
    }

    @Override
    public void depositar(double valorDeposito) {
        if(valorDeposito > 0) {
            this.saldo -= valorDeposito;
            extrato.add(valorDeposito);
            System.out.println("Valor de R$" + valorDeposito + " depositado.");
        } else {
            System.out.println("O depósito deve ser um valor positivo.");
        }
    }

    @Override
    public List<Double> extrato() {
        return this.extrato;
    }


}
