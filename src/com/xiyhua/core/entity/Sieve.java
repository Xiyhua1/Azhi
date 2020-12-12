package com.xiyhua.core.entity;

import com.xiyhua.core.util.CalculateUtils;

/***************************************************************************
 * <PRE>
 *  Project Name    : local
 *
 *  Package Name    : org.azhi
 *
 *  File Name       : Sieve
 *
 *  Creation Date   : 2020/12/1 22:40
 *
 *  Author          : wadelaw
 *
 *  Purpose         :  
 *
 *  History         : 
 *
 * </PRE>
 ***************************************************************************/
public class Sieve {
    private double sieveResidue;
    private double separateSieveResidue;
    private double accumulatedScreenResidue;
    public Sieve(double accumulatedScreenResidue,Sieve sieve){
        this.accumulatedScreenResidue=accumulatedScreenResidue;
        calculateSeparateSieveResidue(sieve);
        this.sieveResidue=CalculateUtils.getDecimalValue(CalculateUtils.DECIMAL_LENGTH_1,separateSieveResidue*500/100);
    }
    private void calculateSeparateSieveResidue(Sieve sieve) {
        if(sieve!=null){
            separateSieveResidue= CalculateUtils.
                    getDecimalValue(CalculateUtils.DECIMAL_LENGTH_1
                            ,accumulatedScreenResidue-sieve.accumulatedScreenResidue);
        } else {
            separateSieveResidue=accumulatedScreenResidue;
        }
    }

    public double getSieveResidue() {
        return sieveResidue;
    }

    public void setSieveResidue(double sieveResidue) {
        this.sieveResidue = sieveResidue;
    }

    public double getSeparateSieveResidue() {
        return separateSieveResidue;
    }

    public void setSeparateSieveResidue(double separateSieveResidue) {
        this.separateSieveResidue = separateSieveResidue;
    }

    public double getAccumulatedScreenResidue() {
        return accumulatedScreenResidue;
    }


    public void setAccumulatedScreenResidue(double accumulatedScreenResidue) {
        this.accumulatedScreenResidue = accumulatedScreenResidue;
    }
}
