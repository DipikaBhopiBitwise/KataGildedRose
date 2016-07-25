package com.bitwise.GildedRoseTest;

import com.bitwise.GlidedRose.Item;
import com.bitwise.GlidedRose.Quality;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dipikab on 7/25/2016.
 */
public class AgedBrieItemTest {
    @Test
    public void QualityShouldIncreaseAsSellinValueDecreases()
    { Quality qual2=new Quality();
        List<Item> agedbrie = new ArrayList<Item>();

        Item item = new Item("Item1",10,30);
        agedbrie.add(item );
        qual2.updatequalityagedbrie(item);
    }

}
