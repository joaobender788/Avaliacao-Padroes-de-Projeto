package questao1.src;

public abstract class EmissorPassagem {

    // Template Method: Procedimento fixo de emissão
    public final Passagem emitirPassagem(String passageiro, double tarifa) {
        Passagem passagem = criarPassagem(passageiro, tarifa);
        passagem.calcularTaxaEmbarque();
        imprimirResumo(passagem);
        return passagem;
    }

    // Factory Method abstrato
    protected abstract Passagem criarPassagem(String passageiro, double tarifa);

    protected void imprimirResumo(Passagem p) {
        System.out.println("------------------");
        System.out.println("Resumo da Emissão");
        System.out.println("------------------");
        System.out.println("Modal: " + p.getModal());
        System.out.println("Passageiro: " + p.getPassageiro());
        System.out.println("Tarifa: R$ " + String.format("%.2f", p.getTarifa()));
        System.out.println("Taxa de Embarque: R$ " + String.format("%.2f", p.getTaxaEmbarque()));
        System.out.println("Documentos Exigidos: " + p.getDocumentosExigidos());
        System.out.println("-------------\n");
    }
}