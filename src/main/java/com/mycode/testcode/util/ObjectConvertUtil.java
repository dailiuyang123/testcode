package com.mycode.testcode.util;

import com.mycode.testcode.entity.vc;


/**
 * @ClassName ObjectConvertUtil
 * Description: 类型自动转换 工具类
 * @Author dailiuyang
 * @Date 2019/8/6 9:56
 **/
public class ObjectConvertUtil {

    /**
     *
     */
    public static <T> T  fromObject(Object object,Class<T> aclass) throws IllegalAccessException, InstantiationException {

        String classpath = object.getClass().toString();
        System.out.println("类全路径"+classpath);
        T t = aclass.newInstance();

        return t;

    }


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        vc vc=new vc();
        vc.setVcName("vc");
        vc.setVcPphone("123456");
        vc.setOrderTotal(123);
        Object object=vc;
        com.mycode.testcode.entity.vc vc1 = fromObject(object, vc.getClass());

    }

}
