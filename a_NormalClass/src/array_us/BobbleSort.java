package array_us;

public class BobbleSort {
    public static void main(String[] args) {
        int [] arr={10,43,53,312,64,1};
        array(arr); //�������򷽷�
        printf(arr);    //��ӡð����������Ԫ��
    }
    /*
    * ð������:
    * 1����ֵ���� void
    * 2�����б� int[] arr
    * */
    public static void array(int [] arr){
        //��ѭ��   ֻ��Ҫ�Ƚ�arr.length-1����
        for (int i = 0; i <arr.length-1 ; i++) {
        //��ѭ��   -1��Ϊ�˷�ֹ����Խ�� -i��Ϊ�����Ч��
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    //��λ����
                    swaps(arr,i,j);
                }
            }
        }
    }
    /*
    * ��λ����
    * 1:����ֵ����void
    * 2:�����б� int [] arr,i,j
    * */
    protected static void swaps(int [] arr,int i,int j){
        int tmep = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=tmep;
    }
    /*
    * ��ӡ����
    * 1����ֵ����void
    * 2�����б� int[] arr
    * */
    public static void printf(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
