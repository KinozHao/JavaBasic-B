package d_generics.dao_test;

/**
 * @author kinoz
 * @Date 2022/5/27 - 21:13
 * @apiNote
 */
public class DaoTest {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        dao.add(new Employee(20,"Tom"));
        System.out.println(dao);
    }
}
