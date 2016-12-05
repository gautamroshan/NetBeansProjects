import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
public class TempRun extends Application{
    @Override
    public void start(Stage PrimaryStage){
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER_LEFT);
        Button OK = new Button("O");
        Button CANCEL = new Button("C");
        OKHandler h1 = new OKHandler();
        OK.setOnAction(h1);
        CHandler h2 = new CHandler();
        CANCEL.setOnAction(h2);
        pane.getChildren().addAll(OK,CANCEL);
        Scene scene = new Scene(pane);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("Demo");
        PrimaryStage.show();
        
    }
    public static void main(String[]args){
        Application.launch(args);
    }
}
class OKHandler implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        System.out.println("Ok button clicked");
    }
}
class CHandler implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        System.out.println("Cancel Button Clicked");
}
}