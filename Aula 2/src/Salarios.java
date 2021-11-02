import javax.swing.JOptionPane;

public class Salarios {

    public static void main(String[] args) {
        
        String nome, cargo;
        double salario;
        
        nome = JOptionPane.showInputDialog ("Digite o nome do funcionário");
        cargo = JOptionPane.showInputDialog ("Digite o cargo");
        salario = Double.parseDouble (JOptionPane.showInputDialog ("Digite o salário"));
        if (cargo.equalsIgnoreCase("gerente")){
            salario = salario * 1.50;    
        } else if (cargo.equalsIgnoreCase("vendedor")){
            salario = salario * 1.30;
        } else {
            salario = salario * 1.10;
        }
            JOptionPane.showMessageDialog(null, nome + " seu salário reajustado é de R$" + salario);
        
        System.out.println (nome);
        System.out.println (cargo);
        System.out.println ("O salário reajustado é de R$" + salario);
        
    }
    
}
