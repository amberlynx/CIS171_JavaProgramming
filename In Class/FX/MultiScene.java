import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
public class MultiScene extends Application
{
   Scene scene1, scene2;
   @Override
   public void start(Stage primaryStage) throws Exception 
   {
      primaryStage.setTitle("MyJavaFx");
      // Scene 1
      Label label1 = new Label("First Scene");
      Button button1 = new Button("Go To Scene 2");
      button1.setStyle("-fx-background-color:#ff0000;");
      button1.setOnAction(value->{ primaryStage.setScene(scene2); });
      VBox vbox1 = new VBox(20);
      vbox1.getChildren().addAll(label1, button1);
      scene1 = new Scene(vbox1, 300, 200);
      // Scene 2
      Label label2 = new Label("Second Scene");
      Button button2 = new Button("Go To Scene 1");
      button2.setOnAction(value->{ primaryStage.setScene(scene1); });
      VBox vbox2 = new VBox(20);
      vbox2.getChildren().addAll(label2, button2);
      scene2 = new Scene(vbox2, 300, 200);
      // Show window - always at the end
      primaryStage.setScene(scene1);
      primaryStage.show();
   }

   public static void main(String [] args)
   {
      Application.launch(args);
   }
}