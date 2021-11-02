import br.Calculos;
import br.Reajuste;
import javax.swing.JOptionPane;

public class Controle {

    public static void main(String[] args) {
        
        double a, b, c, salario, percentual, resultado, reajustar;
        
        a = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor a"));
        b = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor b"));
        c = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor c"));
        resultado = Calculos.somar(a, b, c);
        JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
        
        salario = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor salario"));
        percentual = Double.parseDouble (JOptionPane.showInputDialog ("Digite o percentual do reajuste"));
        reajustar = Reajuste.aumentarSalario(salario, percentual);
        JOptionPane.showMessageDialog(null, "O salário reajustado é " + reajustar);
    }
    
}
