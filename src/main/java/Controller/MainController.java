package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class MainController {
    @FXML
    private StackPane mainPane;

    private void setMainPane(String fxml){
        try {
            Node node = FXMLLoader.load(getClass().getResource(fxml));
            AnchorPane.setTopAnchor(node, 0.0);
            AnchorPane.setBottomAnchor(node, 0.0);
            AnchorPane.setLeftAnchor(node, 0.0);
            AnchorPane.setRightAnchor(node, 0.0);
            mainPane.getChildren().setAll(node);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void memberAct(ActionEvent actionEvent) {
        setMainPane("/fxml/Membership.fxml");
    }

    public void aboutAct(ActionEvent actionEvent) {
        setMainPane("/fxml/About.fxml");
    }

    public void priceAct(ActionEvent actionEvent) {
        setMainPane("/fxml/Price.fxml");
    }

    public void contactAct(ActionEvent actionEvent) {
    }

    public void mainAct(ActionEvent actionEvent) {
        setMainPane("/fxml/Main.fxml");
    }
}
