/** Program: Exercise 14.17
* File: Exercise_14_17.java
* Summary: (Game: hangman)
* 
* Write a program that displays a drawing for the popular hangman game, as shown in Figure 14.48a.
*
* Author: Aaron Fonseca
* Date: July 22, 2016
**/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.scene.layout.Pane;

	public class Exercise_14_17 extends Application {
		
		@Override // Override the start method in the Application class
		public void start(Stage primaryStage) {
			
			// Create a pane
			Pane pane = new Pane();
			
			double x1 = 60.0;
			double y1 = 290.0;
			
			// Create an arc and set its properties
			Arc arc = new Arc(x1, y1, 50, 15, 0, 180);
			arc.setFill(Color.WHITE);
			arc.setStroke(Color.BLACK);
			
			// Lines for the parts of the body
			Line post = new Line(x1, 15, x1, y1-15 );
			Line postTop = new Line(x1, 15, 180, 15 );
			Line rope = new Line(180, 15, 180, 50 );
			Line body = new Line(180, 95, 180, 195 );
			Line rightArm = new Line(180, 95, 140, 140 );
			Line leftArm = new Line(180, 95, 220, 140 );
			Line rightLeg = new Line(180, 195, 140, 240 );
			Line leftLeg = new Line(180, 195, 220, 240 );
			
			// The head
			Circle circle = new Circle();
			circle.setCenterX(180);
			circle.setCenterY(65);
			circle.setRadius(30);
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.BLACK);
			
			// Add multiple nodes to pane
			pane.getChildren().addAll(arc, post, postTop, rope, circle, body, rightArm, leftArm, rightLeg, leftLeg); 
			
			// Create the base using an arc
			Scene scene = new Scene(pane, 300, 300);
			primaryStage.setTitle("Exercise_14_17"); // Set the stage title
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
		}
	}
	