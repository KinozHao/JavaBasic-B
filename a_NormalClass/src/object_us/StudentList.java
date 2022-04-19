package object_us;

//这是一个子类
class StudentList {
    private String name;
    private int age;
    public StudentList() {
    }
    public StudentList(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {      //重写toStringMethod把参数返回到ToString类中
        //在ToString类中进行打印即可
        return "object_us.StudentList{" + "name='" + name + '\'' + ", age=" + age + '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentList that = (StudentList) o;
        return age == that.age &&
                name.equals(that.name);
    }

    //手动实现
    //重写的原则:比较两个对象的实体内容是否相同(即name和age)
/*    public boolean equals(Object obj){
        //比较的是地址，相同就返回true
        if (this == obj){
            return true;
        }

        if (obj instanceof object_us.StudentList) {
            object_us.StudentList slt = (object_us.StudentList) obj;
            //&&如果a和b都是true 则返回true
            //比较两个对象的属性是否都相同 前面age为基本数据类型 后面name为引用数据类型
            return this.age == age
                    &&
                    this.name.equals(slt.name);
        }
        return false;
    }*/

}
