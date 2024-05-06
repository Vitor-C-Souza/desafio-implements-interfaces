public class ProdutoFisico extends Item implements Calculavel {
    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
