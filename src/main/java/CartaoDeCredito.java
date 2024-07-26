public class CartaoDeCredito implements EstrategiaPagamento{

    private String numeroCartao;
    private String nomeTitular;
    private String cvv;
    private String dataValidade;

    public CartaoDeCredito(String numeroCartao, String nomeTitular, String cvv, String dataValidade) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.cvv = cvv;
        this.dataValidade = dataValidade;
    }

    @Override
    public void pagar(double quantia) {
        System.out.println("Realizado o pagamento de R$" + quantia + " via cartão de crédito");
    }
}
