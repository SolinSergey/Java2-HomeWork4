package com.homework.homework4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HomeWork4Controller {
    @FXML
    private TextArea mainTextArea;
    @FXML
    private TextField mainTextField;

    @FXML
    protected void textFieldEnterPressed(){
        onButtonClick();
    }
    @FXML
    protected void onButtonClick() {
        String s = mainTextField.getText();
        s = s.trim();
        if (!s.equals("")){
            mainTextArea.appendText(s+"\n");

        }
        mainTextField.setText("");
    }
}