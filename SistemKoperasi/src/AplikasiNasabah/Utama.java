package AplikasiNasabah;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Utama extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("NasabahForm.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Sistem Koperasi");
        stage.setScene(scene);
        stage.show();}

    public static void main(String[] args) {
        launch(args);
        
    } 
}