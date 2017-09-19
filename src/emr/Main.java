package emr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        fxml(stage);
        stage.show();
    }

    
    private void fxml(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/emr/v/EMR.fxml"));
            Scene scene = new Scene(root);
             scene.getStylesheets().add(getClass().getResource("/emr/v/EMR.css").toExternalForm());
            stage.setScene(scene);
            stage.setTitle("任氏诊所信息管理系统");
            stage.initStyle(StageStyle.TRANSPARENT);
            initController(stage,root);
            Application.setUserAgentStylesheet(STYLESHEET_MODENA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void initController(Stage stage,Parent root){
        
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
