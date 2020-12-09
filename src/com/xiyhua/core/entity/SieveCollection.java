package com.xiyhua.core.entity;

import com.xiyhua.core.util.CalculateUtils;

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

    public SieveCollection(Sieve sieve1, Sieve sieve2) {
        this.sieve1 = sieve1;
        this.sieve2 = sieve2;
    }

    public Sieve getSieve1() {
        return sieve1;
    }

    public Sieve getSieve2() {
        return sieve2;
    }

    @Override
    public String toString() {
        return "SieveCollection{" +
                "1筛余=" +  CalculateUtils.getFormatValue(CalculateUtils.DECIMAL_FORMAT,sieve1.getSieveResidue()/100) +
                "|2筛余=" + CalculateUtils.getFormatValue(CalculateUtils.DECIMAL_FORMAT,sieve2.getSieveResidue()/100) +
                "|1分计筛余" + sieve1.getSeparateSieveResidue() +
                "|2分计筛余"+sieve2.getSeparateSieveResidue()+
                "|1累计筛余"+sieve1.getAccumulatedScreenResidue()+
                "|2累计筛余"+sieve2.getAccumulatedScreenResidue()+
                "|平均"+ getAvg()+
                '}';
    }
    public int getAvg(){
        return (int)(sieve1.getAccumulatedScreenResidue()+sieve2.getAccumulatedScreenResidue())/2;
    }
}
