package com.bitwise.GildedRoseTest;

import com.bitwise.GlidedRose.Item;
import com.bitwise.GlidedRose.Quality;
import org.junit.Test;

/**
 * Created by Dipikab on 7/25/2016.
 */
public class GildedRoseBasicQualityTest {
    @Test(expected=Quality.QualityIsNeverNegativeException.class)
    public void CheckQualityIsNotNegative()
    {
        Quality quaob=new Quality();
        quaob.nonegativequality(-2);

    }
    @Test(expected=Quality.QualityIsNotMorethan50Exception.class)
    public void CheckQualityIsNotMorethan50()
    {
        Quality quaob1=new Quality();
        quaob1.qualityNotmorethan50(72);

    }
    @Test
    public void itShouldLowertheAttributesNaturally()
    {
        Quality quaob1=new Quality();
        quaob1.lowerattributes(10,20);
    }
    @Test
    public void itShouldCheckTheSellInDateHasPassedOrNot()
    {  Quality qual2=new Quality();
        Item item1=new Item("Item2",10,20);
        qual2.checkSellinPassedorNot(item1);

    }

}
