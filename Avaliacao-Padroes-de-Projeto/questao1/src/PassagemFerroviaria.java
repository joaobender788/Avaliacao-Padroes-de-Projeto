package questao1.src;

public class PassagemFerroviaria extends Passagem {

    public PassagemFerroviaria(String passageiro, double tarifa) {
        super(passageiro, tarifa);
    }

    @Override
    public void calcularTaxaEmbarque() {
        this.taxaEmbarque = this.tarifa * 0.05;
    }

    @Override
    public String getModal() {
        return "Ferroviário";
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto e comprovante de reserva";
    }
}