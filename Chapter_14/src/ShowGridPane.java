import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
    public class ShowGridPane extends Application{
        @Override
        public void start(Stage PrimaryStage){
            GridPane pane = new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
            pane.setHgap(5.5);
            pane.setVgap(5.5);
            pane.add(new Label("First Name: "), 0, 0);
            pane.add(new TextField(), 1, 0);
            pane.add(new Label("Mi:"), 0, 1);
            pane.add(new TextField(), 1, 1);
            Button btADD = new Button("Add Name");
            pane.add(btADD, 1, 3);
            GridPane.setHalignment(btADD, HPos.RIGHT);
            Scene scene = new Scene(pane);
            PrimaryStage.setTitle("ShowGridPane");
            PrimaryStage.setScene(scene);
            PrimaryStage.show();
        }
    public static void main(String[]args){
        Application.launch(args);
    }
    }