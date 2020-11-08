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

public class BasketballController  implements Initializable {
	  @FXML
	    private Button btnStart;

		
	
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
				
		}
		public void Jordan(ActionEvent e) throws IOException{
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	alert.setHeaderText(null);
    	alert.setContentText("Michael Jeffrey Jordan bivši je američki NBA košarkaš, koji se uglavnom smatra najboljim košarkašem svih vremena. Trenutno je vlasnik Charlotte Hornetsa. U NBA ligi proveo je 15 sezona s 30,12 poena po utakmici u regularnoj sezoni (najviše u NBA). Osvojio je šest NBA titula sa Chicago Bullsima, deset puta bio najbolji strijelac i pet puta najkorisniji igrač lige. Devet puta izabran je u prvu odbrambenu petorku, a tri puta bio je najbolji po broju ukradenih lopti.");
    	alert.showAndWait();
		}
		
		public void James(ActionEvent e){
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Lebron James je osvojio tri NBA prstena, četri puta je proglašen najkorisnijim igračem NBA lige, dva puta najkorisnijim igračem NBA All-Star utakmice te je odnio i nagradu za novaka godine. James je jedanaesterostruki NBA All-Star te je osam puta izabran u All-NBA momčad i pet puta u All-Defensive momčad.");
	   	alert.show();
			}
		
		public void Kobe(ActionEvent e){
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Kobe Bryant je u sezoni 2007./08. proglašen  najkorisnijim igračem regularnog dijela sezone, a u doigravanju je Lakerse odveo do NBA finala, gdje su poraženi od Boston Celticsa. Sljedeće sezone ponovo je odveo Lakerse do finala protiv Orlando Magica i osvojio svoj četvrti NBA naslov. To je njegov prvi NBA naslov bez Shaquillea O'Neala. S američkom reprezentacijom osvojio je zlatnu medalju na Olimpijskim igrama u Pekingu 2008. godine. Od svoje druge NBA sezone, Bryant je redoviti član NBA All-Star utakmice, a u četiri navrata osvojio je nagradu za najkorisnijeg igrača All-Star utakmice (2002., 2007., 2009. i 2011.). Kroz svoju NBA karijeru dobio je nekoliko nadimaka, a današnji nadimak mu je Crna Mamba");
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
