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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FootballController  implements Initializable {

	 @FXML
	    private Button btnStart;
	
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
				
		}
		public void Pele(ActionEvent e) throws IOException{
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	alert.setHeaderText(null);
    	alert.setContentText("Michael Jeffrey Jordan bivši je američki NBA košarkaš, koji se uglavnom smatra najboljim košarkašem svih vremena. Trenutno je vlasnik Charlotte Hornetsa. U NBA ligi proveo je 15 sezona s 30,12 poena po utakmici u regularnoj sezoni (najviše u NBA). Osvojio je šest NBA titula sa Chicago Bullsima, deset puta bio najbolji strijelac i pet puta najkorisniji igrač lige. Devet puta izabran je u prvu odbrambenu petorku, a tri puta bio je najbolji po broju ukradenih lopti.");
    	alert.showAndWait();
		}
		
		public void Messi(ActionEvent e){
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Lionel Andrés Messi argentinski je nogometaš koji trenutno igra za  Barcelonu i Argentinsku nogometnu reprezentaciju. Mesi je jedan od najtrofejnijih i najbolje plaćenih igrača današnjice. Iako je veći uspijeh sa seniorskom reprezentacijom Argentine izostao, sa Barsom je osvojio sve što se moglo osvojiti.");
	   	alert.show();
			}
		
		public void Ronaldo(ActionEvent e){
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Cristiano Ronaldo, portugalski nogometaš, Član je torinskog Juventusa.Reprezentativac je i kapetan Portugala te peterostruki dobitnik Zlatne lopte i FIFA-ine nagrade za nogometaša godine za 2008., 2013., 2014., 2016. i 2017. godinu. Četiri puta je osvajao nagradu za najboljeg strijelca godine - Zlatnu kopačku. Osvajao je titule sa svim ekipama u kojima je igrao a većina stručnjaka kaže da ako osvoji Ligu prvaka i sa Juventusom da će to dodatno zacementirati njegov status nogometnog GOAT-a.).");
	    	alert.show();
			}
	
		public void Start(ActionEvent e) throws IOException
		 {
		 	btnStart.getScene().getWindow().hide();  
		 	Stage start = new Stage();
		 	Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
		 	Scene startScene = new Scene(root);
		 	start.setScene(startScene);
		 	start.show();
		 	start.setResizable(false);
		 	
		 	
		 }

}
