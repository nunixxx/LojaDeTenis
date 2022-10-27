/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadetenis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private static Scene scene;
        
    @Override
    public void start(Stage stage) throws Exception {
        
        scene = new Scene (loadFXML("TelaInicial"), 1080, 600);
        
        stage.setScene(scene);
        stage.show();
    }
    
    static void setRoot(String fxml) throws Exception {
        scene.setRoot (loadFXML(fxml));
    }
    
    private static Parent loadFXML(String fxml) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}

