package d_generic;

/*
    ������ʽ
    ����Ҫ��:
    ���� FB�˺�У��
    1:���������5-15λ����
    2:0����Ϊ��ͷ
    3:���붼������
*/
public class RegularUs {
    public static void main(String[] args) {


        System.out.println(checkFBAccount("124322335"));   //����Ҫ��
        System.out.println(checkFBAccount("0232323232"));  //������Ҫ��0��ͷ


        String regex="[1-9]\\d{4,14}";
        System.out.println("chinanumber".matches(regex));
    }


    public static boolean checkFBAccount(String fb){
        boolean flag=true;
        if (fb.length()>=5 && fb.length()<=15){ //fb��������5-15������ ���򷵻�false
            if (!fb.startsWith("0")){           //fb��ͷ��Ϊ0����,����false
                char [] arr=fb.toCharArray();   //�ַ���ת��Ϊ�ַ�����
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
