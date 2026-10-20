package questao2.src;

public class ComprovanteCpfBrasil implements ComprovanteMatricula {
    @Override
    public String getDescricao() {
        return "Comprovante de matrícula com identificação do aluno por CPF";
    }
}