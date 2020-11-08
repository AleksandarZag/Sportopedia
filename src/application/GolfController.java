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

public class GolfController  implements Initializable {

	@FXML
    private Button btnStart;
	
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
				
		}
		public void Jack(ActionEvent e) throws IOException{
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	alert.setHeaderText(null);
    	alert.setContentText("Džek Vilijam Niklauss (rođen 21. januara 1940), nadimak Zlatni medved, američki je penzionisani profesionalni golfer. Mnogi ga smatraju najboljim golferom svih vremena. \r\n" + 
    			"Tokom četvrt vijeka, osvojio je rekordnih 18 velikih prvenstava, tri više od Tajger Vudsa. Niklaus se fokusirao na glavna prvenstva - Masters turnir, US Open, Otvoreno prvenstvo i PGA prvenstvo - \r\n" + 
    			"i igrao je po selektivnom rasporedu na redovnim PGA turnejama. Takmičio se na 164 glavna turnira, \r\n" + 
    			"više od bilo kog drugog igrača, a završio je sa 73 pobede na PGA turnejama, više od bilo koga osim Sema Snida (82) i Vudsa (81).\r\n" + 
    			"Danas Niklaus vodi jednu od najvećih svetskih kompanija za dizajn golf terena. Među njegovim terenima je i Harbor taun golf links.\r\n" + 
    			"On je član Američkog društva arhitekata golf terena. Niklaus vodi jednu od aktivnosti na PGA turniru, Memorijalni turnir.");
    	alert.showAndWait();
		}
		
		public void Tiger(ActionEvent e){
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Tiger Woods rođen kao Eldrick Tont Woods (Cypress, Kalifornija, 30. decembru 1975.) - američki igrač golfa. Smatra se jednim od najboljih igrača golfa svih vremena.\r\n" + 
	    			"Tiger Woods je osvojio najviše PGA turnira od bilo kojeg aktivnog igrača golfa. Osvojio je jako velik broj različitih golf turnira, priznanja i nagrada.\r\n" + 
	    			"U aprilu 2010., časopis Forbes objavio je, da je Tiger Woods najbogatiji športaš svijeta sa zaradom od preko 100 milijuna dolara. Mnogo zarađuje od reklama i sponzorskih ugovora.\r\n" + 
	    			"Svojim uspjesima učinio je mnogo za popularizaciju golfa pogotovo među pripadnicima etničkih manjina i mladih ljudi u SAD-u.");
	   	alert.show();
			}
		
		public void Phil(ActionEvent e){
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Philip Alfred Mickelson (rođen 16. juna 1970.), pod nadimkom Lefty, američki je profesionalni golfer. \r\n" + 
	    			"Osvojio je 44 događaja na PGA turneji, uključujući pet glavnih prvenstava: tri Masters naslova (2004., 2006., 2010.), PGA prvenstvo (2005.) i Otvoreno prvenstvo (2013.).\r\n" + 
	    			"Mickelson je jedan od 12 igrača u istoriji. golfa osvojiti tri od četiri glavne igre. \r\n" + 
	    			"Mickelson je proveo više od 25 uzastopnih godina na prvih 50 zvaničnih Svjetskih golf bodova. \r\n" + 
	    			"Proveo je više od 700 sedmica u prvih 10, nekoliko puta stigao do svjetskog ranga broj 2 i životno je član PGA turneje. \r\n" + 
	    			"Poznat po lijevoj zamahu, iako je inače desnom rukom, učio je zrcalom zamaha desne ruke. Uvedena je u Svetsku salu slavnih golf 2012. godine.");
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
