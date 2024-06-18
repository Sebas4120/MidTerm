package ca.georgiancollege.midterm;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        HelloController controller = new HelloController("Midterm!", "test");
        controller.setStage(stage);
        controller.openPage();
    }

    public static void main(String[] args) {
        launch();
    }
}