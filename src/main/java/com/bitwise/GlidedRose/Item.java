package com.bitwise.GlidedRose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dipikab on 7/25/2016.
 */

    public class Item {
    public String name;
    public int sellin;
    public int quality;
    List<Item> list = new ArrayList<Item>();

    public Item(String name, int sellin, int quality) {
        this.name = name;
        this.sellin = sellin;
        this.quality = quality;
        list.add(this);
    }
}
