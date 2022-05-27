package d_generics.dao_test;

/**
 * @author kinoz
 * @Date 2022/5/27 - 21:09
 * @apiNote �Ѵ��࿴Ϊ���ݿ��е�һ��Ա������
 */
public class Employee{
    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}