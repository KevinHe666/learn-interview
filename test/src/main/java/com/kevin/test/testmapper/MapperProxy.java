package com.kevin.test.testmapper;

import com.kevin.test.pojo.UserPO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: 手动实现动态代理
 * @Author: Kevin
 * @Create 2019-07-26 16:09
 */
public class MapperProxy implements InvocationHandler {

    @SuppressWarnings("unchecked")
    public <T> T newInsstance(Class<T> clz) {
        return (T) Proxy.newProxyInstance(clz.getClassLoader(), new Class[]{clz}, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (Object.class.equals(method.getDeclaringClass())) {
            try {
                //诸如hashCode() toString equals()等方法 将target指向当前对象this
                return method.invoke(this, args);
            } catch (Throwable t) {

            }
        }
        //投鞭断流
        return new UserPO((Integer) args[0], "kevin", 27);
    }
}
