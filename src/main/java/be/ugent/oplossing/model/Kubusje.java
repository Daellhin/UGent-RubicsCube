package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Kubusje {
//    Kubusje kub = new Kubusje(centrum, Color.RED,Color.GREEN,Color.YELLOW,Color.BLACK,Color.BLACK,Color.BLUE);
    private  Hoekpunt centrum;
    private List<Vlak> vlakken;

    public Kubusje(Hoekpunt centrum, Color boven, Color voor, Color links, Color achter, Color rechts, Color onder) {
        this.centrum = centrum;
        // bovenvlak
        Hoekpunt bovenRechtsachter = centrum.add(new Point3D(-1,1,1));
        Hoekpunt bovenRechtsvoor = centrum.add(new Point3D(1,1,1));
        Hoekpunt bovenLinksvoor = centrum.add(new Point3D(1,-1,1));
        Hoekpunt bovenLinksachter = centrum.add(new Point3D(-1,-1,1));

        Hoekpunt onderRechtsachter = centrum.add(new Point3D(-1,1,-1));
        Hoekpunt onderRechtsvoor = centrum.add(new Point3D(1,1,-1));
        Hoekpunt onderLinksvoor = centrum.add(new Point3D(1,-1,-1));
        Hoekpunt onderLinksachter = centrum.add(new Point3D(1,1,-1));
        vlakken = new ArrayList<>();
        vlakken.add(new Vlak(boven, new Hoekpunt[]{bovenRechtsachter,bovenRechtsvoor,bovenLinksvoor,bovenLinksachter})));
        vlakken.add(new Vlak(onder, new Hoekpunt[]{onderRechtsachter,onderRechtsvoor,onderLinksvoor,onderLinksachter}));

        vlakken.add(new Vlak(achter, new Hoekpunt[]{bovenRechtsachter,onderRechtsachter,onderLinksachter,bovenLinksachter}));
        vlakken.add(new Vlak(rechts, new Hoekpunt[]{bovenRechtsachter,onderRechtsachter,onderRechtsvoor,bovenRechtsvoor}));
        vlakken.add(vlakken.add(new Vlak(voor, new Hoekpunt[]{bovenRechtsvoor,onderRechtsvoor,onderLinksvoor,bovenLinksvoor}));
        vlakken.add(new Vlak(links, new Hoekpunt[]{bovenLinksachter,onderLinksachter,onderLinksvoor,bovenLinksvoor}));


    }

    public Vlak[] getAllVlakken() {
        return vlakken.toArray(ne);
    }

}
