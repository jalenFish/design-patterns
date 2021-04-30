package cn.zygxsq.design.module.prototypePattern;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.InitializingBean;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by yjl on 2021/4/30.
 * 缓存类 用于加载一些数据库的缓存的数据
 */
public class DataCache /*implements InitializingBean*/{
    //正常的情况是 实现 InitializingBean ，用于web服务启动的时候加载数据
    // 这里测试由于不是web服务，所以就模拟加载数据

    private static ConcurrentMap<String, Animal> animalCache = Maps.newConcurrentMap();

    public static Animal getAnimal(String id) throws Exception{
        Animal cache = animalCache.get(id);
        return (Animal) cache.clone();
    }

    public static void init(){
        Dog dog = new Dog();
        String dogid = "111";
        dog.setId(dogid);
        animalCache.put(dogid,dog);

        Dog dog2 = new Dog();
        String dogid2 = "222";
        dog2.setId(dogid2);
        animalCache.put(dogid2,dog2);

        Cat cat = new Cat();
        String catid = "333";
        cat.setId(catid);
        animalCache.put(catid,cat);

        animalCache.put("444",cat);

    }
}
