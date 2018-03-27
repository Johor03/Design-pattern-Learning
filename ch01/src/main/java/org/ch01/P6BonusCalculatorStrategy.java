package org.ch01;

import org.ch01.Employee.Rank;

public class P6BonusCalculatorStrategy implements BonusCalculatorStrategy {
    
    
    @Override
    public boolean accept(Employee employee) {
        if (employee != null && employee.getRank() == Rank.P6) {
            return true;
        }
        return false;
    }
    
    @Override
    public int calculatorBonus(Employee employee) {
        if (employee.getSeniority() > 3) {
            return 4000;
        } else {
            return 3000;
        }
    }
}
