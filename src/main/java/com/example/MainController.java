package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField surfaceAreaField;

    @FXML
    void onClickAboutButton(ActionEvent event) {
        startAbout();
    }

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    @FXML
    void onClilckExitButton(ActionEvent event) {

    }

    private void startAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);

        alert.setTitle("Névjegy");
        alert.setHeaderText("Az hengfel névjegye");
        alert.setContentText("Hengfel\n" + "Készítő: Bartha Levente\n" + "Verzió:1.0\n"
                + "Csoport: Szoft I-N\n"
                + "2025-05-24\n");

        alert.initOwner(App._stage);
        alert.show();
    }

    private void startCalc() {
        if (!inputOk()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Hiba!");
            alert.setContentText("A bevitel nem meglelő!");
            alert.setHeaderText("Beviteli hiba!");
            alert.initOwner(App._stage);
            alert.show();
            return;
        }
        Double height = Double.parseDouble(heightField.getText());
        Double radius = Double.parseDouble(radiusField.getText());

        Double surfaceArea = 2 * Math.PI * radius * (radius + height);
        surfaceAreaField.setText(surfaceArea.toString());

        // String line = height.toString() + ":" + radius1.toString() + ":" + radius2.toString() + ":"
        //         + volume.toString();
        // Storage.writeFile(line);
        // clearFields();

    }

    private boolean inputOk() {
        boolean ok = false;
        if (heightField.getText().matches("[0-9]+") && radiusField.getText().matches("[0-9]+")) {
            ok = true;
        }

        return ok;
    }

    private void clearFields() {
        heightField.setText("");
        radiusField.setText("");
        surfaceAreaField.setText("");

    }

}
