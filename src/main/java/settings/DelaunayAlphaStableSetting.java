package settings;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import uiAdapters.DelaunayTriangulationUiAdapter;

/**
 * Created by joshheinrichs on 15-06-02.
 */
public class DelaunayAlphaStableSetting extends DelaunayTriangulationSetting {

    static final double ALPHA_INPUT_WIDTH = 80.d;

    public DelaunayAlphaStableSetting(DelaunayTriangulationUiAdapter adapter) {
        super(adapter);

        root = new Group();

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER_LEFT);

        root.getChildren().add(hBox);

        final TextField alpha = new TextField(Double.toString(dt.getAlphaStability()));
        alpha.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable,
                                String oldValue, String newValue) {
                try {
                    dt.setAlphaStability(Double.parseDouble(newValue));
                    dt.draw();
                } catch (NumberFormatException e) {
                    dt.setAlphaStability(Double.NaN);
                    dt.draw();
                }
            }
        });
        alpha.setPrefWidth(ALPHA_INPUT_WIDTH);

        final CheckBox checkBox = new CheckBox("Alpha Stable");
        checkBox.setSelected(dt.isAlphaVisible());
        checkBox.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent t) {
                dt.setAlphaVisible(checkBox.isSelected());
                alpha.setDisable(!checkBox.isSelected());
                dt.draw();
            }
        });

        hBox.getChildren().add(checkBox);
        hBox.getChildren().add(alpha);
    }
}