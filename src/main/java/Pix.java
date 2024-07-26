public class Pix implements EstrategiaPagamento{
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double quantia) {
        System.out.println("Pagamento de " + quantia + " realizado via Pix com a chave " + chavePix + ".");
    }
}
