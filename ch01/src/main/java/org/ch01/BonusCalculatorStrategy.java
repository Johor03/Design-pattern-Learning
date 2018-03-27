package org.ch01;

/**
 * 策略设计模式接口
 * accept用来判断该策略是否可以用来计算传入的Employee实例的奖金，
 * calculateBonus方法则是具体计算奖金的策略
 */
public interface BonusCalculatorStrategy {
    
    boolean accept(Employee employee);
    
    int calculatorBonus(Employee employee);
}
