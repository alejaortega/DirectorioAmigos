
package autonoma.directoriodeamigos.exceptions;
/**
 Exception lanzada cuando el numero de telefono 
 ingresado no cumple el requesito de iniciar en
 606 o 30
 * @author Gilary
 * @since 20250322
 * @version 1.0
 */
public class TelefonoInvalidoException extends RuntimeException {
    
    /**
     * Constructor de la excepcion con un mensaje 
     */
    
    public TelefonoInvalidoException(){
        super("El telefono debe iniciar con '606' o '30'. ");
    }
    
}
