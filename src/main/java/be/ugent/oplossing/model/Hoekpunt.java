package be.ugent.oplossing.model;

import javafx.geometry.Point3D;

public class Hoekpunt extends Point3D {

    public Hoekpunt(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public Hoekpunt add(Point3D point3D) {
        return new Hoekpunt(this.getX() + point3D.getX(), this.getY() + point3D.getY(), this.getZ() +  point3D.getZ());
    }
}
