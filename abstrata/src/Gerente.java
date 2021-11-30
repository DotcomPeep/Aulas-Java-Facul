
public class Gerente extends Funcionario{

    public Gerente() {
    }
     
    public double calcularComissao (double vendas, double percentual) {
        return vendas * percentual / 100 + 1000;
    }
}
