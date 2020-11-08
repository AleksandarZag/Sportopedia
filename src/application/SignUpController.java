package application;

import java.io.IOException;
import java.net.URL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController  implements Initializable {
	   @FXML
	    private PasswordField txtPassword;

	    @FXML
	    private RadioButton rbnMale;

	    @FXML
	    private RadioButton rbnFemale;

	    @FXML
	    private TextField txtLocation;

	    @FXML
	    private TextField txtUsername;

	    @FXML
	    private Button btnSpremi;
	    @FXML
	    private Button btnlogin;
		
	
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
				
		}
public void SaveAction(ActionEvent e) throws Exception {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");

					Connection conn = DriverManager.getConnection("jdbc:mysql:"
							+ "//localhost:3306/"
							+ "sport?autoReconnect=true&useSSL=false" 
							,"root","");
					String sql  = "INSERT INTO sportopedia "
							+ "(username,password,gender,location) "
							+ "VALUES (?,?,?,?)";
					PreparedStatement statement = conn.prepareStatement(sql);
					
					
				statement.setString(1, txtUsername.getText());
				statement.setString(2, txtPassword.getText());
				statement.setString(3, getGender());
				statement.setString(4, txtLocation.getText());				
				int rows = statement.executeUpdate();
				if(rows > 0 ) {
					System.out.println("A row has been inserted");
				}
               statement.close();
               conn.close();
	          
	          } catch(SQLException e1) {
	        	  System.out.println("Oops");
	          }
}
	        	  
		public  String getGender() {
		    
			String Spol ="";
			
			if(rbnMale.isSelected())
			{
				Spol = "Musko";
			} else if (rbnFemale.isSelected())
			{
				Spol = "Zensko";
			}
			
			 return Spol;
		 }
		public void Login(ActionEvent e1) throws IOException
		{
			
			btnlogin.getScene().getWindow().hide();
			Stage login = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene loginScene = new Scene(root);
			login.setScene(loginScene);
			login.show();
			login.setResizable(false);
			
			
		}
}
