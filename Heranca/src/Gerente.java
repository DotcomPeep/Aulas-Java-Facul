public class Gerente extends Funcionario{
    private double comissao;

    public Gerente() {
    }

    public Gerente(double comissao, String nome, String cpf, String email) {
        super(nome, cpf, email);
        this.comissao = comissao;
    }
    
 

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
}
