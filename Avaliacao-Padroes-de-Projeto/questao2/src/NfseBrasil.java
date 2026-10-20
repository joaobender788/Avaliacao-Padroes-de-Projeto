package questao2.src;

public class NfseBrasil implements DocumentoFiscal {
    @Override
    public String getDescricao() {
        return "NFS-e (Nota Fiscal de Serviços eletrônica) com ISS de 5%";
    }
}