package domain.human;

import domain.equipment.Equipment;
import service.Status;

/**
 * @author kinoz
 * @date 2022/4/22 - 20:50
 * @apiNote
 */
public class Architect extends Designer{
    private int stock; //¹ÉÆ±

    public Architect() {
        super();
    }

    public Architect(int id, String name, int age, double salary,Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary,equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails()+"\t¼Ü¹¹Ê¦\t"+getStatus()+"\t"+getBonus()+"\t"+stock+"\t"+getEquipment().getDescription();
    }
}
