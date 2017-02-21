import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class CSVTable extends Application {
    // @Override
    public void start(Stage stage) throws Exception {
        // Opret TableView med TableColumns
        TableView table = new TableView();
        TableColumn lastName = new TableColumn("Efternavn");
        TableColumn firstName = new TableColumn("Fornavn");
        table.getColumns().add(lastName);
        table.getColumns().add(firstName);

        // Indsæt fra fil til TableView


        // Vis TableView på skærmen
        Scene scene = new Scene(table);
        stage.setScene(scene);
        stage.show();
    }
}
