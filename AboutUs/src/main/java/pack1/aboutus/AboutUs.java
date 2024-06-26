package pack1.aboutus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AboutUs extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AboutUs.class.getResource("AboutUs.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 250);
        primaryStage.getIcons().add(new Image(AboutUs.class.getResourceAsStream("4.png")));
        primaryStage.setTitle("About Us");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
