module com.example.comp1008lw5st200492923 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1008lw5st200492923 to javafx.fxml;
    exports com.example.comp1008lw5st200492923;
}