import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
    public class ShowText extends Application{
        @Override
        public void start(Stage PrimaryStage){
            Scene scene = new Scene (new LinePane(),200,200);
            PrimaryStage.setTitle("ShowLine");
            PrimaryStage.setScene(scene);
            PrimaryStage.show();
        }
        public static void main(String[]args){
            Application.launch(args);
        }
    }
class LinePane extends Pane{
    public LinePane(){
        Line line1 = new Line(10,10,10,10);
        line1.endXProperty().bind(widthProperty().subtract(10));
        line1.endYProperty().bind(heightProperty().subtract(10));
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        getChildren().add(line1);
        
        Line line2 = new Line (10,10,10,10);
         line2.startXProperty().bind(widthProperty().subtract(10));
        line2.endYProperty().bind(heightProperty().subtract(10));
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        getChildren().add(line2);
        
    }
}