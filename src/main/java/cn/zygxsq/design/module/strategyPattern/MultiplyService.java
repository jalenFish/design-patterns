package cn.zygxsq.design.module.strategyPattern;

/**
 * Created by yjl on 2020/9/30.
 * 策略模式：博文介绍链接：https://blog.csdn.net/qq_27471405/article/details/108886135
 * 乘法服务
 */
public class MultiplyService extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp.toString(),"[*]");
        return arrayInt[0]*arrayInt[1];
    }
}
