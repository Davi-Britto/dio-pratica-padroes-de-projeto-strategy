public class Usuario {

    private String nome;
    private EstrategiaPagamento estrategiaPagamento;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void escolherEstrategiaPagamento(EstrategiaPagamento estrategia) {
        this.estrategiaPagamento = estrategia;
    }

    public void pagar(double quantia) {
        if (estrategiaPagamento == null) {
            throw new IllegalStateException("Estratégia de pagamento não definida.");
        }
        estrategiaPagamento.pagar(quantia);
    }
}
