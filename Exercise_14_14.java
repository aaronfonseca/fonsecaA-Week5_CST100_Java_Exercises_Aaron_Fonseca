/** Program: Exercise 14.14
* File: Exercise_14_14.java
* Summary: (Display a bar chart)
* 
* (Display a rectanguloid) Write a program that displays a rectanguloid, 
* as shown in Figure 14.47a. The cube should grow and shrink as the window grows or shrinks.
*
* Author: Aaron Fonseca
* Date: July 22, 2016
**/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_14_14 extends Application {
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
	Pane pane = new Pane();

	// Create Rectangle
	Rectangle rec1 = new Rectangle(0,0, Color.TRANSPARENT);
	rec1.setStroke(Color.BLACK);
	rec1.xProperty().bind(pane.widthProperty().divide(4).subtract(50)); // starting x width/4+50
	rec1.yProperty().bind(pane.heightProperty().divide(4).add(25)); // starting y height/4+25
	rec1.widthProperty().bind(pane.widthProperty().divide(2).add(25)); // starting width = width/2+25
	rec1.heightProperty().bind(pane.widthProperty().divide(2)); // starting height = height/2
	
	Rectangle rec2 = new Rectangle(0,0, Color.TRANSPARENT);
    rec2.setStroke(Color.BLACK);
    rec2.xProperty().bind(pane.widthProperty().divide(4).add(50)); // starting x width/4+50
    rec2.yProperty().bind(pane.heightProperty().divide(4).subtract(50)); // starting y height/4+25
    rec2.widthProperty().bind(pane.widthProperty().divide(2).add(25)); // starting width = width/2+25
    rec2.heightProperty().bind(pane.widthProperty().divide(2)); // starting height = height/2

    Line line1 = new Line();
    line1.startXProperty().bind(rec1.xProperty()); // Set Starting X
    line1.startYProperty().bind(rec1.yProperty()); // Set Starting Y
    line1.endXProperty().bind(rec2.xProperty()); // Set Ending X
    line1.endYProperty().bind(rec2.yProperty()); // Set Ending Y

    Line line2 = new Line();
    line2.startXProperty().bind(rec1.xProperty()); // Set Starting X
    line2.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty())); // Set Starting Y
    line2.endXProperty().bind(rec2.xProperty()); // Set Ending X
    line2.endYProperty().bind(rec2.yProperty().add(rec1.heightProperty())); // Set Ending Y

    Line line3 = new Line();
    line3.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty())); // Set Starting X
    line3.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty())); // Set Starting Y
    line3.endXProperty().bind(rec2.xProperty().add(rec1.widthProperty())); // Set Ending X
    line3.endYProperty().bind(rec2.yProperty().add(rec1.heightProperty())); // Set Ending Y

    Line line4 = new Line();
    line4.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty())); // Set Starting X
    line4.startYProperty().bind(rec1.yProperty()); // Set Starting Y
    line4.endXProperty().bind(rec2.xProperty().add(rec1.widthProperty())); // Set Ending X
    line4.endYProperty().bind(rec2.yProperty()); // Set Ending Y
    
    // Add multiple nodes to pane
	pane.getChildren().addAll(rec1, rec2, line1, line2, line3, line4); 

	// Create a scene and place it in the stage
    Scene scene = new Scene(pane, 400, 400);
    primaryStage.setTitle("Exercise_14_14"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
        Application.launch(args);

    }
	
}
