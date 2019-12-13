import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
public class ButtonExample extends Application
{
   @Override
   public void start(Stage primaryStage) throws Exception 
   {
      primaryStage.setTitle("MyJavaFx");
      Label label = new Label("Not clicked.");
      Button button = new Button("Click!");
      button.setStyle("-fx-background-color:#ff0000;");
      button.setOnAction(value->{ label.setText("Checkout"); });
      HBox hbox = new HBox(button, label);
      Scene scene = new Scene(hbox, 200, 100);
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String [] args)
   {
      Application.launch(args);
   }
}