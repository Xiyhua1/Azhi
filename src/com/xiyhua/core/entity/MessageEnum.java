package com.xiyhua.core.entity;

/***************************************************************************
 * <PRE>
 *  Project Name    : local
 *
 *  Package Name    : org.azhi.core.entity
 *
 *  File Name       : ExceptionHandler
 *
 *  Creation Date   : 2020/12/1 23:09
 *
 *  Author          : wadelaw
 *
 *  Purpose         :  
 *
 *  History         : 
 *
 * </PRE>
 ***************************************************************************/
public enum MessageEnum {
     InputMismatchException("输入参数类型有误");
     private String message;
     MessageEnum(String message){
          this.message=message;
     }

     public String getMessage() {
          return message;
     }
}
