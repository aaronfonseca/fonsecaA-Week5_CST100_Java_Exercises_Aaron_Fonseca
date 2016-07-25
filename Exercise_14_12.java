/** Program: Exercise 14.12
* File: Exercise_14_12.java
* Summary: (Display a bar chart)
* 
* (Display a bar chart) Write a program that uses a bar chart 
* to display the percentages of the overall percentage represented 
* by projects, quizzes, midterm exams, and the final exam, as 
* shown in Figure 14.46b. Suppose that projects take 20 percent 
* and are displayed in red, quizzes take 10 percent and are 
* displayed in blue, midterm exams take 30 percent and are 
* displayed in green, and the final exam takes 40 percent and 
* is displayed in orange. Use the Rectangle class to display 
* the bars. Interested readers may explore the JavaFX BarChart 
* class for further study.
*
* Author: Aaron Fonseca
* Date: July 22, 2016
**/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class Exercise_14_12 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		// Create a HBox 15 pixels space between child nodes
		HBox hBox = new HBox(15);
		hBox.setAlignment(Pos.BOTTOM_CENTER);

		String[] type = {"Project", "Quiz", "Midterm", "Final"};
		double[] percentage = {20, 10, 30, 40};

		double maxHeight = getMax(percentage);
		double height = 200; // Set height
		double width = 200; // Set Width

		// Create pane
		StackPane pane = new StackPane();
		pane.setPadding(new Insets(10, 10, 10, 10));

		// Create 4 rectangles
		Rectangle r1 = new Rectangle(0, 0, width, height * percentage[0] / maxHeight);
		r1.setFill(Color.RED);
		
		Rectangle r2 = new Rectangle(0, 0, width, height * percentage[1] / maxHeight);
		r2.setFill(Color.BLUE);
		
		Rectangle r3 = new Rectangle(0, 0, width, height * percentage[2] / maxHeight);
		r3.setFill(Color.GREEN);
		
		Rectangle r4 = new Rectangle(0, 0, width, height * percentage[3] / maxHeight);
		r4.setFill(Color.ORANGE);

		// Create 4 Text objects
		Text t1 = new Text(0, 0, type[0] + " -- " + percentage[0] + "%");
		Text t2 = new Text(0, 0, type[1] + " -- " + percentage[1] + "%");
		Text t3 = new Text(0, 0, type[2] + " -- " + percentage[2] + "%");
		Text t4 = new Text(0, 0, type[3] + " -- " + percentage[3] + "%");
		
		// Create hbox with 4 nodes with vbox in each node
		hBox.getChildren().addAll(getVBox(t1, r1), getVBox(t2, r2), 
			getVBox(t3, r3), getVBox(t4, r4));
		
		pane.getChildren().add(hBox);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_12"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public double getMax(double[] l) {
		double max = l[0];
		for (int i = 0; i < l.length; i++) {
			if (l[i] > max)
				max = l[i];
		}
		return max;
	}

	public VBox getVBox(Text t, Rectangle r) {
		VBox vBox = new VBox(5);
		vBox.setAlignment(Pos.BOTTOM_LEFT);
		vBox.getChildren().addAll(t, r);
		return vBox;
	}
}