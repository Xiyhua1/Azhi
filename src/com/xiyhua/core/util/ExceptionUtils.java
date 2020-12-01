package com.xiyhua.core.util;

import com.xiyhua.core.entity.MessageEnum;

/***************************************************************************
 * <PRE>
 *  Project Name    : local
 *
 *  Package Name    : org.azhi.core.util
 *
 *  File Name       : ExceptionUtils
 *
 *  Creation Date   : 2020/12/1 23:08
 *
 *  Author          : wadelaw
 *
 *  Purpose         :  
 *
 *  History         : 
 *
 * </PRE>
 ***************************************************************************/
public class ExceptionUtils {
    public static void process(Exception e){
        String simpleName = e.getClass().getSimpleName();
        MessageEnum messageEnum = MessageEnum.valueOf(simpleName);
        System.out.println(messageEnum.getMessage());
    }
}
