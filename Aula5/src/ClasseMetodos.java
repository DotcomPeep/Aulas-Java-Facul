
import javax.swing.JOptionPane;

public class ClasseMetodos {

    public static void main(String[] args) {

        double x1, x2, x3, x4, resultado;
        int n1, n2, n3, n4;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número inteiro"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número inteiro"));

        Calculos calc;
        calc = new Calculos();
        resultado = calc.somar(n1, n2, n3, n4);
        JOptionPane.showMessageDialog(null, "O resultado da soma é " + resultado);

        resultado = calc.somar(n1, n4);
        JOptionPane.showMessageDialog(null, "O resultado da soma é " + resultado);

        x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número real"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número real"));
        x3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número real"));
        x4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número real"));
        
        Calculos cal;
        cal = new Calculos ();
        resultado = cal.multiplicar (x1, x2);
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é " + resultado);
        
        Calculos calculos;
        calculos = new Calculos ();
        resultado = calculos.multiplicar (x1, x2, x3, x4);
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é " + resultado);

    }

}
