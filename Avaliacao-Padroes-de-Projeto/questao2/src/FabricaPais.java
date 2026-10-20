package questao2.src;

public interface FabricaPais {
    DocumentoFiscal criarDocumentoFiscal();
    ProcessamentoPagamento criarPagamento();
    ComprovanteMatricula criarComprovante();
}