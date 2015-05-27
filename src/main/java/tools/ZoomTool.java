package tools;

import javafx.scene.input.MouseEvent;
import modelAdapters.ModelAdapter;

/**
 * Created by joshheinrichs on 15-05-06.
 */
public class ZoomTool extends Tool {

    public ZoomTool(ModelAdapter modelAdapter) {
        super(modelAdapter);
    }


    public String getName() {
        return "Zoom";
    }

    @Override
    public void onMouseClicked(MouseEvent t) {

    }

    @Override
    public void onMousePressed(MouseEvent t) {
        switch (t.getButton()) {
            case PRIMARY:
                modelAdapter.setCameraZoom(modelAdapter.getCameraZoom() * 2.0);
                break;
            case SECONDARY:
                modelAdapter.setCameraZoom(modelAdapter.getCameraZoom() * 0.5);
                break;
        }
        modelAdapter.draw();
    }

    @Override
    public void onMouseReleased(MouseEvent t) {

    }

    @Override
    public void onMouseDragged(MouseEvent t) {

    }

    @Override
    public void backgroundOnMouseClicked(MouseEvent t) {

    }

    @Override
    public void backgroundOnMousePressed(MouseEvent t) {

    }

    @Override
    public void backgroundOnMouseReleased(MouseEvent t) {

    }

    @Override
    public void backgroundOnMouseDragged(MouseEvent t) {

    }

    @Override
    public void vertexOnMouseClicked(MouseEvent t) {

    }

    @Override
    public void vertexOnMousePressed(MouseEvent t) {

    }

    @Override
    public void vertexOnMouseReleased(MouseEvent t) {

    }

    @Override
    public void vertexOnMouseDragged(MouseEvent t) {

    }
}
