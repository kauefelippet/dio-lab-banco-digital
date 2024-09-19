import java.util.List;

public interface InterfaceConta {

    void transferir(double valor, Conta contaDestino);

    void sacar(double valorSaque);

    void depositar(double valorDeposito);

    List<Double> extrato();
}
