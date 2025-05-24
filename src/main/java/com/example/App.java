/*
* File: App.java
* Author: Bartha Levente
* Copyright: 2025, Bartha Levente
* Group: IN
* Date: 2025-05-24
* Github: https://github.com/barthaleventegabor/
* Licenc: MIT
*/
package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static Stage _stage;

    @Override
    public void start(Stage stage) throws IOException {
        _stage = stage;
        scene = new Scene(loadFXML("mainScene"), 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}