package org.ch01;


/**
 * 策略模式是一个计划或者方法，根据给定的输入条件达成一个目标，其意图是将可互换的方法封装在各个独立的类中，
 * 并且让每个方法都实现一个公共的操作。这个公共的操作称为策略操作，其实现由各个不同的类完成，这些类的实现虽
 * 然不同，但是接口是一致的，因此可以使用相同的接口给用户提供不同的策略进行互换。策略模式可以让一组策略共存，
 * 代码互不干扰，同时还将策略的选择逻辑从策略的实现中分离出来。
 * 本例通过策略模式来实现计算奖金的策略分开维护;使用策略模式代码的可读性跟可维护性大大提升。
 */
public class App {
    
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, Employee.Rank.P4);
        Employee employee2 = new Employee(2, Employee.Rank.P5);
        Employee employee3 = new Employee(3, Employee.Rank.P6);
        System.out.println(StrategyContext.getStrategy(employee1).calculatorBonus(employee1));
        System.out.println(StrategyContext.getStrategy(employee2).calculatorBonus(employee2));
        System.out.println(StrategyContext.getStrategy(employee3).calculatorBonus(employee3));
    }
}
