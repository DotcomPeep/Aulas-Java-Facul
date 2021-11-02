
import javax.swing.JOptionPane;

public class EstruturasRepeticao {

    public static void main(String[] args) {
        //Variável simples
        String nome;

        nome = "Leonardo";
        nome = "Hanna Sayuri";
        //Array = Vetor
        /*  String nomes[];

        nomes = new String[3];

        nomes[0] = JOptionPane.showInputDialog ("Digite o primeiro nome");
        nomes[1] = JOptionPane.showInputDialog ("Digite o segundo nome");
        nomes[2] = JOptionPane.showInputDialog ("Digite o terceiro nome");
        JOptionPane.showMessageDialog(null, nomes[0] + " - " + nomes[1] + " - " + nomes[2]);
         */

        String names[];
        int tamanho = Integer.parseInt (JOptionPane.showInputDialog ("Quantos nomes quer cadastrar?"));
        names = new String[tamanho];
        for (int contador = 0; contador < names.length; contador++) {
            names[contador] = JOptionPane.showInputDialog("Digite o nome");
        }
        System.out.println (names);

        //Array = Matriz
        String dados[][];

        dados = new String[2][2];

        dados[0][0] = "Leonardo";
        dados[0][1] = "Hanna";
        dados[1][0] = "Daniela";
        dados[1][1] = "Katherine Pierce";

    }

}
