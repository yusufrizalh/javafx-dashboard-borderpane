package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class FxmlLoader {
    private Pane viewPane;

    // method untuk memanggil layout
    public Pane getPane(String namaLayout) {
        try {
            URL layoutUrl = Main.class.getResource(namaLayout + ".fxml");
            if (namaLayout == null) {
                System.out.println("File FXML Tidak Ditemukan!");
            }
            viewPane = new FXMLLoader().load(layoutUrl);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Tidak ada " + namaLayout + ", cek FXMLLoader!");
        }
        return viewPane;
    }
}
