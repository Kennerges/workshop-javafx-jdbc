module workshop.javafx.jdbc {
    requires javafx.fxml;
    requires javafx.controls;
    opens gui;
    opens application;
    opens model.entities;
    opens model.services;
}