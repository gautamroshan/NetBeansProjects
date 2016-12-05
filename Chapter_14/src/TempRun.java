import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
    public class TempRun extends Application{
        @Override
        public void start(Stage PrimaryStage){
            Pane pane = new Pane();
            
            for (int i=0; i<4; i++){
                Rectangle r = new Rectangle(100,50,100,30);
                r.setRotate(i*360/8);
                r.setStroke(Color.color(Math.random(),Math.random(), Math.random()));
                r.setFill(Color.WHITE);
                pane.getChildren().add(r);
            }
            Scene scene = new Scene(pane, 250, 150);
            PrimaryStage.setTitle("Show Rectangle");
            PrimaryStage.setScene(scene);
            PrimaryStage.show();
        }
        public static void main(String[]args){
            Application.launch();
        }
    }