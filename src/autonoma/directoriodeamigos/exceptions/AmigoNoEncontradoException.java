
package autonoma.directoriodeamigos.exceptions;

/**
 Exception lanzada cuando se busca un amigo por
 correo electronico y no se encuentra registrado
 * @author Gilary
 * @since 20250322
 * @version 1.0
 */
public class AmigoNoEncontradoException extends RuntimeException{
       
    /**
     * Constructor de la excepcion con un mensaje 
     */
    
    public AmigoNoEncontradoException(){
        super("El amigo no se encuentra registrado. ");
    }
}
