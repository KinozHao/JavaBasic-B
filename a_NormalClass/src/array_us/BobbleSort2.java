package array_us;
//����߼�ѡ���������ʵ��
public class BobbleSort2 {
    public static void main(String[] args) {
        int [] arr={23,5,6543,23,6436634,22};
        method(arr);
        print(arr);
    }
    /*
    * ����ֵ����void
    * �������� int [] arr
    * */
    public static void method(int [] arr){
        for (int i = 0; i < arr.length -1; i++) {   //�����4�θ㶨-1
            for (int l = i+1; l < arr.length; l++) {
                if (arr[i]>arr[l]){
                    swap(arr,i,l);
                }
            }
        }
    }
    /*
    * ��λ����
    * 1:����ֵ���� void
    * 2:�����б� int[] arr,int i,int l
    * */
    public static void swap(int [] arr,int i,int l){
        int temp=arr[i];
        arr[i]=arr[l];
        arr[l]=temp;
    }
    public static void print(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
