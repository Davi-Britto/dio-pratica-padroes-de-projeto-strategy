public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("João Silva");

        // Usuário escolhe a estratégia de pagamento por cartão de crédito
        usuario.escolherEstrategiaPagamento(new CartaoDeCredito("1234567890123456", "João Silva", "123", "12/25"));
        usuario.pagar(100.00);

        // Usuário escolhe a estratégia de pagamento por transferência bancária
        usuario.escolherEstrategiaPagamento(new TransferenciaBancaria("12345678", "Banco do Brasil"));
        usuario.pagar(300.00);

        // Usuário escolhe a estratégia de pagamento por Pix
        usuario.escolherEstrategiaPagamento(new Pix("joao.silva@pix.com"));
        usuario.pagar(50.00);
    }
}
