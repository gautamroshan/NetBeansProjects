import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;


public class Exercise14_18 extends Application {
    @Override
    public void start(Stage PrimaryStage){
        Pane pane = new Pane();
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -100; x<=100; x++){
            list.add(x+200.0);
            list.add(200 - scaleFactor * x * x);
        }
        Line line1 = new Line(10, 200, 390, 200);
        Line line2 = new Line(200, 30, 200, 390);
        
        Line line3 = new Line(390, 200, 370, 190);
        Line line4 = new Line(390, 200, 370, 190);
        Line line5 = new Line(200, 30, 190,50);
        Line line6 = new Line (200, 30, 210, 50);
        Text text1 = new Text(380, 170, "X");
        Text text2 = new Text(220, 40, "Y");
        
        pane.getChildren().addAll(polyline, line1, line2, line3, line4, line5, line6, text1, text2);
        Scene scene = new Scene (pane, 400, 250);
        PrimaryStage.setTitle("Exercise14_18");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
    }
    public static void main(String[]args){
        Application.launch(args);
    }
}
