package questao1.src;

public class PassagemRodoviaria extends Passagem {

    public PassagemRodoviaria(String passageiro, double tarifa) {
        super(passageiro, tarifa);
    }

    @Override
    public void calcularTaxaEmbarque() {
        this.taxaEmbarque = this.tarifa * 0.03;
    }

    @Override
    public String getModal() {
        return "Rodoviário";
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto";
    }
}