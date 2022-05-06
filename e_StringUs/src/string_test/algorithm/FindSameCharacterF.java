package string_test.algorithm;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/6 - 19:59
 * @apiNote дһ������ ��ȡ���ַ�һ�����ַ�������ͬ�ַ�
 * For instance StrA:"dalfjaAOD",StrB:"AOB"
 * print result: AOB
 */
public class FindSameCharacterF {
    @Test
    public void SameTest(){
        System.out.println(getMaxSameString("abcdesdfafdoc","doc"));
    }
    public String getMaxSameString(String mainStr,String subStr){
        //���벻��Ϊ��
        if (mainStr != null && subStr != null) {
            synchronized (this) {
                //ȡ��mainStr��subStr����һ���ĳ���
                String maxStr = mainStr.length() >= subStr.length() ? mainStr : subStr;
                String minStr = mainStr.length() < subStr.length() ? mainStr : subStr;

                int length = minStr.length();
                //���Ҫ�Ƚ϶��ٴ���
                for (int i = 0; i < length; i++) {
                    for (int x = 0, y = length - i; y <= length; x++, y++) {

                        //minStr������ַ�
                        String returnStr = minStr.substring(x, y);

                        //��һ����ֻ���ж�minStr ����ľ���Ҫ���µı���returnStr���ж�
                        if (maxStr.contains(returnStr)) {
                            return returnStr;
                        }
                    }
                }
            }
        }
        return null;
    }
}
