package hu.fuzesitamas.bejegyzesprojekt;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Bejegyzes> bejegyzesek=new ArrayList<>();
    public static void main(String[] args) {
        Bejegyzes bejegyzes1=new Bejegyzes("Troll tanár","Idén egy vizsgaremeket sem fogok átengedni, hogy mindenkinek ősszel kelljen vizsgáznia.");
        Bejegyzes bejegyzes2=new Bejegyzes("Junior fejlesztö","Azt hiszi, hogy programozni fog, de valójában bugfixál, és oktatási felületről tanul.");
        bejegyzesek.add(bejegyzes1);
        bejegyzesek.add(bejegyzes2);
    }
}
