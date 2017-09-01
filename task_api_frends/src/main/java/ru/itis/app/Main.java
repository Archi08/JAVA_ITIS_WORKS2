package ru.itis.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 04.06.2017
 * Main @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
public class Main extends Application{

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/viewWindows.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Вывод друзей");
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/css/list-view-style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
