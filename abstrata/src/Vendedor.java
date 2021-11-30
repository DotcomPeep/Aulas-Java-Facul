
public class Vendedor extends Funcionario{

    public Vendedor() {
    }
    
    public double calcularComissao (double vendas, double percentual) {
        return vendas * percentual / 100;
    }
    
}
