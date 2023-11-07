module com.example.gestionpedidos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;


    opens com.example.gestionpedidos to javafx.fxml;
    exports com.example.gestionpedidos;
    exports com.example.gestionpedidos.controllers;
    opens com.example.gestionpedidos.controllers to javafx.fxml;
}