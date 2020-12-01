package com.xiyhua.core.entity;

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
    public Sieve(double sieveResidue,Sieve sieve){
        this.sieveResidue=sieveResidue;
        calculate(sieve);
    }
    public Sieve(double sieveResidue){
        this(sieveResidue,null);
    }
    private void calculate(Sieve sieve) {
        separateSieveResidue=sieveResidue/500;
        if(sieve!=null){
            accumulatedScreenResidue=separateSieveResidue+sieve.getSeparateSieveResidue();
        }
        accumulatedScreenResidue=separateSieveResidue;
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
