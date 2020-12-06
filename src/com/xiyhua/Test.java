package com.xiyhua;

import com.xiyhua.core.util.CalculateUtils;

import java.util.Arrays;

/***************************************************************************
 * <PRE>
 *  Project Name    : local
 *
 *  Package Name    : org.azhi.core
 *
 *  File Name       : Test
 *
 *  Creation Date   : 2020/12/1 23:21
 *
 *  Author          : wadelaw
 *
 *  Purpose         :  
 *
 *  History         : 
 *
 * </PRE>
 ***************************************************************************/
public class Test {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(CalculateUtils.getMs(0)));
        System.out.println(Arrays.toString(CalculateUtils.getAccumulatedScreenResidues(2.0)));
    }
}
