package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Controller {
    // inisialisasi komponen dalam layout
    @FXML
    private BorderPane mainPane;
    @FXML
    private Button btn_menu_1;
    @FXML
    private Button btn_menu_2;
    @FXML
    private Button btn_menu_3;
    @FXML
    private Button btn_menu_4;
    @FXML
    private Button btn_menu_5;

    // method untuk masing-masing button
    public void tekanBtnMenu1(ActionEvent event) {
        System.out.println("Membuka Menu 1");
        FxmlLoader loader1 = new FxmlLoader();
        Pane viewPane = loader1.getPane("menu_1");
        mainPane.setCenter(viewPane);
    }

    public void tekanBtnMenu2(ActionEvent event) {
        System.out.println("Membuka Menu 2");
        FxmlLoader loader1 = new FxmlLoader();
        Pane viewPane = loader1.getPane("menu_2");
        mainPane.setCenter(viewPane);
    }

    public void tekanBtnMenu3(ActionEvent event) {
        System.out.println("Membuka Menu 3");
        FxmlLoader loader1 = new FxmlLoader();
        Pane viewPane = loader1.getPane("menu_3");
        mainPane.setCenter(viewPane);
    }

    public void tekanBtnMenu4(ActionEvent event) {
        System.out.println("Membuka Menu 4");
        FxmlLoader loader1 = new FxmlLoader();
        Pane viewPane = loader1.getPane("menu_4");
        mainPane.setCenter(viewPane);
    }

    public void tekanBtnMenu5(ActionEvent event) {
        System.out.println("Membuka Menu 5");
        FxmlLoader loader1 = new FxmlLoader();
        Pane viewPane = loader1.getPane("menu_5");
        mainPane.setCenter(viewPane);
    }

}
