package model;
//GENERIC JAVAFX IMPORTS (not necessarily used)
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.stage.Stage;

// Running this class would show you an empty GUI framework
// >that feeling when this is still not resizable T_T
// there are two 'Main' classes, should we merge them?

public class mainClass extends Application {
	
	private Stage primaryStage;
	private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("WAVAdraw!"); // WAVAdraw! is the EOL for my garbage naming sense, hopefully someone in our group is good at marketing! LOL
		initRootLayout();
		showStage();
	}
	
	public void initRootLayout() {
        try {
            // FXMLLoader works similar to Scanner and is used to obtain .fxml files from SceneBuilder
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(mainClass.class.getResource("/view/root.fxml"));
            rootLayout = (BorderPane) loader.load();

            // GUIs in JavaFX have two elements, the Stage and the Root
            // It can be simplified by saying a ROOT carries the BorderPane and other 'static' elements like MenuBar
            // (The latter is not used here)
            // The BorderPane (as implied by the name) carries close, minimize and window expand buttons
            // The STAGE contains the GUI elements themselves
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void showStage() {
        try {
            // Load STAGE
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(mainClass.class.getResource("/view/scene.fxml"));
            AnchorPane showStage = (AnchorPane) loader.load();

            // Setting the STAGE on the center of the ROOT
            
            rootLayout.setCenter(showStage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args); // JAVAFX GUI launch method
	}
}
