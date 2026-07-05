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

    private ResourceBundle bundle;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.bundle = resources;
        if (bundle != null && bundle.containsKey("main.status.ready")) {
            statusLabel.setText(bundle.getString("main.status.ready"));
        }
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
        if (bundle != null) {
            alert.setTitle(bundle.getString("about.title"));
            alert.setHeaderText(bundle.getString("about.header"));
            alert.setContentText(java.text.MessageFormat.format(bundle.getString("about.content"), "1.0.0"));
        } else {
            alert.setTitle("About");
            alert.setHeaderText("Aviso V2");
            alert.setContentText("Version 1.0.0\nA JavaFX Desktop Application");
        }
        alert.showAndWait();
    }
}
