package com.zm.design.prototype.deepclone;

import java.io.*;

public class DeepClonePrototype implements Serializable, Cloneable {
    private String name;
    public DeepCloneTarget deepCloneTarget;

    public DeepClonePrototype(String name, DeepCloneTarget deepCloneTarget) {
        this.name = name;
        this.deepCloneTarget = deepCloneTarget;
    }

    @Override
    public String toString() {
        return "DeepClonePrototype{" +
                "name='" + name + '\'' +
                ", deepCloneTarget=" + deepCloneTarget +
                '}';
    }

    //使用clone方法实现深拷贝

    @Override
    protected Object clone() {
        DeepClonePrototype deep = null;
        try {
            //克隆基本数据类型
            deep = (DeepClonePrototype) super.clone();
            deep.deepCloneTarget = (DeepCloneTarget) this.deepCloneTarget.clone();
            return deep;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //使用序列化进行深拷贝
    public Object deepClone() {

        //输出流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        //输入流
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepClonePrototype o = (DeepClonePrototype) ois.readObject();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
