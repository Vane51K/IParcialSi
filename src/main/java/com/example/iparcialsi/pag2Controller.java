package com.example.iparcialsi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class pag1Controller {
    @FXML
    private Button siguienteButton;
    @FXML
    private Button regresarButton;

    @FXML
    protected void onSiguienteButtonClick() {
        // Cerrar la ventana actual
        Stage stage = (Stage) siguienteButton.getScene().getWindow();
        stage.close();

        // Abrir la ventana Pag2
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pag2.fxml"));
            Parent root = loader.load();
            Stage pag2Stage = new Stage();
            pag2Stage.setScene(new Scene(root));
            pag2Stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onRegresarButtonClick() {
        // Cerrar la ventana actual
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();

        // Abrir la ventana Hello
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Hello.fxml"));
            Parent root = loader.load();
            Stage helloStage = new Stage();
            helloStage.setScene(new Scene(root));
            helloStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}