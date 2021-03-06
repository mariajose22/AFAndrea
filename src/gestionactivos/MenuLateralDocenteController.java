/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionactivos;

import static gestionactivos.GestionActivos.primaryStage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MariaJose
 */
public class MenuLateralDocenteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button solicitudesPeticion;
    @FXML
    private Button reporteReparacion;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        solicitudesPeticion.setOnMouseClicked(new EventHandler() {

       @Override
       public void handle(Event event) {
           itemSelected(solicitudesPeticion);
           
       }
   });
  reporteReparacion.setOnMouseClicked(new EventHandler() {

       @Override
       public void handle(Event event) {
           itemSelected(reporteReparacion);
           
       }
   });
    }    

    public void itemSelected(Button selected) {
       AnchorPane loader= null;
       AnchorPane loader2=null;
        AnchorPane loader3=null;
Scene newScene; //haciendo referencia al scene de la pagina principal
newScene = GestionActivos.scene;

Stage mainWindow; //Haciendo referencia al primaryStage
mainWindow = GestionActivos.primaryStage;

mainWindow.setScene(newScene);     
//cargando el menulateral

try{
loader2= (AnchorPane)FXMLLoader.load(getClass().getResource("/gestionactivos/vistas/menulateraldocente.fxml"));
loader3= (AnchorPane)FXMLLoader.load(getClass().getResource("/gestionactivos/vistas/lateralDerecho.fxml"));
}catch(Exception e){}
switch(selected.getText())
{
    case "Generar Solicitud de Reparacion":
        try{
             loader= (AnchorPane)FXMLLoader.load(getClass().getResource("/gestionactivos/vistas/RepararActivo.fxml"));
             
             primaryStage.setTitle("Reparar Activo");
             
            }catch(Exception e){System.out.print(e);}
        break;
}

   GestionActivos.rootPane.setCenter(loader);
  GestionActivos.rootPane.setLeft(loader2);
        

   
}
    
    }
    

