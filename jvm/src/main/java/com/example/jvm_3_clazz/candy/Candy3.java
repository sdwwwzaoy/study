package com.example.jvm_3_clazz.candy;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Candy3 {

    public Set<String> test(List<String> list, Map<Integer, Object> map) {
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method test = Candy3.class.getMethod("test", List.class, Map.class);
        Type[] parameterTypes = test.getGenericParameterTypes();
        for (Type type : parameterTypes) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                System.out.println("原始类型 - " + parameterizedType.getRawType());
                Type[] arguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < arguments.length; i++) {
                    System.out.printf("泛型参数[%d] - [%s]\n", i, arguments[i]);
                }
            }
        }

        Type type = test.getGenericReturnType();
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            System.out.println("原始类型 - " + parameterizedType.getRawType());
            Type[] arguments = parameterizedType.getActualTypeArguments();
            System.out.printf("泛型参数[%d] - [%s]\n", 0, arguments[0]);
        }

    }

}
