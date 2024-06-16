module ca.georgiancollege.midterm {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.midterm to javafx.fxml;
    exports ca.georgiancollege.midterm;
}