package ca.georgiancollege.midterm;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("Midterm!");
//        stage.setScene(scene);
//        stage.show();

        HelloController controller = new HelloController("Midterm!", "test");
        controller.setStage(stage);
        controller.openPage();
    }

    public static void main(String[] args) {
        launch();
    }
}