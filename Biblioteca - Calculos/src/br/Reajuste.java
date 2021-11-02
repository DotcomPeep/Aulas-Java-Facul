package br;

public class Reajuste {
    
    public static double aumentarSalario(double salario, double percentual) {
        return salario + salario * percentual / 100;
    }
    
    public static double reduzirSalario(double salario, double percentual){    //apenas ex, não se pode reduzir salário
        return salario - salario * percentual / 100;
    }
    
    
    
}
