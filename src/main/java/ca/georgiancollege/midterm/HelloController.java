package ca.georgiancollege.midterm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.sql.SQLException;


public class HelloController extends BaseController{
    @FXML
    private Label welcomeText;

    @FXML
    private Button changeView;


    //CONEXION DE MI CONTROLLER CON EL VIEW CORRESPONDIENTE
    public HelloController(String title, String fxml) {
        super(title, fxml);
    }

    Model model = new Model();

    @FXML
    private void initialize() throws SQLException {
        System.out.println("DONE!");
//        model.insertRow();


        //Button to change SCENES
        changeView.setOnAction(event -> {
            try {
                Hello2Controller tableController = new Hello2Controller("Hello 2", "test2");
                tableController.openPage();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
    }


}