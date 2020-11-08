package application;

import java.io.IOException;
import java.net.URL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController  implements Initializable {
	@FXML
    private TextField txtUsername;

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;
		
	
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
				
		}
public void Save(ActionEvent e) throws Exception {
			
	try {
		Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306/"
					+ "sport?autoReconnect=true&useSSL=false" 
					,"root","");
			String sql  = "SELECT * from sportopedia where username=? and password=?";
			PreparedStatement statement = conn.prepareStatement(sql);
			
			
		statement.setString(1, txtUsername.getText());
		statement.setString(2, txtPassword.getText());
		ResultSet rs = statement.executeQuery();
		int count=0;
	     
	    while(rs.next())
	    {
	    	count=count+1;
	    }
	    
	    if(count==1)
	    {
	    	Stage home = new Stage();
	    	try {
	    		btnLogin.getScene().getWindow().hide();
				Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
				
			    Scene scene = new Scene(root);
			    home.setScene(scene);
			    home.show();
	    	
	    	} catch (IOException e1) {
			
				e1.printStackTrace();
			}
	    	
	
	    }
	    else
	    {
	    	Alert alert = new Alert(Alert.AlertType.ERROR);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Username and Password Is Not Correct");
	    	alert.show();
	    	
	    }
	    

	} catch (SQLException e1) {
		
		e1.printStackTrace();
	}
	
	
		
	
	
}
   public void SignUp(ActionEvent e) throws IOException
{
	   
	btnLogin.getScene().getWindow().hide();
	Stage signUp = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
	Scene signUpScene = new Scene(root);
	signUp.setScene(signUpScene);
	signUp.show();
	signUp.setResizable(false);
	
	
}

}
