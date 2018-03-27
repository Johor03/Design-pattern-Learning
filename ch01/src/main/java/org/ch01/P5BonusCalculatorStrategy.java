package org.ch01;

import org.ch01.Employee.Rank;

public class P5BonusCalculatorStrategy implements BonusCalculatorStrategy {
    
    
    @Override
    public boolean accept(Employee employee) {
        if (employee != null && employee.getRank() == Rank.P5) {
            return true;
        }
        return false;
    }
    
    @Override
    public int calculatorBonus(Employee employee) {
        if (employee.getSeniority() > 2) {
            return 3000;
        } else {
            return 2000;
        }
    }
}
