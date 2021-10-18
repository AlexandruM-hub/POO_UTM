package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Creating a GridPane container
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
//Defining the Name text field
        TextField firstNumber = new TextField();
        firstNumber.setPromptText("Enter first number.");
        firstNumber.setPrefColumnCount(10);
        firstNumber.getText();
        GridPane.setConstraints(firstNumber, 0, 0);
        grid.getChildren().add(firstNumber);
//Defining the Last Name text field
        TextField secondNumber = new TextField();
        secondNumber.setPromptText("Enter second number.");
        GridPane.setConstraints(secondNumber, 0, 1);
        grid.getChildren().add(secondNumber);
//Defining the calculate button
        Button calculate = new Button("Calculate");
        GridPane.setConstraints(calculate, 1, 0);
        grid.getChildren().add(calculate);
//Defining the Clear button
        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 1, 1);
        grid.getChildren().add(clear);
        // Result label
        final Label result = new Label();
        result.setText("Rezultat:");
        GridPane.setConstraints(result,0,3);
        GridPane.setColumnSpan(result, 2);
        grid.getChildren().add(result);

        calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                result.setText("Rezultat:");
                if((firstNumber.getText() != null && !firstNumber.getText().isEmpty() && secondNumber.getText() != null && !secondNumber.getText().isEmpty())){
                    if(secondNumber.getText().equals("0")){
                        secondNumber.clear();
                        secondNumber.setPromptText("Numar introdus gresit!");
                    }
                    else {
                        try{
                            Double.parseDouble(firstNumber.getText());
                            try{
                                Double.parseDouble(secondNumber.getText());
                                try{
                                    if(secondNumber.getText().equals("13")){
                                        throw new my_exception();
                                    }
                                    else{
                                        result.setText((result.getText() + " " + Double.parseDouble(firstNumber.getText())/Double.parseDouble(secondNumber.getText())));
                                    }
                                }
                                catch (my_exception a){
                                    secondNumber.clear();
                                    secondNumber.setPromptText("Unlucky!!!");
                                }
                            }
                            catch (NumberFormatException ex){
                                secondNumber.clear();
                                secondNumber.setPromptText("Numar introdus gresit!");
                            }
                        }
                        catch (NumberFormatException ex ){
                            firstNumber.clear();
                            firstNumber.setPromptText("Numar introdus gresit!");
                        }
                    }
                }
                else{
                    result.setText("Nu ati introdus numerele");
                }
            }
        });

        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                firstNumber.clear();
                secondNumber.clear();
                result.setText(null);
            }
        });

        primaryStage.setTitle("Division Calculator");
        primaryStage.setScene(new Scene(grid, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
