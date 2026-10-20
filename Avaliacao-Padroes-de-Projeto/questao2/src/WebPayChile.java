package questao2.src;

public class WebpayChile implements ProcessamentoPagamento {
    @Override
    public String getDescricao() {
        return "Processamento de pagamento via Webpay";
    }
}