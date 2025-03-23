
package autonoma.directoriodeamigos.models;

import java.util.ArrayList;
import java.util.List;
import autonoma.directoriodeamigos.exceptions.AmigoDuplicadoException;
import autonoma.directoriodeamigos.exceptions.AmigoNoEncontradoException;
import autonoma.directoriodeamigos.exceptions.CorreoInvalidoException;
import autonoma.directoriodeamigos.exceptions.DatoObligatorioException;
import autonoma.directoriodeamigos.exceptions.TelefonoInvalidoException;


/**
 Representa un directorio de amigos, permitiendo gestionar su información.
 * @author Gilary
 * @since 20250322
 * @version 1.0
 */

public class DirectorioAmigos {
    private List<Amigo> listaAmigos;

    /**
     * Constructor que inicializa la lista de amigos.
     */
    public DirectorioAmigos() {
        listaAmigos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo amigo al directorio.
     * 
     * @param nombres Nombre del amigo.
     * @param telefono Teléfono del amigo.
     * @param correo Correo electrónico del amigo.
     * @throws DatoObligatorioException Si alguno de los campos está vacío.
     * @throws CorreoInvalidoException Si el correo no contiene '@'.
     * @throws TelefonoInvalidoException Si el teléfono no inicia con 606 o 30.
     * @throws AmigoDuplicadoException Si el correo ya está registrado.
     */
    public void agregarAmigo(String nombres, String telefono, String correo) 
            throws DatoObligatorioException, CorreoInvalidoException, TelefonoInvalidoException, AmigoDuplicadoException {

        // Validar que todos los campos sean obligatorios
        if (nombres == null || nombres.isEmpty() ||
            telefono == null || telefono.isEmpty() ||
            correo == null || correo.isEmpty()) {
            throw new DatoObligatorioException();
        }

        // Validar que el correo contenga '@'
        if (correo.indexOf("@") == -1) {
            throw new CorreoInvalidoException();
        }

        // Validar que el teléfono inicie con "606" o "30"
        if (!(telefono.startsWith("606") || telefono.startsWith("30"))) {
            throw new TelefonoInvalidoException();
        }

        // Verificar si el correo ya está registrado
        for (Amigo a : listaAmigos) {
            if (a.getCorreoElectronico().equalsIgnoreCase(correo)) {
                throw new AmigoDuplicadoException();
            }
        }

        // Si pasa todas las validaciones, se agrega el amigo a la lista
        listaAmigos.add(new Amigo(nombres, telefono, correo));
    }

    /**
     * Busca un amigo en el directorio por su correo.
     * 
     * @param correo Correo del amigo a buscar.
     * @return El amigo encontrado.
     * @throws AmigoNoEncontradoException Si el amigo no está registrado.
     */
    public Amigo buscarAmigo(String correo) throws AmigoNoEncontradoException {
        for (Amigo a : listaAmigos) {
            if (a.getCorreoElectronico().equalsIgnoreCase(correo)) {
                return a; // Retorna el amigo si lo encuentra.
            }
        }
        // Si no se encuentra, lanza una excepción
        throw new AmigoNoEncontradoException();
    }

    /**
     * Obtiene la lista de amigos registrados en el directorio.
     * 
     * @return Lista de amigos.
     */
    public List<Amigo> getListaAmigos() {
        return listaAmigos;
    }
}