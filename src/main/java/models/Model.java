package models;

import geometry.Point;
import graph.Edge;
import graph.Vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshheinrichs on 15-05-06.
 */
public abstract class Model {
    public abstract void addVertex(Point location);
    public abstract void addVertexes(ArrayList<Point> points);

    public abstract void moveVertex(int index, Point location);
    public abstract void moveVertexes(ArrayList<Integer> selectedVertexes, double x, double y);

    public abstract void removeVertex(int index);
    public abstract void removeVertexes(ArrayList<Integer> vertexes);

    public abstract List<Vertex> getVertexes();
    public abstract List<Integer> getVertexes(double startX, double startY, double endX, double endY);

    public abstract List<Edge> getEdges();

    public abstract void clearVertexes();
}
