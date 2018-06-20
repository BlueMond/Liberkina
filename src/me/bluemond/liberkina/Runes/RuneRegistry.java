package me.bluemond.liberkina.Runes;

import java.util.ArrayList;

public class RuneRegistry {

    private static ArrayList<Rune> runes;

    public RuneRegistry(ArrayList<Rune> runes){
        this.runes = runes;
    }

    public static ArrayList<Rune> getRegistry(){
        return runes;
    }
}
