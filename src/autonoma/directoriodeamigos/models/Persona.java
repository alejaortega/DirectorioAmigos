
package autonoma.directoriodeamigos.models;

/**
 *Modelo que representa una persona
 * @author Gilary
  * @since 20250322
 * @version 1.0
 */
public abstract class Persona {
    ///Atributos
    /**
    * Nombre de la persona
    */
    private String nombre;
    
    /**
    * correo electronico de la persona
    */
    private String correoElectronico;
    
    /**
    * correo electronico de la persona
    */
    private String telefono;
    
    ///Metodo constructor
    /**
     * Inicializa los atributos de la clase Autor
     *
     * @param     nombre    
     * @param     correoElectronico
     * @param     telefono
    */
    
    public Persona (String nombre, String correoElectronico, String telefono){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }
    
    
    ///Metodo de Acceso 

     /**
     * Retorna el nombre de la persona
     * @param     nombre
     * @return    nombre de la persona
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modificar el nombre de la persona
     * @param     nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     /**
     * Retorna el correo de la persona
     * @param     correoElectronico
     * @return    correo de la persona
    */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

     /**
     * Modificar el correoElctronico de la persona
     * @param     correoElectronico
    */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

     /**
     * Retorna el telefono de la persona
     * @param     telefono
     * @return    telefono de la persona
    */
    public String getTelefono() {
        return telefono;
    }
         /**
     * Modificar el telefono de la persona
     * @param     telefono
    */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
