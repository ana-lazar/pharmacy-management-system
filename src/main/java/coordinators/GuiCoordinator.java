package coordinators;

import controllers.LoginController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class GuiCoordinator extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        initView(primaryStage);
        primaryStage.setTitle("LOG IN");
        primaryStage.show();
    }

    private void initView(Stage primaryStage) throws IOException, SQLException {
        FXMLLoader loginLoader = new FXMLLoader();
        loginLoader.setLocation(getClass().getResource("/views/loginView.fxml"));
        AnchorPane loginLayout = loginLoader.load();
        Scene loginScene = new Scene(loginLayout);
        primaryStage.setScene(loginScene);
        LoginController controller = loginLoader.getController();
    }
}
