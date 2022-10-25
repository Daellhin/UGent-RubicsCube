package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class RubikCube implements IRubikCube {

    private List<Kubusje> kubusjes;

    public RubikCube() {
        kubusjes = new ArrayList<>();

        Hoekpunt centrum = new Hoekpunt(2,2,2);
        Kubusje kub = new Kubusje(centrum, Color.RED,Color.GREEN,Color.YELLOW,Color.BLACK,Color.BLACK,Color.BLUE);
        kubusjes.add(kub);
        centrum = new Hoekpunt(2,0,0);
        kub = new Kubusje(centrum,Color.RED,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK);
        kubusjes.add(kub);
        centrum = new Hoekpunt(2,2,2);
        kub = new Kubusje(centrum,Color.RED,Color.YELLOW,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK);
        kubusjes.add(kub);
    }

    @Override
    public List<IFace> getAllFaces() {
        return kubusjes.stream().map(kubusje -> kubusje.);
    }
}
