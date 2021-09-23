
package MilkManagement;

import DB.DisplayDatabase;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;


public class TransactionController implements Initializable {

    @FXML
    private DatePicker tDate;
    @FXML
    private Button tSearchBtn;
    @FXML
    private TableView<?> tTableView;

    
    DisplayDatabase displayTData = new DisplayDatabase();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       displayTData.buildData(tTableView, "Select * from transactiontable;");
        
    }    

    @FXML
    private void searchTransaction(ActionEvent event) {
        LocalDate date = tDate.getValue();
        if(date==null){
        
        return;
        }
        
         displayTData.buildData(tTableView, "Select * from transactiontable where date='"+date+"';");
    }
    
}
