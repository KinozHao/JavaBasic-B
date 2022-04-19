package keypoint;

public class ThrowsBasic {
    public static void main(String[] args) throws AgeNotReallyException {

    }
}
class student {
    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public student() {
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

    public void setAge(int age) throws AgeNotReallyException {   //抛出异常
        if (age>=0 && age<=150) {   //判断年龄的取值范围
            this.age = age;
        }else {
            try {
                throw new AgeNotReallyException("年龄异常");        //抛一个自己定义的异常并加入提示值
            }catch (Exception e){
                System.out.println("Nothing~~~~");
            }
        }
    }
}
