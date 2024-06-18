module ca.georgiancollege.midterm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ca.georgiancollege.midterm to javafx.fxml;
    exports ca.georgiancollege.midterm;
}