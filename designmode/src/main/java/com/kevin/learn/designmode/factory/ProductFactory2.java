package com.kevin.learn.designmode.factory;

/**
 * @Description:利用反射进行的工厂模式
 * @Author: Kevin
 * @Create 2020-01-03 14:53
 */
public class ProductFactory2 {
    public static Product produce(String className) throws Exception {
        try {
            Product product = (Product) Class.forName(className).newInstance();
            Class<?> clazz=Class.forName(className);
            return product;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new Exception("没有该产品");
    }
}
