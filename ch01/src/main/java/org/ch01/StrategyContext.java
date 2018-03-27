package org.ch01;

import java.util.ArrayList;
import java.util.List;

/**
 * StrategyContext中持有奖金计算的所有策略，
 * 并在静态代码块中初始化所有的奖金计算策略。
 * 而getStrategy方法则根据具体的职工实例获取其对应的奖金计算策略，
 * 在该方法中，我们遍历了所有的奖金计算策略，调用每种策略的accept方法，如果返回true，
 * 则表明该策略适合用于计算该职工的奖金，并将该策略返回给客户端。
 */
public class StrategyContext {
    private static List<BonusCalculatorStrategy> strategies = new ArrayList<>();
    
    static {
        strategies.add(new P4BonusCalculatorStrategy());
        strategies.add(new P5BonusCalculatorStrategy());
        strategies.add(new P6BonusCalculatorStrategy());
    }
    
    public static BonusCalculatorStrategy getStrategy(Employee employee){
        for (BonusCalculatorStrategy strategy : strategies) {
            if(strategy.accept(employee)){
                return strategy;
            }
        }
        return null;
    }
}
