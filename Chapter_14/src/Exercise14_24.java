import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_24 extends Application {
    @Override
    public void start(Stage PrimaryStage){
        System.out.print("Enter five points: ");
        Scanner input = new Scanner(System.in);
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        
        ObservableList<Double> list = polygon.getPoints();
        for(int i = 0; i<4; i++){
            list.add(input.nextDouble());
            list.add(input.nextDouble());
        }
        double x5 = input.nextDouble();
        double y5 = input.nextDouble();
        
        Pane pane = new Pane();
        double paneWidth = 200;
        double paneHeight = 200;
        Text text = new Text(50, paneHeight - 20, "");
        if(polygon.contains(x5,y5)){
            text.setText("The point is inside the polygon");
            System.out.println("The point is not inside the polygon");
        }
        else{
            text.setText("The point is not inside the polygon");
            System.out.println("The point is inside the polygon");
        }
        pane.getChildren().addAll(polygon, new Circle(x5,y5,10), text);
        Scene scene = new Scene(pane, paneWidth, paneHeight);
        PrimaryStage.setTitle("Exercise14_24");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
        
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
