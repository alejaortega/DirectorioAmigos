
package autonoma.directoriodeamigos.exceptions;

/**
 Exception lanzada cuando falta algun dato obligatorio 
 al registrar un amigo
 * @author Gilary
 * @since 20250322
 * @version 1.0
 */
public class DatoObligatorioException extends RuntimeException{
    
    /**
     * Constructor de la excepcion con un mensaje 
     */
    
    public DatoObligatorioException(){
        super("Debe ingresar todos los datos.");
        
    }
    
}
