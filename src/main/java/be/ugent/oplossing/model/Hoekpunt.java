package be.ugent.oplossing.model;

import javafx.geometry.Point3D;

public class Hoekpunt extends Point3D {

    public Hoekpunt(double v, double v1, double v2) {
        super(v, v1, v2);
    }

    @Override
    public Hoekpunt add(Point3D point3D) {
        return (Hoekpunt) super.add(point3D);
    }
}
