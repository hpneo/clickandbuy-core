package clickandbuy.upc.edu.core.entity;
// Generated Sep 27, 2013 3:28:11 PM by Hibernate Tools 3.2.1.GA



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {

     private static final long serialVersionUID = 1L;
     private Integer usuCodigo;
     private Rol rol;
     private String usuNombreusuario;
     private String usuContrasenia;

    public Usuario() {
    }

    public Usuario(Rol rol, String usuNombreusuario, String usuContrasenia) {
       this.rol = rol;
       this.usuNombreusuario = usuNombreusuario;
       this.usuContrasenia = usuContrasenia;
    }
   
    public Integer getUsuCodigo() {
        return this.usuCodigo;
    }
    
    public void setUsuCodigo(Integer usuCodigo) {
        this.usuCodigo = usuCodigo;
    }
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String getUsuNombreusuario() {
        return this.usuNombreusuario;
    }
    
    public void setUsuNombreusuario(String usuNombreusuario) {
        this.usuNombreusuario = usuNombreusuario;
    }
    public String getUsuContrasenia() {
        return this.usuContrasenia;
    }
    
    public void setUsuContrasenia(String usuContrasenia) {
        this.usuContrasenia = usuContrasenia;
    }




}


