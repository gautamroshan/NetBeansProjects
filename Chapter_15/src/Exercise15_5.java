import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise15_5 extends Application{
@Override
public void start(Stage PrimaryStage){
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    Button btOk = new Button("Ok");
    Button btNew = new Button("New");
    Button btSave = new Button("Save");
    Button btPrint = new Button("Print");
    hBox.getChildren().addAll(btOk, btNew, btSave, btPrint);
    btOk.setOnAction(e -> System.out.println("Process Ok"));
    btNew.setOnAction(e -> System.out.println("Process New"));
    btSave.setOnAction(e -> System.out.println("Process Save"));
    btPrint.setOnAction(e -> System.out.println("Process Print"));
    Scene scene = new Scene(hBox, 300, 50);
    PrimaryStage.setTitle("Demo");
    PrimaryStage.setScene(scene);
    PrimaryStage.show();
}
public static void main(String[]args){
    Application.launch(args);
}
}
