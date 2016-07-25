package com.bitwise.GlidedRose;

import java.util.List;

/**
 * Created by Dipikab on 7/25/2016.
 */
public class Quality {

    public void nonegativequality(int i) {
        if(i<0)
              throw new QualityIsNeverNegativeException();
    }

    public void qualityNotmorethan50(int i) {
        if(i>50)
            throw new QualityIsNotMorethan50Exception();
    }

    public void lowerattributes(int sellin,int quality ) {
        sellin--;
        quality--;
    }

    public int updatequalityagedbrie(Item obj)
    {   nonegativequality(obj.quality);
        qualityNotmorethan50(obj.quality);
        obj.sellin--;
        obj.quality++;

        if (checkSellinPassedorNot(obj))
        {
            return (obj.quality);
        }

        return (obj.quality);
    }

    public boolean checkSellinPassedorNot(Item item1)
    {
        if (item1.sellin<=0)

            return true;
        else
            return false;

    }

    public class QualityIsNeverNegativeException extends RuntimeException {
    }

    public class QualityIsNotMorethan50Exception extends RuntimeException {
    }
}