package d_generics;

/**
* @author kinoz
* @Date 2022/5/29 - 9:30
* @apiNote
*������ʽ
���� FB�˺�У��
1:���������5-15λ����
2:0����Ϊ��ͷ
3:���붼������
*/
public class RegularUs {
    public static void main(String[] args) {
        //2.������鷨
        String regex="[1-9]\\d{4,14}";
        System.out.println("18557903842".matches(regex));

        System.out.println(VerifyAccount("124322335"));   //����Ҫ��
        System.out.println(VerifyAccount("0232323232"));  //������Ҫ��0��ͷ
    }

    //1.Java����ʵ��
    public static boolean VerifyAccount(String phoneNums){
        boolean flag=true;
        if (phoneNums.length()>=5 && phoneNums.length()<=15){ //fb��������5-15������ ���򷵻�false
            if (!phoneNums.startsWith("0")){           //fb��ͷ��Ϊ0����,����false
                char [] arr=phoneNums.toCharArray();   //�ַ���ת��Ϊ�ַ�����
                for (int i = 0; i < arr.length; i++) {  //�������
                    char cr=arr[i];             //��¼�����Ľ��
                    if (cr>='0' && cr<='9'){

                    }else{
                        flag=false;
                    }
                }
            }else{
                flag=false;
            }
        }else {
            flag=false;
        }
            return flag;
    }
}
