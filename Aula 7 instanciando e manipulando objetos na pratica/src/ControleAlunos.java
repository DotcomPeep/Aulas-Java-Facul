import javax.swing.JOptionPane;

public class ControleAlunos {

    public static void main(String[] args) {

        double media;
        
        Aluno aluno; //Declara o objeto aluno da classe Aluno
        aluno = new Aluno(); //Instancia o objeto aluno vazio
        //Preenchendo os atributos do objeto aluno
        aluno.setNome(JOptionPane.showInputDialog("Digite o Nome do aluno"));
        aluno.setRa(JOptionPane.showInputDialog("Digite o RA do aluno"));
        aluno.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina do aluno"));
        aluno.setAv1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Av1")));
        aluno.setTrabalho(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho")));
        aluno.setAv2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Av2")));
        //Calculando a média
        media = (aluno.getAv1() + aluno.getTrabalho() + aluno.getAv2()) / 3;
        //Exibindo os dados
        JOptionPane.showMessageDialog(null, aluno.getNome() + " você tem a média " + media);
        //IF statement
        if (media < 6) {
            JOptionPane.showMessageDialog(null, aluno.getNome() + "Infelizmente você não alcançou a média desejada.");
        } else {
            JOptionPane.showMessageDialog(null, "Parabéns, " + aluno.getNome() + " você alcançou a média desejada.");
        }
        
        System.out.println(aluno.getNome());
        System.out.println(aluno.getRa());
        System.out.println(aluno.getDisciplina());
        System.out.println(aluno.getAv1());
        System.out.println(aluno.getTrabalho());
        System.out.println(aluno.getAv2());

    }

}
