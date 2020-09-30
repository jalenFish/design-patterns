package cn.zygxsq.design.module.strategyPattern;

/**
 * Created by yjl on 2020/9/30.
 * 策略模式：博文介绍链接：https://blog.csdn.net/qq_27471405/article/details/108886135
 * 提供算法的方法辅助类
 */
public abstract class AbstractCalculator {

    /**
     * 算法处理方法一
     * @param exp
     * @param opt
     * @return
     */
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }


    public int[] split2(String exp,String opt){
        System.out.println("这里可以放其他算法等方法");
        return new int[]{2,5,11};
    }
}
