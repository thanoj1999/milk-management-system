
package MilkManagement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class MainseneController implements Initializable {

    @FXML
    private BorderPane rootLayout;
    @FXML
    private ToggleGroup group1;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      changeScene("Seller.fxml");

        
    }    

    @FXML
    private void setSale(ActionEvent event) {
          changeScene("Sale.fxml");
    }

    @FXML
    private void setStaff(ActionEvent event) {
          changeScene("Staff.fxml");
    }

    @FXML
    private void setStock(ActionEvent event) {
        changeScene("Stock.fxml");
    }


    @FXML
    private void setSeller(ActionEvent event) {
         changeScene("Seller.fxml");
    }
    
      public  void changeScene(String scenePath){
        
        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getResource(scenePath));
        AnchorPane pane = new AnchorPane();
           
    try{
            pane = (AnchorPane) loader.load();
            rootLayout.setCenter(pane);
        }
        catch(Exception e){

        }
     
    }

    @FXML
    private void setTransaction(ActionEvent event) {
        changeScene("Transaction.fxml");
    }

}
