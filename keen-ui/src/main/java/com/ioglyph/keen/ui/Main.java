package com.ioglyph.keen.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import com.ioglyph.keen.engine.Info;

public class Main extends Application {

    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {
        Info info = new Info();
        primaryStage.setTitle("Keen UI");
        Button btn = new Button();
        btn.setText("Take Action");
        btn.setOnAction(event -> System.out.println("Keen UI Event Fired. " + info));

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 250, 200));
        primaryStage.show();
    }

}
