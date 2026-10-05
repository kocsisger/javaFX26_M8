package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.model.Model;

public class FXMLStudentsSceneController {

    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    @FXML
    private Label seasonsLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void handleLoadButtonPressed() {
        refreshName();
        creditsLabel.setText("" + model.getStudent().getCredits());
        dateOfBirthLabel.setText(model.getStudent().getDateOfBirth().toString());
        System.out.println("F I R E W O R K ! ! ! ");
    }

    @FXML
    void handleChangeButtonPressed(ActionEvent event) {
        model.getStudent().setName("John Smith");
        refreshName();
    }

    private void refreshName() {
        nameLabel.setText(model.getStudent().getName());
    }

    @FXML
    void handleButtonClick(ActionEvent event) {
        if (seasonsLabel.getText().equals("Winter"))
            seasonsLabel.setText("Summer");
        else
            seasonsLabel.setText("Winter");
    }
}
