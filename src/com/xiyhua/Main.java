package com.xiyhua;

import com.xiyhua.core.util.CalculateUtils;
import com.xiyhua.core.util.ExceptionUtils;

import java.util.Scanner;

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
            System.out.println("输入模度系数M：");
            Scanner scanner=new Scanner(System.in);
            double m = scanner.nextDouble();
            double[] ms = CalculateUtils.getMs(m);
            for (double v : ms) {
                double[] accumulatedScreenResidues = CalculateUtils.getAccumulatedScreenResidues(v);

            }
        }catch (Exception e){
            e.printStackTrace();
            ExceptionUtils.process(e);
        }
    }
}
