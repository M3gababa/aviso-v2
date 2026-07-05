package com.aviso;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;
import java.net.URL;

/**
 * Main JavaFX Application class.
 *
 * <p>This is the JavaFX lifecycle entry point. It loads the main FXML view,
 * applies the global stylesheet, sets the window icon, and displays the
 * primary stage.</p>
 *
 * <p><b>Note:</b> This class should NOT be used as the jar's main class.
 * Use {@link MainLauncher} instead to avoid classloading issues when
 * JavaFX is not on the module path (common in fat-jar / Launch4j setups).</p>
 */
public class App extends Application {

    private static final String MAIN_VIEW      = "views/main.fxml";
    private static final String STYLESHEET     = "css/application.css";
    private static final String WINDOW_ICON    = "images/app-icon.png";
    private static final String APP_TITLE      = "Aviso V2";
    private static final double WINDOW_WIDTH   = 900;
    private static final double WINDOW_HEIGHT  = 600;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(MAIN_VIEW));

        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

        // Load the global stylesheet (if present)
        URL css = getClass().getResource(STYLESHEET);
        if (css != null) {
            scene.getStylesheets().add(css.toExternalForm());
        }

        // Set the window icon (if present)
        InputStream iconStream = getClass().getResourceAsStream(WINDOW_ICON);
        if (iconStream != null) {
            primaryStage.getIcons().add(new Image(iconStream));
        }

        primaryStage.setTitle(APP_TITLE);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(640);
        primaryStage.setMinHeight(480);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        // Clean-up logic (close DB connections, save state, etc.) goes here.
        super.stop();
    }
}
