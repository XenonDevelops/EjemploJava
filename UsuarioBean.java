package bean;
 
/**
 *
 * @author Angel
 */
public class UsuarioBean {
 
    private int idUsuario;
    private String eMail;
    private String password;
    private String cuenta;
    private String rfc;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String direccion;
    private String colonia;
    private String municipio;
    private String estado;
    private String telefono;
    private int permisos;
    private int cp;
    private int status;
 
    public int getIdUsuario() {
        return idUsuario;
    }
 
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
 
    public String geteMail() {
        return eMail;
    }
 
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getCuenta() {
        return cuenta;
    }
 
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
 
    public String getRfc() {
        return rfc;
    }
 
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getaPaterno() {
        return aPaterno;
    }
 
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }
 
    public String getaMaterno() {
        return aMaterno;
    }
 
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
 
    public String getDireccion() {
        return direccion;
    }
 
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    public String getColonia() {
        return colonia;
    }
 
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
 
    public String getMunicipio() {
        return municipio;
    }
 
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
 
    public String getEstado() {
        return estado;
    }
 
    public void setEstado(String estado) {
        this.estado = estado;
    }
 
    public String getTelefono() {
        return telefono;
    }
 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 
    public int getPermisos() {
        return permisos;
    }
 
    public void setPermisos(int permisos) {
        this.permisos = permisos;
    }
 
    public int getCp() {
        return cp;
    }
 
    public void setCp(int cp) {
        this.cp = cp;
    }
 
    public int getStatus() {
        return status;
    }
 
    public void setStatus(int status) {
        this.status = status;
    }
 
    public String toString() {
        return nombre;
    }
}