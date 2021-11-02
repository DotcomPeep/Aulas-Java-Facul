import javax.swing.JOptionPane;

public class AumentoSalario {

       public static void main(String[] args) {
           
           String NomeFunc, cargo, salario;
           
           double Superv, AnaCred, AuxCred;
           
           NomeFunc = JOptionPane.showInputDialog ("Digite aqui o nome do(a) funcionário(a)");
           cargo = JOptionPane.showInputDialog ("Digite aqui o cargo do(a) funcionário(a)");
           salario = JOptionPane.showInputDialog ("Digite aqui o salário do(a) funcionário(a)");
           Superv = 8000;
           AnaCred = 2300;
           AuxCred = 1600;
           
           if (Superv) {
           
           }
           
           //refazer dps
           JOptionPane.showMessageDialog (null, "O(a) funcionário(a) " + NomeFunc + " do cargo de " + cargo + " com o salário de " + salario + " iá receber mês que vem R$");
           
           
    }
    
}
