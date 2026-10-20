package questao2.src;

public class Matricula {
    private DocumentoFiscal documentoFiscal;
    private ProcessamentoPagamento pagamento;
    private ComprovanteMatricula comprovante;

    public Matricula(FabricaPais fabrica) {
        this.documentoFiscal = fabrica.criarDocumentoFiscal();
        this.pagamento = fabrica.criarPagamento();
        this.comprovante = fabrica.criarComprovante();
    }

    public void gerarRelatorio() {
        System.out.println("========================================");
        System.out.println("         RELATÓRIO DE MATRÍCULA         ");
        System.out.println("========================================");
        System.out.println("- Documento Fiscal : " + documentoFiscal.getDescricao());
        System.out.println("- Pagamento        : " + pagamento.getDescricao());
        System.out.println("- Comprovante      : " + comprovante.getDescricao());
        System.out.println("========================================\n");
    }
}