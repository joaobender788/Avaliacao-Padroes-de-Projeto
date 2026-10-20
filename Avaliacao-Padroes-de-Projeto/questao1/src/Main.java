package questao1.src;

public class Main {
    public static void main(String[] args) {
        EmissorPassagem emissorAereo = new EmissorAereo();
        emissorAereo.emitirPassagem("Daniel Vorcaro", 3000.00);

        EmissorPassagem emissorRodoviario = new EmissorRodoviario();
        emissorRodoviario.emitirPassagem("Flavio Bolsonaro", 100.00);

        EmissorPassagem emissorFerroviario = new EmissorFerroviario();
        emissorFerroviario.emitirPassagem("Luis Inacio", 300.00);
    }
}