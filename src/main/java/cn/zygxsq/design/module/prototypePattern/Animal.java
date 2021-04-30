package cn.zygxsq.design.module.prototypePattern;

import java.io.*;

/**
 * Created by yjl on 2021/4/30.
 * 动物类
 * 原型模式：博文介绍链接：https://blog.csdn.net/qq_27471405/article/details/116309878
 */
public abstract class Animal implements Cloneable, Serializable{
    private String id;
    public String name;

    abstract void shout();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 浅复制
     */
    public Object clone() throws CloneNotSupportedException {
        Animal clone = (Animal) super.clone();
        return clone;
    }


    /**
     * 深复制
     */
    public Object deepClone() {
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            // 序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);/*将当前对象以对象流的方式输出*/
            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Animal deepProtoType = (Animal) objectInputStream.readObject();
            return deepProtoType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                byteArrayOutputStream.close();
                objectOutputStream.close();
                byteArrayInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
