package service;

import domain.equipment.Equipment;
import domain.equipment.NoteBook;
import domain.equipment.PC;
import domain.equipment.Printer;
import domain.human.Architect;
import domain.human.Designer;
import domain.human.Employee;
import domain.human.Programmer;
//����Data������нṹ��
import java.util.zip.DeflaterOutputStream;

import static service.Data.*;

/**
 * @author kinoz
 * @date 2022/4/22 - 20:48
 * @apiNote �����Data�е����ݷ�װ��Employee[]������
 * ���ṩEmployee[]��صķ���
 */
public class NameListService {
    private Employee[] employees;

    //��employees������Ԫ�ؽ��г�ʼ��
    public NameListService() {
        //�����ṩ��Data�� new��Ӧ��С��employees����
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            //��ȡData��[EMPLOYEE,PROGRAMMER,DESIGNER,ARCHITECT]�ĸ�ȫ�ֳ���
            int type =Integer.parseInt(EMPLOYEES[i][0]);

            //����������ȫ��ΪString���ͣ���Ҫ����Employee���������ж��Ƿ�Ҫǿת
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            double bonus = Double.parseDouble(EQUIPMENTS[i][5]);
            int stock = Integer.parseInt(EQUIPMENTS[i][6]);

            //�˶������ڻ�ȡ�豸���ڴ˴�ֻ����������
            // �ھ���ĳ����������ʱ���ڶ�Ӧ��λ��ȥ��ֵ
            Equipment equipment;

            //���ݵõ��ľ���ĳһ��ȫ�ֱ�����new����
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
    //��ȡָ��index��Ա�����豸
    private Equipment creatEquipment(int index){
        //��ȡData��[PC,NOTEBOOK,PRINTER]3��ȫ�ֳ���
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        //PC��NOTEBOOK��ӵ�����д����ʡ����
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
