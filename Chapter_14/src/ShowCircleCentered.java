import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
    public class ShowCircleCentered extends Application{
        @Override
        //overriding the start method in the Application Class
        public void start(Stage PrimaryStage){
            //create a pane to hold the circle
            Pane pane = new Pane();
            //create a circle
            Circle simpleCircle = new Circle();
            simpleCircle.centerXProperty().bind(pane.widthProperty().divide(2));
            simpleCircle.centerYProperty().bind(pane.heightProperty().divide(2));
            simpleCircle.setRadius(200);
            simpleCircle.setStroke(Color.BLACK);
            simpleCircle.setFill(Color.AQUA);
            pane.getChildren().add(simpleCircle);
            Scene scene = new Scene(pane, 200,200);
            PrimaryStage.setTitle("Binded Circle");
            PrimaryStage.setScene(scene);
            PrimaryStage.show();
        }
        public static void main(String[]args){
            Application.launch();
        }
    }