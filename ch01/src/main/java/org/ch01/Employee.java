package org.ch01;

/**
 * 职工类只有2个跟奖金计算相关的属性，一个是入职年限seniority，另一个是职位级别rank。其中级别为枚举型Rank，分别有P4,P5,P6三个级别。
 */
public class Employee {
    
    
    private int seniority;
    private Rank rank;
    
    public Employee(int seniority, Rank rank) {
        super();
        this.seniority = seniority;
        this.rank = rank;
    }
    
    public int getSeniority() {
        return seniority;
    }
    
    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
    
    public Rank getRank() {
        return rank;
    }
    
    public void setRank(Rank rank) {
        this.rank = rank;
    }
    
    public enum Rank {
        P4, P5, P6
    }
}
