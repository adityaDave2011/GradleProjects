package com.gradle.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Main.fxml"));

        try {
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            primaryStage.setTitle("Hello JavaFX");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
