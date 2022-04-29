package array_us.bobblesort;
//����߼����ֲ��Ҵ���ʵ���Լ�ע������
public class BobbleSort3 {
    public static void main(String[] args) {
        int [] arr={22,33,44,55,66,77};
        System.out.println(getindex(arr,22));
        System.out.println(getindex(arr,44));
        System.out.println(getindex(arr,88));
    }
    /*
    * ����ֵ����int
    * �������� ing  [] arr int value
    * */
    public static int getindex(int [] arr,int value){
        int min=0;
        int max=arr.length-1;
        int mid=(min+max) /2;
        while (arr[mid] != value){  //���м�ֵ������Ҫ���ҵ�ֵ��ʱ��,�Ϳ�ʼѭ������
            if(arr[mid]<value) {    //���м�ֵС����Ҫ�ҵ�ֵ��ʱ��
                min = mid + 1;      //��С�������ı�
            }else if (arr[mid]>value){  //���м��ֵ����Ҫ�ҵ�ֵ��ʱ��
                max= mid - 1;           //���������ı�
            }
                mid=(min+max) /2;      //�������Ļ�����С�ĸı�,�м������������֮�ı�

            if (min>max){               //�����С���������������ֱ�ӷ���-1
                return -1;
            }
        }
        return mid;
    }
}