package questao2.src;

public class FabricaBrasil implements FabricaPais {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NfseBrasil();
    }

    @Override
    public ProcessamentoPagamento criarPagamento() {
        return new PixBrasil();
    }

    @Override
    public ComprovanteMatricula criarComprovante() {
        return new ComprovanteCpfBrasil();
    }
}