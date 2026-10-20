package questao1.src;

public class PassagemAerea extends Passagem {

    public PassagemAerea(String passageiro, double tarifa) {
        super(passageiro, tarifa);
    }

    @Override
    public void calcularTaxaEmbarque() {
        this.taxaEmbarque = this.tarifa * 0.08;
    }

    @Override
    public String getModal() {
        return "Aéreo";
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto e bilhete eletrônico (e-ticket)";
    }
}