package com.example.iparcialsi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button iniciarButton;

    @FXML
    protected void onHelloButtonClick() {
        // Cerrar la ventana actual
        Stage stage = (Stage) iniciarButton.getScene().getWindow();
        stage.close();

        // Abrir la ventana Pag1
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pag1.fxml"));
            Parent root = loader.load();
            Stage pag1Stage = new Stage();
            pag1Stage.setScene(new Scene(root));
            pag1Stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
