package com.aviso.controller;

import com.aviso.model.A1SelrCriteria;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class A1SelrController {

    @FXML
    private ComboBox<String> comboTerritoire;

    @FXML
    private ComboBox<String> comboTypeCommande;

    @FXML
    private ComboBox<String> comboLaboratoire;

    @FXML
    private ComboBox<String> comboMagasin;

    @FXML
    private ComboBox<String> comboArticle;

    @FXML
    private ComboBox<String> comboDateDebutOperateur;

    @FXML
    private DatePicker dateDebut;

    @FXML
    private ComboBox<String> comboDateFinOperateur;

    @FXML
    private DatePicker dateFin;

    @FXML
    private ComboBox<String> comboTypeClient;

    @FXML
    private TextField client;

    @FXML
    private ComboBox<String> comboNomOperateur;

    @FXML
    private TextField nom;

    @FXML
    private ComboBox<String> comboNom2Operateur;

    @FXML
    private TextField nom2;

    @FXML
    private TextField codePostal;

    @FXML
    private ComboBox<String> comboVilleOperateur;

    @FXML
    private TextField ville;

    @FXML
    private ComboBox<String> comboPays;

    @FXML
    public void initialize() {

        comboTerritoire.getItems().addAll(
                "France",
                "UE",
                "Export"
        );

        comboDateDebutOperateur.getItems().addAll(">=", "<=", "=");
        comboDateFinOperateur.getItems().addAll(">=", "<=", "=");

        comboTypeClient.getItems().addAll(
                "Client Livré",
                "Client Facturé"
        );

        comboNomOperateur.getItems().addAll(
                "commence par",
                "contient",
                "égal"
        );

        comboNom2Operateur.getItems().addAll(
                "commence par",
                "contient",
                "égal"
        );

        comboVilleOperateur.getItems().addAll(
                "commence par",
                "contient",
                "égal"
        );
    }

    @FXML
    private void rechercher() {

        A1SelrCriteria criteria = new A1SelrCriteria();

        criteria.setTerritoire(comboTerritoire.getValue());
        criteria.setTypeCommande(comboTypeCommande.getValue());

        // TODO migration du traitement WINDEV
    }

    @FXML
    private void reinitialiser() {

        comboTerritoire.getSelectionModel().clearSelection();
        comboTypeCommande.getSelectionModel().clearSelection();
        comboLaboratoire.getSelectionModel().clearSelection();
        comboMagasin.getSelectionModel().clearSelection();
        comboArticle.getSelectionModel().clearSelection();

        client.clear();
        nom.clear();
        nom2.clear();
        ville.clear();
        codePostal.clear();
    }
}