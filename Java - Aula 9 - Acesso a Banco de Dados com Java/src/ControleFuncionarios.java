import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ControleFuncionarios {

    public static void main(String[] args) {

        try {
            Connection con;
            Statement st;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/controle", "root", "");
            st = con.createStatement();
            st.executeUpdate("Insert into funcionario values('1234', 'Leonardo Silva', 'Desenvolvedor pleno', 10000);");
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não está na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados");
        }

    }

}
