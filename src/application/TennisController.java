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

public class TennisController  implements Initializable {
	  @FXML
	    private Button btnStart;

		
	
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
				
		}
		public void Nadal(ActionEvent e) throws IOException{
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	alert.setHeaderText(null);
    	alert.setContentText("Rafael Nadal Parera profesionalni je španski teniser i trenutni broj 2 na ATP-listi. Od aprila 2005. do maja 2007. napravio je rekord od 81 uzastopnog dobijenog meča na zemlji prije nego što ga je Roger Federer pobijedio u finalu Mastersa u Hamburgu. Nadal je gotovo nepobjediv na Roland Garrosu, osvojivši svaki na kojem se takmičio (2005–2008, 2010–2014, 2017–2019) osim 2009, kad ga je u četvrtfinalu porazio Šveđanin Robin Söderling (1:3) (revanširao mu se u finalu 2010, osvojivši peti Roland Garros), i 2015, kad ga je, također u četvrtfinalu, savladao Novak Đoković. Zbog tih dostignuća Nadal se smatra najboljim teniserom na zemljanoj podlozi u historiji. Peterostruki je osvajač Davis Cupa i dvostruki osvajač Laver Cupa (2017, 2019) kao član tima Evrope.");
    	alert.showAndWait();
		}
		
		public void Federer(ActionEvent e){
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Roger Federer profesionalni je teniser iz Švicarske. Od 2. februara 2004. do 17. augusta 2008. bio je prvi reket svijeta – rekordnih 237 uzastopnih sedmica, a 16. jula 2012. postao je teniser s najviše sedmica ukupno na broju 1. Ukupno je proveo 310 sedmica na prvom mjestu ATP liste. Osim toga, 19. februara 2018, nakon što je osvojio turnir u Rotterdamu, u dobi od 36 godina i 195 dana, postao je najstariji broj 1 otkad se vodi ATP-lista, vrativši se na njen vrh nakon pet i po godina i popravivši rekord koji je dotad držao Andre Agassi. Taj je rekord popravio 24. juna iste godine na 36 godina i 320 dana.\r\n" + 
	    			"Osvojio je rekordnih 20 Grand Slam turnira: osam Wimbledona, šest Australian Opena, pet US Opena i jedan Roland Garros. Pobjedom na Wimbledonu 2009. oborio je Samprasov rekord od 14 Grand Slam titula. Osvojio je i olimpijsko zlato u Pekingu 2008 (u paru sa zemljakom Stanislasom Wawrinkom), pojedinačno srebro na OI 2012. u Londonu, 28 titula na turnirima iz serije ATP Masters 1000 i šest Masters Cupova. Krajem 2014. s reprezentacijom Švicarske osvojio je Davis Cup, jedini trofej koji mu je nedostajao u bogatoj karijeri. Također je trostruki uzastopni osvajač Laver Cupa (2017–2019) kao član tima Evrope.");
	   	alert.show();
			}
		
		public void Novak(ActionEvent e){
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Novak Đoković profesionalni je srbijanski teniser i po ostvarenim rezultatima najbolji teniser svih vremena iz te zemlje, ali i s područja bivše Jugoslavije. Profesionalno igra od 2003. Osvojio je 16 titula na Grand slam turnirima. Pobjedom na Roland Garrosu 2016. postao je osmi teniser u historiji koji je u karijeri osvojio sva četiri Grand Slam turnira, treći koji je bio vlasnik sve četiri titule u isto vrijeme i prvi koji je to uspio na tri podloge (tvrdoj, zemlji i travi). Također je stigao do finala na 50 turnira Masters serije, od kojih je 34 osvojio (od toga šest u 2015. godini, što je rekord za jednu sezonu). Pobjedom na Cincinnati Mastersu 2018. postao je prvi igrač u historiji koji je uspio osvojiti svih devet Mastersa. Ima i pet titula na Masters Cupu (od čega četiri uzastopno, po čemu je jedini u historiji). Također ima najveću zaradu od turnira u historiji. Trenutno je drugi na ATP-listi.\r\n" + 
	    			"Osim toga, osvojio je bronzanu medalju na OI 2008. u Pekingu.");
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