/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guijava1;

/**
 *
 * @author USER
 */import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class FormEvent extends Application {
@Override
public void start(Stage stage) {
//creating label nama
Text text1 = new Text("Nama");

//creating label telepon
Text text2 = new Text("Telepon");

//creating label telepon
Text text3 = new Text("Alamat");

//Creating Text Filed for nama
TextField textField1 = new TextField();

//Creating Text Filed for telepon
TextField textField2 = new TextField();

//Creating Text Filed for alamat
TextArea textArea3 = new TextArea();

//Creating Buttons
Button button1 = new Button("Submit");
Button button2 = new Button("Clear");
//Creating a Grid Pane
GridPane gridPane = new GridPane();
//Setting size for the pane
gridPane.setMinSize(400, 200);
//Setting the padding
gridPane.setPadding(new Insets(10, 10, 10, 10));
//Setting the vertical and horizontal gaps between the columns
gridPane.setVgap(5);
//Setting the Grid alignment
gridPane.setAlignment(Pos.CENTER);
//Arranging all the nodes in the grid
gridPane.add(text1, 0, 0);
gridPane.add(textField1, 1, 0);
gridPane.add(text2, 0, 1);
gridPane.add(textField2, 1, 1);
gridPane.add(text3, 0, 2);
gridPane.add(textArea3, 1, 2);
gridPane.add(button1, 0, 2);
gridPane.add(button2, 1, 2);
//Creating a scene object
Scene scene = new Scene(gridPane);
//Setting title to the Stage
stage.setTitle("Form Event");
//Adding scene to the stage
stage.setScene(scene);
//Displaying the contents of the stage
stage.show();
}
public static void main(String args[]){
launch(args);
}
}

