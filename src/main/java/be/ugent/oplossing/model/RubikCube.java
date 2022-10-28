package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RubikCube implements IRubikCube {

    private List<Kubusje> kubusjes;

    public RubikCube() {
        kubusjes = new ArrayList<>();

        Color[] boven = new Color[]{Color.BLACK, Color.BLACK, Color.GREEN};
        Color[] voor = new Color[]{Color.BLACK, Color.BLACK, Color.YELLOW};
        Color[] links = new Color[]{Color.ORANGE, Color.BLACK, Color.BLACK};
        Color[] achter = new Color[]{Color.WHITE, Color.BLACK, Color.BLACK};
        Color[] rechts = new Color[]{Color.BLACK, Color.BLACK, Color.RED};
        Color[] onder = new Color[]{Color.BLUE, Color.BLACK, Color.BLACK};
        for (int z = -1; z < 2; z++) {
            for (int x = -1; x < 2; x++) {
                for (int y = -1; y < 2; y++) {
                    Hoekpunt centrum = new Hoekpunt(x*2,y*2,z*2);
                    Kubusje kub = new Kubusje(centrum, boven[z+1],voor[x+1],links[y+1],achter[x+1],rechts[y+1],onder[z+1]);
                    kubusjes.add(kub);
                }
            }
        }
    }

    @Override
    public List<IFace> getAllFaces() {
        return kubusjes.stream().map(kubusje -> kubusje.getAllVlakken()).flatMap(List::stream).collect(Collectors.toList());
    }
}
