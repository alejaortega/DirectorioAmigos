package autonoma.directoriodeamigos.main;

import autonoma.directoriodeamigos.views.VentanaPrincipal;

public class DirectorioDeAmigos {

    public static void main(String[] args) {
        DirectorioDeAmigos directorio = new DirectorioDeAmigos();
        VentanaPrincipal ventana = new VentanaPrincipal(null, directorio);
        ventana.setVisible(true);
    }
}