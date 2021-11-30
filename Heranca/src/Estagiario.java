public class Estagiario extends Funcionario {
    private int tempoContrato;

    public Estagiario() {
    }

    public Estagiario(int tempoContrato, String nome, String cpf, String email) {
        super(nome, cpf, email);
        this.tempoContrato = tempoContrato;
    }
    

    public int getTempoContrato() {
        return tempoContrato;
    }

    public void setTempoContrato(int tempoContrato) {
        this.tempoContrato = tempoContrato;
    }
    
}
