public class Livro extends Item implements Calculavel {

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
