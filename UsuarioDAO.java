package dao;

import bean.UsuarioBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utilerias.ConexionBD;

public class UsuarioDAO {
    public int altaSocio(UsuarioBean usuarioBean) {
        PreparedStatement ps = null;
        int resultado = 0;
        String sql = "EXEC pa_insertar_usuario ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?;";// procedimiento almacenado
        try {
            con = conexionBD.getConexion();
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usuarioBean.geteMail());
            ps.setString(2, usuarioBean.getPassword());
            ps.setString(3, usuarioBean.getCuenta());
            ps.setString(4, usuarioBean.getRfc());
            ps.setString(5, usuarioBean.getNombre());
            ps.setString(6, usuarioBean.getaPaterno());
            ps.setString(7, usuarioBean.getaMaterno());
             
            ps.setString(8, usuarioBean.getDireccion());
            ps.setString(9, usuarioBean.getColonia());
            ps.setString(10, usuarioBean.getMunicipio());
            ps.setString(11, usuarioBean.getEstado());
            ps.setString(12, usuarioBean.getTelefono());
            ps.setInt(13, 2);
            ps.setInt(14, usuarioBean.getCp());
            ps.setInt(15, 1);
 
            resultado = ps.executeUpdate();
            resultado = 0;
            con.close();
            ps.close();
        } catch (SQLException ex) {
            resultado = 1;
            ex.printStackTrace();
        }
        return resultado;
    }
}