package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PharmacistController {
    public void handleAcceptButton(ActionEvent event) {
    }

    private void showDetailsWindow() {
        try {
            FXMLLoader userLoader = new FXMLLoader();
            userLoader.setLocation(getClass().getResource("/views/pharmacistDetailsView.fxml"));
            AnchorPane pharmacistLayout = userLoader.load();
            Stage pharmacistStage = new Stage();
            pharmacistStage.setTitle("PHARMACIST DETAILS");
            pharmacistStage.initModality(Modality.WINDOW_MODAL);
            Scene pharmacistScene = new Scene(pharmacistLayout);
            pharmacistStage.setScene(pharmacistScene);
            PharmacistController pharmacistController = userLoader.getController();
            pharmacistStage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void handleViewDetailsButton(ActionEvent event) {
        showDetailsWindow();
    }
}
