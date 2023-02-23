module com.example.incrementinganddecrementing {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.incrementinganddecrementing to javafx.fxml;
    exports com.example.incrementinganddecrementing;
}