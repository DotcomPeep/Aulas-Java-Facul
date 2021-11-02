import javax.swing.JOptionPane;

public class ControleFuncionarios {

    public static void main(String[] args) {
        
        Funcionario funcionario;
        //instancia um objeto da classe Funcionario, chamado funcionario
        funcionario = new Funcionario();
        //Cadastrei os dados nos atributos do objeto da classe Funcionario 
        funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do(a) funcionário(a)"));
        funcionario.setMatricula(JOptionPane.showInputDialog("Digite a matrícula do(a) funcionário(a)"));
        funcionario.setCargo(JOptionPane.showInputDialog("Digite o cargo do(a) funcionário(a)"));
        funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do(a) funcionário(a)")));        
        //Exibir os dados cadastrados no objeto
        JOptionPane.showMessageDialog(null, "Nome: " + funcionario.getNome());
        JOptionPane.showMessageDialog(null, "Matrícula: " + funcionario.getMatricula());
        JOptionPane.showMessageDialog(null, "Cargo: " + funcionario.getCargo());
        JOptionPane.showMessageDialog(null, "Salário: " + funcionario.getSalario());
        
        funcionario.reajustarSalario();
        JOptionPane.showMessageDialog(null, "Salário reajustado R$" + funcionario.getSalario());
    }
    
}
