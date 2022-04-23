package domain.human;

import domain.equipment.Equipment;

/**
 * @author kinoz
 * @date 2022/4/22 - 20:50
 * @apiNote ���ʦ��
 */
public class Designer extends Programmer{
    //����
    private double bonus;

    public  Designer(){
        super();
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
