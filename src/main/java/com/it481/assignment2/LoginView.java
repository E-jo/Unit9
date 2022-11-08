package com.it481.assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginView extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader( MainView.class.getResource( "login-view.fxml" ) );
        Scene scene = new Scene( fxmlLoader.load());
        stage.setTitle( "Login" );
        stage.setMinHeight( 300 );
        stage.setScene( scene );
        stage.setResizable( false );
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}