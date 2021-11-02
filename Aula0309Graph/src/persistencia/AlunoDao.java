package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class AlunoDao {

    private Connection conn;   //conexão com o BD
    private PreparedStatement st;   //executar comandos SQL
    private ResultSet rs;   //guardar o retorno de consulta no BD

    public boolean conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/controlealunos", "root", "987543@#Leo");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

    }

    public int salvar(Aluno aluno) {

        try {
            st = conn.prepareStatement("INSERT INTO ALUNOS VALUE(?, ?, ?, ?, ?, ?)");
            st.setString(1, aluno.getNome());
            st.setString(2, aluno.getRa());
            st.setString(3, aluno.getCurso());
            st.setString(4, aluno.getDisciplina());
            st.setDouble(5, aluno.getNota1());
            st.setDouble(6, aluno.getNota2());
            st.executeUpdate();
            return 1;
            //return true; se salvar for boolean
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                return 1062;
            } else {
                return 0;
            }
            //JOptionPane.showMessageDialog(null, "erro nº " + ex.getErrorCode());
            //return false; se salvar for boolean
        }
    }

    public Aluno consultar(String ra) {
        //buscar os dados do aluno
        //retornar aluno
        try {
            st = conn.prepareStatement("SELECT * FROM ALUNOS WHERE RA = ?");
        st.setString(1, ra);
        rs = st.executeQuery();
        if(rs.next()) {   //se localizou o aluno
            Aluno aluno = new Aluno();
            aluno.setNome(rs.getString("nome"));
            aluno.setRa(rs.getString("ra"));
            aluno.setCurso(rs.getString("curso"));
            aluno.setDisciplina(rs.getString("disciplina")); 
            aluno.setNota1(rs.getDouble("nota1"));
            aluno.setNota2(rs.getDouble("nota2"));
            return aluno;
            } else {
            return null;
            }
        } catch (SQLException ex) {
    return null;
        }
    } 
}
