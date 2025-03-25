/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directoriodeamigos.models;

/**
 *
 * @author Alejandra
 */
/**
 * Clase Amigo que hereda de la clase abstracta Persona.
 * Representa un amigo con nombre, teléfono y correo electrónico.
 * Esta clase utiliza el constructor de la clase base Persona.
 * 
 * Se espera que se utilice en el contexto del directorio de amistades,
 * donde se gestionan instancias de amigos registrados en la aplicación.
 */
public class Amigo extends Persona {
    
    /**
     * Constructor de la clase Amigo.
     * 
     * @param nombre  Nombre del amigo
     * @param telefono  Número de teléfono del amigo
     * @param correo  Correo electrónico del amigo
     */
    public Amigo(String nombre, String telefono, String correo) {
        super(nombre, correo, telefono);
    }
}


