package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WelcomeController  implements Initializable {

	    @FXML
	    private Button btnFudbal;

	    @FXML
	    private Button btnGolf;

	    @FXML
	    private Button btnTenis;

	    @FXML
	    private Button btnKosarka;
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
				
		}
		
		
   public void Football(ActionEvent e) throws IOException
{
	btnFudbal.getScene().getWindow().hide();
	Stage football = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("Football.fxml"));
	Scene footballScene = new Scene(root);
	football.setScene(footballScene);
	football.show();
	football.setResizable(false);
	
}	
   public void Basketball(ActionEvent e) throws IOException
   {
	btnKosarka.getScene().getWindow().hide();
   	Stage football = new Stage();
   	Parent root = FXMLLoader.load(getClass().getResource("Basketball.fxml"));
   	Scene footballScene = new Scene(root);
   	football.setScene(footballScene);
   	football.show();
   	football.setResizable(false);
   	
   }	
   public void Golf(ActionEvent e) throws IOException
{
	btnGolf.getScene().getWindow().hide();
	Stage golf = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("Golf.fxml"));
	Scene golfScene = new Scene(root);
	golf.setScene(golfScene);
	golf.show();
	golf.setResizable(false);
	
}
   public void Tennis(ActionEvent e) throws IOException
   {
   	btnTenis.getScene().getWindow().hide();
   	Stage tenis = new Stage();
   	Parent root = FXMLLoader.load(getClass().getResource("Golf.fxml"));
   	Scene tenisScene = new Scene(root);
   	tenis.setScene(tenisScene);
   	tenis.show();
   	tenis.setResizable(false);
   	
   }
   
}
