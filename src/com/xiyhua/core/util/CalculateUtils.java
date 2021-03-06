package com.xiyhua.core.util;

import com.xiyhua.core.entity.Sieve;
import com.xiyhua.core.entity.SieveCollection;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/***************************************************************************
 * <PRE>
 *  Project Name    : local
 *
 *  Package Name    : org.azhi
 *
 *  File Name       : Caculate
 *
 *  Creation Date   : 2020/12/1 22:39
 *
 *  Author          : wadelaw
 *
 *  Purpose         :  
 *
 *  History         : 
 *
 * </PRE>
 ***************************************************************************/
public class CalculateUtils {
  //  public static final DecimalFormat DECIMAL_FORMAT=new DecimalFormat("0.0");
  //  public static final DecimalFormat M_DECIMAL_FORMAT=new DecimalFormat("0.00");
    public static final Integer DECIMAL_LENGTH_1=1;
    public static final Integer DECIMAL_LENGTH_2=2;
    public static double[] getAccumulatedScreenResidues(double m){
        double[] doubles = new double[2];
        Random random=new Random();
        double i = random.nextDouble();
        //System.out.println("double i : "+i);
        doubles[0]=getDecimalValue(DECIMAL_LENGTH_1,(m-1)+i);
        doubles[1]=getDecimalValue(DECIMAL_LENGTH_1,2*m-doubles[0]);
        return doubles;
    }
//    public static double getFormatValue(DecimalFormat format,double value){
//
//        return Double.parseDouble(format.format(value));
//    }
    public static double getDecimalValue(int length,double value){
        BigDecimal bigDecimal=new BigDecimal(value);
        return bigDecimal.setScale(length, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double getM(List<Sieve> sieves){
        double sum=0;
        for (int i = 1; i < 6; i++) {
            sum+=sieves.get(i).getAccumulatedScreenResidue();
        }
        double a1 = sieves.get(0).getAccumulatedScreenResidue();
        return getDecimalValue(DECIMAL_LENGTH_2,(sum-5*a1)/(100-a1));
    }

    public static boolean validM(double m, double m1) {
        return m-m1<0.2||m1-m<0.2;
    }
    public static void printDSieveResidue(List<SieveCollection> list){
        double a1=500.0d,a2=500.0d;
        for (SieveCollection collections : list) {
            a1=getDecimalValue(DECIMAL_LENGTH_2,(a1-collections.getSieve1().getSieveResidue()));
            a2=getDecimalValue(DECIMAL_LENGTH_2,a2-collections.getSieve2().getSieveResidue());
        }
        System.out.println("底 1 筛余："+a1+"| 2 筛余："+a2);
    }
}
