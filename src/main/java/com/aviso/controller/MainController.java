package com.aviso.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the main application view ({@code main.fxml}).
 */
public class MainController implements Initializable {

    @FXML
    private Label statusLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        statusLabel.setText("Application ready.");
    }

    // =========================================================================
    // Menu actions
    // =========================================================================

    @FXML
    private void handleExit() {
        Platform.exit();
    }

    @FXML
    private void handleAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Aviso V2");
        alert.setContentText("Version 1.0.0\nA JavaFX Desktop Application");
        alert.showAndWait();
    }
}
