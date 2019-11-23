package com.wry.principle.inversion.dataconversion.remould;

/**
 * 把数据转换类
 * 利用反射原理动态生成要转换的格式
 */
public class DataConversion {
    public DataFormat conversionData(String className, AbstractSource source) {
        DataFormat obj = null;
        try {
            Class c = Class.forName(className);
            obj = (DataFormat) c.newInstance();
            obj.setData(source.getData() + "\t------【数据转换】");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
