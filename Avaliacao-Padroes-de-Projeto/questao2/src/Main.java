package questao2.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Processando Matrícula no Brasil...");
        FabricaPais fabricaBrasil = new FabricaBrasil();
        Matricula matriculaBrasil = new Matricula(fabricaBrasil);
        matriculaBrasil.gerarRelatorio();

        System.out.println("Processando Matrícula no Chile...");
        FabricaPais fabricaChile = new FabricaChile();
        Matricula matriculaChile = new Matricula(fabricaChile);
        matriculaChile.gerarRelatorio();
    }
}