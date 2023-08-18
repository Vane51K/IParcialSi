package com.example.iparcialsi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class pag4Controller {
    @FXML
    private Button siguienteButton;
    @FXML
    private Button regresarButton;

    @FXML
    protected void onSiguienteButtonClick() {
        // Cerrar la ventana actual
        Stage stage = (Stage) siguienteButton.getScene().getWindow();
        stage.close();

        // Abrir la ventana Pag5
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pag5.fxml"));
            Parent root = loader.load();
            Stage pag5Stage = new Stage();
            pag5Stage.setScene(new Scene(root));
            pag5Stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onRegresarButtonClick() {
        // Cerrar la ventana actual
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();

        // Abrir la ventana Pag3
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pag3.fxml"));
            Parent root = loader.load();
            Stage pag3Stage = new Stage();
            pag3Stage.setScene(new Scene(root));
            pag3Stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}