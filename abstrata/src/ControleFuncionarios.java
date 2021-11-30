
public class ControleFuncionarios {

    public static void main(String[] args) {
        
        double resultado;
        
        Funcionario g;
        g = new Gerente();
        resultado = g.calcularComissao(12000, 10);
        
        System.out.println ("A comissão do gerente é " + resultado);
        
        Funcionario v;
        v = new Vendedor();
        resultado = v.calcularComissao(12000, 10);

        
        System.out.println ("A comissão do vendedor é " + resultado);
        
    }
    
}