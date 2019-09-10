package com.iqc.system.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum TypeEnum {


     DIR(0,"目录"),
     MENU(1,"菜单"),
     OPERATOR(3,",按钮");


     public final Integer code;

     public final String desc;


     private TypeEnum(Integer code,String desc)
     {
        this.code=code;
        this.desc=desc;
     }


    public final Integer getCode()
    {
        return this.code;
    }

    public final String getDesc()
    {
        return this.desc;
    }


    public static TypeEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //目录
        if(code.equals(0))
        {
            return DIR;
        }

        //菜单
        if(code.equals(1))
        {
            return MENU;
        }

        //,按钮
        if(code.equals(3))
        {
            return OPERATOR;
        }

         return null;
    }


}
