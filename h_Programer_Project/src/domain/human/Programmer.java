package domain.human;

import domain.equipment.Equipment;
import service.Status;

/**
 * @author kinoz
 * @date 2022/4/22 - 20:50
 * @apiNote
 */
public class Programmer extends Employee{
    private int memberId;//开发团队中的id
    /*所有人Status默认状态为free
    NameLitService中项目并没有要求加入status元素
    是通过后期的TeamService调用时再进行修改的
     */
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
        super();
    }

    public Programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        //调用getDescription()方法来返回具体的信息，若不调用则返回地址值
        return getDetails()+"\t程序员\t"+status+"\t\t\t\t\t"+equipment.getDescription();
    }
}
