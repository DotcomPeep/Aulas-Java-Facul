import javax.swing.JOptionPane;

public class AulaMetodo {

    public static void main(String[] args) {
        
        int n1, n2, resultado, ano;
        
        n1 = Integer.parseInt (JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Integer.parseInt (JOptionPane.showInputDialog("Digite o segundo número"));
        
        resultado = somar (n1, n2);
        
        JOptionPane.showMessageDialog (null, "O resultado da soma é " + resultado);
        multiplicar (n1, n2);
        ano = ObterAno();
        JOptionPane.showMessageDialog (null, "O ano atual é " + ano);
                
    }
    
        private static int somar (int n1, int n2) {
        
            return n1 + n2;
            
        }
         
        private static void multiplicar (int n1, int n2) {
        
            double r;
            r = n1 * n2;
            JOptionPane.showMessageDialog (null, "O resultado da multiplicação é " + r);
            
        }
        
        private static int ObterAno() {
        
            return 2021; 
            
        }
        
}
