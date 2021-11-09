
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ClienteDao {
    private Connection con;
    private PreparedStatement st;
    
    public boolean conectar() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acesso", "root", "987543@#Leo");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }   
    }
    
    public boolean salvar(Cliente cliente) {
        try {
            //Executar INSERT com BD
            st = con.prepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?,?,?)");
            st.setString(1, cliente.getNome());
            st.setString(2, cliente.getCpf());
            st.setString(3, cliente.getEndereco());
            st.setString(4, cliente.getBairro());
            st.setString(5, cliente.getCidade());
            st.setString(6, cliente.getTelefone());
            st.setDouble(7, cliente.getRenda());
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
