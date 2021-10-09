package lk.ijse.javafx.controller;

//import db.CrudUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class ItemsFormController {

    @FXML
    private TextField txtItCode;

    @FXML
    private TextField txtItName;

    @FXML
    private TextField txtPrice;

    @FXML
    private Button btnSv;


    public void SaveOnAction(javafx.event.ActionEvent actionEvent) {
//        try {
//            Object insert_into_customer_ = CrudUtil.execute("INSERT INTO Customer VALUES(?,?,?)",txtItCode.getText(),txtItName.getText(),txtPrice.getText()
//            );
//            if(insert_into_customer_!=null){
//                new Alert(Alert.AlertType.CONFIRMATION,"Customer Saved").show();
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
