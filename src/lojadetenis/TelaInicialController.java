/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadetenis;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class TelaInicialController implements Initializable {

    @FXML
    private Button cadProdutos;

    @FXML
    private Button cadCategorias;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void switchCat() throws Exception {
        App.setRoot("CadastroCat");
       
    }
    @FXML
    private void switchProd() throws Exception {
        App.setRoot("CadastroProd");
       
    }

}
