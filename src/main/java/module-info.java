module com.example.homework4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens gb.homework4 to javafx.fxml;
    exports gb.homework4;
}