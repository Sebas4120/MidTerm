package ca.georgiancollege.midterm;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.SQLException;

public class HelloController extends BaseController{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    //CONEXION DE MI CONTROLLER CON EL VIEW CORRESPONDIENTE
    public HelloController(String title, String fxml) {
        super(title, fxml);
    }

    Model model = new Model();

    @FXML
    private void initialize() throws SQLException {
        System.out.println("DONE!");
        model.insertRow();
    }
}