package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

public class Vlak implements  IFace{

    private Color kleur;
    private Hoekpunt[] hoekpunten;

    public Vlak(Color kleur, Hoekpunt[] hoekpunten) {
        this.kleur = kleur;
        this.hoekpunten = hoekpunten;
    }

    @Override
    public Color getFaceColor() {
        return kleur;
    }

    @Override
    public Point3D[] getFaceCorners() {
        return hoekpunten;
    }
}
