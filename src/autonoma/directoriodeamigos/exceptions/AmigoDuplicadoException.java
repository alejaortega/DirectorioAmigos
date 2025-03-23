
package autonoma.directoriodeamigos.exceptions;

/**
 Exception lanzada cuando se intenta registrar un
 amigo con un correo electronico que ya existe en el sistema
 * @author Gilary
 * @since 20250322
 * @version 1.0
 */
public class AmigoDuplicadoException extends RuntimeException {
    
    /**
     * Constructor de la excepcion con un mensaje 
     */
    
    public AmigoDuplicadoException(){
        super("El amigo ya esta registrado.");
    }
    
    
}
