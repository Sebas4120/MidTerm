package ca.georgiancollege.midterm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Hello2Controller extends BaseController{

    @FXML
    private Button changeView;


    public Hello2Controller(String title, String fxmlFileName) {
        super(title, fxmlFileName);
    }

    @FXML
    private void initialize(){

        //Button to change SCENES
        changeView.setOnAction(event -> {
            try {
                HelloController tableController = new HelloController("Hello1", "test");
                tableController.openPage();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
    }
}
