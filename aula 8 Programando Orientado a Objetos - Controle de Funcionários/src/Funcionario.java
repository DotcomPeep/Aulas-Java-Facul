
public class Funcionario {

    //Atributos da classe
    private String nome;
    private String matricula;
    private String cargo;
    private double salario;

    //Construtor
    public Funcionario() {
    }

    //Métodos setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Métodos getter
    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getCargo() {
        return this.cargo;
    }

    public double getSalario() {
        return this.salario;
    }
    //Métodos personalizados
    public void reajustarSalario() {
        if (this.cargo.equals("Gerente")) {
            this.salario = this.salario * 1.10;
        } else if (this.cargo.equals("Vendedor")) {
            this.salario = this.salario * 1.05;
        } else {
            this.salario = this.salario * 1.02;
        }

    }

}
