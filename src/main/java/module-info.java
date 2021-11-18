module com.homework.homework4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.homework.homework4 to javafx.fxml;
    exports com.homework.homework4;
}