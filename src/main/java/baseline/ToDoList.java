package baseline;

/*
 *  UCF COP3330 Summer 2021 baseline.Application Assignment 1 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

import java.util.Objects;


public class ToDoList extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ToDoList.fxml")));

        Scene scene = new Scene(root);
        stage.setTitle("Todo List App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
