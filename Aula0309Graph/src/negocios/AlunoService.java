package negocios;

public class AlunoService {
    
    public static double calcularMedia(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }
    
    public static String verificarAprovacao(double media){
        if (media < 6){
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }
    
}