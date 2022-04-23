package service;

import domain.equipment.Equipment;
import domain.equipment.NoteBook;
import domain.equipment.PC;
import domain.equipment.Printer;
import domain.human.Architect;
import domain.human.Designer;
import domain.human.Employee;
import domain.human.Programmer;
//导入Data类的所有结构体
import java.util.zip.DeflaterOutputStream;

import static service.Data.*;

/**
 * @author kinoz
 * @date 2022/4/22 - 20:48
 * @apiNote 负责把Data中的数据封装到Employee[]数组中
 * 并提供Employee[]相关的方法
 */
public class NameListService {
    private Employee[] employees;

    //给employees及数组元素进行初始化
    public NameListService() {
        //根据提供的Data类 new相应大小的employees数组
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            //获取Data中[EMPLOYEE,PROGRAMMER,DESIGNER,ARCHITECT]四个全局常量
            int type =Integer.parseInt(EMPLOYEES[i][0]);

            //数组中数据全部为String类型，需要根据Employee构造器来判断是否要强转
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            double bonus = Double.parseDouble(EQUIPMENTS[i][5]);
            int stock = Integer.parseInt(EQUIPMENTS[i][6]);

            //此对象用于获取设备，在此处只声明不处理
            // 在具体某个类存在设别时候，在对应的位置去赋值
            Equipment equipment;

            //根据得到的具体某一个全局变量来new对象
            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = creatEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = creatEquipment(i);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = creatEquipment(i);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }
    //获取指定index上员工的设备
    private Equipment creatEquipment(int index){
        //获取Data中[PC,NOTEBOOK,PRINTER]3个全局常量
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        //PC与NOTEBOOK都拥有提出写，节省代码
        String model = EQUIPMENTS[index][1];
        switch (type){
            case PC:
                String display = EQUIPMENTS[index][2];
                return new PC(model,display);

            case NOTEBOOK:
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new NoteBook(model,price);

            case PRINTER:
                String name = EQUIPMENTS[index][1];
                String printerType = EQUIPMENTS[index][2];
                return new Printer(name,printerType);

        }
        return  null;
    }

    public Employee[] getAllEmployees(){
        return null;
    }

    public Employee getEmployee(int id){
        return null;
    }
}
