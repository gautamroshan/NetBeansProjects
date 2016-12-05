import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Example15_1 extends Application {
@Override
public void start(Stage PrimaryStage){
    HBox pane = new HBox(10);
    pane.setAlignment(Pos.CENTER);
    Button btOK = new Button("OK");
    Button btCancel = new Button("Cancel");
    OKHandlerClass handler1 = new OKHandlerClass();
    btOK.setOnAction(handler1);
    CancelHandlerClass handler2 = new CancelHandlerClass();
    btCancel.setOnAction(handler2);
    pane.getChildren().addAll(btOK, btCancel);
    
    Scene scene = new Scene(pane);
    PrimaryStage.setTitle("HandleEvent");
    PrimaryStage.setScene(scene);
    PrimaryStage.show();
}
public static void main(String[]args){
    Application.launch(args);
}
}
class OKHandlerClass implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        System.out.println("OK button clicked");
    }
}
class CancelHandlerClass implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        System.out.println("Cancel button clicked");
    }
}