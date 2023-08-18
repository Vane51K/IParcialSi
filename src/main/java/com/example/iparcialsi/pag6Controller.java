package com.example.iparcialsi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class pag5Controller {
    @FXML
    private Button finalizarButton;
    @FXML
    private Button regresarButton;

    @FXML
    protected void onFinalizarButtonClick() {
        // Cerrar la ventana actual
        Stage stage = (Stage) finalizarButton.getScene().getWindow();
        stage.close();

        // Abrir la ventana Pag6
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pag6.fxml"));
            Parent root = loader.load();
            Stage pag6Stage = new Stage();
            pag6Stage.setScene(new Scene(root));
            pag6Stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onRegresarButtonClick() {
        // Cerrar la ventana actual
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();

        // Abrir la ventana Pag4
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pag4.fxml"));
            Parent root = loader.load();
            Stage pag4Stage = new Stage();
            pag4Stage.setScene(new Scene(root));
            pag4Stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
