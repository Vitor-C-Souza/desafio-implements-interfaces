public class Main {
    public static void main(String[] args) {
        // 1
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        System.out.printf("U$600 são R$%.2f \n", conversorMoeda.converterDolarParaReal(600));

        // 2
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        System.out.printf("A area da sala é: %.2fm²\n", calculadoraSalaRetangular.calcularArea(4, 6));
        System.out.printf("O perimetro da sala é: %.2fm\n", calculadoraSalaRetangular.calcularPerimetro(4, 6));

        // 3
        var tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(4);

        // 4
        var conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        double F = conversorTemperaturaPadrao.celsiusParaFahrenheit(36);
        System.out.printf("36°C em Fahrenheit é: %.2f°F\n", F);
        System.out.printf("Agora se reverter a temperatura é: %.2f°C\n", conversorTemperaturaPadrao.fahrenheitParaCelsius(F));

        // 5
        Livro livro = new Livro();
        livro.setPreco(50);
        System.out.printf("O preço do livro é : R$%.2f\n", livro.calcularPrecoFinal());
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPreco(200);
        System.out.printf("O preço desse produto é: R$%.2f\n", produtoFisico.calcularPrecoFinal());

        Produto produto = new Produto();
        produto.setPreco(260);
        System.out.printf("A compra toda custou R$%.2f\n", produto.calcularPrecoTotal(5));
        produto.aplicarDesconto(15);
        System.out.printf("Todos os produtos comprados custaram R$%.2f depois de aplicado um desconto de 15 porcento\n", produto.calcularPrecoTotal(5));
        Servico servico = new Servico();
        servico.setPrecoHora(15);
        System.out.printf("O trabalho todo vai custar: %.2f\n", servico.calcularPrecoTotal(127));
        servico.aplicarDesconto(15);
        System.out.printf("Com desconto ficara R$%.2f", servico.calcularPrecoTotal(127));
    }
}