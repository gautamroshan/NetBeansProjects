import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Example15_7 extends Application {
    @Override
    public void start(Stage PrimaryStage){
        Pane pane = new Pane();
        Text text = new Text(20,20,"Click and Drag to move this text\nHello Nepal");
        pane.getChildren().addAll(text);
        text.setOnMouseDragged(e->{
        text.setX(e.getX());
        text.setY(e.getY());
    });
        Scene scene = new Scene(pane,300, 100);
        PrimaryStage.setTitle("demo");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
    }
    public static void main(String[]args){
        Application.launch(args);
    }
}

