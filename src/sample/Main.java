package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javafx.scene.canvas.Canvas;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Canvas Example");

        Group root = new Group();
        Scene theScene = new Scene(root);
        primaryStage.setScene(theScene);

        Canvas canvas = new Canvas(400, 200);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.RED);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        Font theFont = Font.font("Times New Roman", FontWeight.BOLD, 48);
        gc.setFont(theFont);
        gc.fillText("Hello Word!", 60, 50);
        gc.strokeText("Hello Word!", 60,50);

        URL path = getClass().getClassLoader().getResource("resources/earth.jpeg");
        if(path != null) {
            Image earth = new Image(path.toExternalForm());
            gc.drawImage(earth, 180, 100);
        }

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
