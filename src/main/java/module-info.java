module com.example.iparcialsi {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.iparcialsi to javafx.fxml;
    exports com.example.iparcialsi;
}