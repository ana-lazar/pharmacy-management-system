package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonalController {
    public void handleDeleteButton(ActionEvent event) {
    }

    public void handleCancelButton(ActionEvent event) {
    }

    public void handleSearchButton(ActionEvent event) {
    }

    public void handleRemoveDrug(ActionEvent event) {
    }

    public void handlePickUpButton(ActionEvent event) {
    }

    public void handleAddDrug(ActionEvent event) {
    }

    private void showDetailsWindow() {
        try {
            FXMLLoader userLoader = new FXMLLoader();
            userLoader.setLocation(getClass().getResource("/views/personalDetailsView.fxml"));
            AnchorPane personalLayout = userLoader.load();
            Stage personalStage = new Stage();
            personalStage.setTitle("PERSONAL DETAILS");
            personalStage.initModality(Modality.WINDOW_MODAL);
            Scene personalScene = new Scene(personalLayout);
            personalStage.setScene(personalScene);
            PersonalController personalController = userLoader.getController();
            personalStage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void handleSaveButton(ActionEvent event) {
        showDetailsWindow();
    }
}
