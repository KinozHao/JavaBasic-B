package string_method;


import org.junit.Test;
/**
 * @author kinoz
 * @Date 2022/5/3 - 22:26
 * @apiNote ��һ�ѷ���ǣ��������ʽ
 */
public class Method_C {
    @Test
    public void replaceMethod() {//�滻����
        //�滻ָ������һ���ַ���
        String s1="NanKingg";
        String s2 = s1.replace("King"," Company");
        //�滻ָ������һ��char�ַ�
        System.out.println(s2);
        String s3 = s1.replace('g','o');
        System.out.println(s3);

        //ȫ���滻���������滻Ϊ,ǣ��������ʽ
        String str = "nan23zhong32song32";
        System.out.println(str.replaceAll("\\d+",","));
    }

    @Test
    public void matchesMethod(){//matches�жϷ���
        String str ="123242";
        //�жϴ��ַ����ǲ���ȫ�����������
        System.out.println(str.matches("\\d+"));

        //�жϵ绰�������ţ��ͺ���λ���Բ���
        String str2 = "0571-4518716";
        System.out.println(str2.matches("0571-\\d{7,8}"));
    }

    @Test
    public void splitMethod(){//�и��
        String str = "hello|world|us";
        //���ַ�����|Ϊ���ݽ����и����
        String[] split = str.split("\\|");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]+" ");
        }
    }

}
