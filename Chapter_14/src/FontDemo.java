import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
    public class FontDemo extends Application{
        @Override
        public void start(Stage PrimaryStage){
            //create a pane to hold the circle;
            Pane pane = new StackPane();
            //Create a circle and set its properties
            Circle simpleCircle = new Circle();
            simpleCircle.setRadius(50);
            simpleCircle.setStroke(Color.BLACK);
            simpleCircle.setFill(new Color(0.5,0.5,0.5,0.1));
            // Create a label and set its property
            Label label = new Label("JavaFX");
            label.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 20));
            pane.getChildren().addAll(simpleCircle,label);
            Scene scene = new Scene(pane);
            PrimaryStage.setTitle("DEMO");
            PrimaryStage.setScene(scene);
            PrimaryStage.show();
        }
        public static void main (String[]args){
            Application.launch(args);
        }
    }
