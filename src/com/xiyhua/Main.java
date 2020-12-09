package com.xiyhua;

import com.xiyhua.core.entity.Sieve;
import com.xiyhua.core.entity.SieveCollection;
import com.xiyhua.core.util.CalculateUtils;
import com.xiyhua.core.util.ExceptionUtils;

import java.util.*;

/***************************************************************************
 * <PRE>
 *  Project Name    : local
 *
 *  Package Name    : org.azhi
 *
 *  File Name       : Main
 *
 *  Creation Date   : 2020/12/1 22:32
 *
 *  Author          : wadelaw
 *
 *  Purpose         :  
 *
 *  History         : 
 *
 * </PRE>
 ***************************************************************************/
public class Main {
    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("输入模度系数M：");
                Scanner scanner = new Scanner(System.in);
                double[] doubles = new double[6];
                List<Sieve> sieves1 = new ArrayList<>();
                List<Sieve> sieves2 = new ArrayList<>();
                List<SieveCollection> collections = new ArrayList<>();
                for (int i = 0; i < doubles.length; i++) {
                    doubles[i] = scanner.nextDouble();
                    double[] accumulatedScreenResidues = CalculateUtils.getAccumulatedScreenResidues(doubles[i]);
                    Sieve sieve1 = new Sieve(accumulatedScreenResidues[0], i > 0 ? sieves1.get(i - 1) : null);
                    Sieve sieve2 = new Sieve(accumulatedScreenResidues[1], i > 0 ? sieves2.get(i - 1) : null);
                    SieveCollection collection = new SieveCollection(sieve1, sieve2);
                    sieves1.add(sieve1);
                    sieves2.add(sieve2);
                    collections.add(collection);
                }
                for (SieveCollection collection : collections) {
                    System.out.println(collection);
                }
                double m = CalculateUtils.getM(sieves1);
                System.out.println("M1 : " + m);
                double m1 = CalculateUtils.getM(sieves2);
                System.out.println("M2 : " + m1);
                System.out.println("|M1-M2| < 0.2 ? :" + CalculateUtils.validM(m, m1));
                CalculateUtils.printDSieveResidue(collections);
                System.out.println("Continue or Not : (Y/N)?");
                String next = scanner.next();
                if (next.equals("N")) {
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            ExceptionUtils.process(e);
        }
    }
}
