package org.ch01;

import org.ch01.Employee.Rank;

public class P4BonusCalculatorStrategy implements BonusCalculatorStrategy {
    
    
    @Override
    public boolean accept(Employee employee) {
        if (employee != null && employee.getRank() == Rank.P4) {
            return true;
        }
        return false;
    }
    
    @Override
    public int calculatorBonus(Employee employee) {
        if (employee.getSeniority() > 1) {
            return 2000;
        } else {
            return 1000;
        }
    }
}
