module com.example.project_ {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.project_ to javafx.fxml;
    exports com.example.project_;
}