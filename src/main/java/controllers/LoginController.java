package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    private void showPersonalWindow() {
        try {
            FXMLLoader userLoader = new FXMLLoader();
            userLoader.setLocation(getClass().getResource("/views/personalView.fxml"));
            AnchorPane personalLayout = userLoader.load();
            Stage personalStage = new Stage();
            personalStage.setTitle("PERSONAL");
            personalStage.initModality(Modality.WINDOW_MODAL);
            Scene personalScene = new Scene(personalLayout);
            personalStage.setScene(personalScene);
            PersonalController personalController = userLoader.getController();
            personalStage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private void showPharmacistWindow() {
        try {
            FXMLLoader userLoader = new FXMLLoader();
            userLoader.setLocation(getClass().getResource("/views/pharmacistView.fxml"));
            AnchorPane pharmacistLayout = userLoader.load();
            Stage pharmacistStage = new Stage();
            pharmacistStage.setTitle("PHARMACIST");
            pharmacistStage.initModality(Modality.WINDOW_MODAL);
            Scene pharmacistScene = new Scene(pharmacistLayout);
            pharmacistStage.setScene(pharmacistScene);
            PharmacistController pharmacistController = userLoader.getController();
            pharmacistStage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void handleLoginButton(ActionEvent event) {
        showPersonalWindow();
        showPharmacistWindow();
    }
}
