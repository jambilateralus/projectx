package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class Controller {

    public TextField usernameText;
    public PasswordField passwordText;


    public void doLogin(ActionEvent actionEvent) {
        String userName = usernameText.getText();
        String password = passwordText.getText();
        System.out.println("Username: "+userName+"\n"+"Password: "+password);
    }
}
