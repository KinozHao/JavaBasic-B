package array_us;
//��������ת��ΪString����
public class ArrayToString {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,8};     //��������
        System.out.println(Method(arr));
    }
    /*
    * ����ֵ���� String
    * �����б� int[] arr
    * */
    public static String Method(int [] arr){
        StringBuffer sb=new StringBuffer(); //StringBuffer������
        sb.append("[");                     //���[�ַ�
        for (int i = 0; i < arr.length; i++) {  //�������
//            sb.append(arr[i]+", ");
            if (i==arr.length-1){           //�ж��Ƿ������ ĩβ��]����,
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();               //����StringBuffer������
    }

}