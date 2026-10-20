package questao2.src;

public class FabricaChile implements FabricaPais {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new BoletaChile();
    }

    @Override
    public ProcessamentoPagamento criarPagamento() {
        return new WebpayChile();
    }

    @Override
    public ComprovanteMatricula criarComprovante() {
        return new ComprovanteRutChile();
    }
}