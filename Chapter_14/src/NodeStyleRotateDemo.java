import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
    public class NodeStyleRotateDemo extends Application{
        @Override
        public void start(Stage PrimaryStage){
         StackPane pane = new StackPane();
         Button BtOk = new Button ("Ok");
         BtOk.setStyle("-fx-border-color: blue;");
         pane.getChildren().add(BtOk);
         pane.setRotate(45);
         pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
         Scene scene = new Scene(pane, 200,250);
         PrimaryStage.setTitle("ShowingRotationto45");
         PrimaryStage.setScene(scene);
         PrimaryStage.show();
    }
        public static void main(String[]args){
            Application.launch(args);
        }
    }