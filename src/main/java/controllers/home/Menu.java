
package controllers.home;

import com.mycompany.proyecto.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class Menu implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void cambiarVista() throws IOException{
        App.cambioDeVista("Cliente");
    }
        public void cambiarAdministrador() throws IOException{
        App.cambioDeVista("IniciarSesionAdmin");
    }
}
