/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eindescapecode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author Teun
 */
public class EindEscapeCode extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane root = new GridPane();
        new GUI(root);
        Scene scene = new Scene(root, 385, 250);

        primaryStage.setTitle("Sudoku");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
