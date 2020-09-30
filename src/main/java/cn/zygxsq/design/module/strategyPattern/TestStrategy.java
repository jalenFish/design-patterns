package cn.zygxsq.design.module.strategyPattern;


/**
 * Created by yjl on 2020/9/30.
 */
public class TestStrategy {
    public static void main(String[] args) {
        String exp = "10-3";
        ICalculator cal = new MinusService();
        int result = cal.calculate(exp);
        System.out.println(exp+"："+result);

    }
}
