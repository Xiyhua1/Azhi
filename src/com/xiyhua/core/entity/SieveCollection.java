package com.xiyhua.core.entity;

/***************************************************************************
 * <PRE>
 *  Project Name    : local
 *
 *  Package Name    : org.azhi
 *
 *  File Name       : SieveCollection
 *
 *  Creation Date   : 2020/12/1 22:49
 *
 *  Author          : wadelaw
 *
 *  Purpose         :  
 *
 *  History         : 
 *
 * </PRE>
 ***************************************************************************/
public class SieveCollection {
    private Sieve sieve1;
    private Sieve sieve2;
    private double average;
    public SieveCollection(Sieve sieve1,Sieve sieve2){
        this.sieve1=sieve1;
        this.sieve2=sieve2;
        calculate();
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
    private void calculate(){
        this.average=(sieve1.getAccumulatedScreenResidue()+sieve2.getAccumulatedScreenResidue())/2;
    }
}
