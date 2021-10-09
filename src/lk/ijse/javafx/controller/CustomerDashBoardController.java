package lk.ijse.javafx.controller;

//import db.CrudUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class CustomerDashBoardController {

    @FXML
    private TextField txtCname;

    @FXML
    private TextField txtcage;

    @FXML
    private TextField txtcid;

    @FXML
    private Button btnSave;

    public void saveOnAction(javafx.event.ActionEvent actionEvent) {
//        try {
//            Object insert_into_customer_ = CrudUtil.execute("INSERT INTO Customer VALUES(?,?,?)",txtcid.getText(),txtCname.getText(),txtcage.getText()
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
