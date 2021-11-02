
package persistencia;

public class Aluno {
    
    private String nome;
    private String ra;
    private String curso;
    private String disciplina;
    private double nota1;
    private double nota2;

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setRa(String ra) {
        this.ra = ra;
    }
    
    public String getRa() {
        return this.ra;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public String getDisciplina() {
        return this.disciplina;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
}
