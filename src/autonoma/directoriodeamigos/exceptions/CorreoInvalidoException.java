
package autonoma.directoriodeamigos.exceptions;

/**
 Exception lanzada cuando el correo electronico no es valido
 al registrar un amigo
 * @author Gilary
 * @since 20250322
 * @version 1.0
 */
public class CorreoInvalidoException extends RuntimeException{
    
     /**
     * Constructor de la excepcion con un mensaje 
     */
    
    public CorreoInvalidoException(){
        super("El correo electronico debe contener '@'. ");
        
    }
}
