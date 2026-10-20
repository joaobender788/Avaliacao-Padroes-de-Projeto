package questao1.src;

public abstract class Passagem {
    protected String passageiro;
    protected double tarifa;
    protected double taxaEmbarque;

    public Passagem(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public abstract void calcularTaxaEmbarque();
    public abstract String getModal();
    public abstract String getDocumentosExigidos();

    public String getPassageiro() {
        return passageiro;
    }

    public double getTarifa() {
        return tarifa;
    }

    public double getTaxaEmbarque() {
        return taxaEmbarque;
    }
}