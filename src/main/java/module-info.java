module com.example.gestionpedidos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestionpedidos to javafx.fxml;
    exports com.example.gestionpedidos;
}