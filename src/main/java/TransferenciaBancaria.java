public class TransferenciaBancaria implements EstrategiaPagamento{

    private String numeroConta;
    private String nomeBanco;

    public TransferenciaBancaria(String numeroConta, String nomeBanco) {
        this.numeroConta = numeroConta;
        this.nomeBanco = nomeBanco;
    }

    @Override
    public void pagar(double quantia) {
        System.out.println("Pagamento de " + quantia + " realizado por transferência bancária.");
    }
}
