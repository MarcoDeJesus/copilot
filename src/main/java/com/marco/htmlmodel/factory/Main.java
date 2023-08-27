package com.marco.htmlmodel.factory;

public class Main {

    public static void main(String[] args) {
        ElementFactory<Label> labelElementFactory = new LabelElementFactory();
        Element<Label> usernameLabel = new Element<Label>(labelElementFactory.createElement("//id['username']"));
        Element<Label> passwordLabel = new Element<Label>(labelElementFactory.createElement("//id['password']"));

        ElementFactory<TextField> textFieldElementFactory = new TextFieldElementFactory();
        Element<TextField> usernameTextField = new Element<TextField>(textFieldElementFactory.createElement("//id['usernameTxt']"));
        Element<TextField> passwordTextField = new Element<TextField>(textFieldElementFactory.createElement("//id['passwordTxt']"));

        ElementFactory<Button> buttonElementFactory = new ButtonElementFactory();
        Element<Button> loginButton = new Element<>(buttonElementFactory.createElement("//input['loginButton']"));

        usernameTextField.enterText("mdejesus");
        passwordTextField.enterText("12345");

        System.out.println("Username: " + (ITextField)usernameTextField.getText());
        System.out.println("Password: " + passwordTextField.getText());
        
    }

}
