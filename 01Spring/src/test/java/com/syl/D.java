package com.syl;

import org.junit.Test;
public class D {
    @Test
    public void Test01(){
        String str="abc bcd  dvf asd  end";
        String[] strs=str.split(" +");
        for (String s:strs) {
            System.out.println(s);
        }
    }
    /**
     * 字母最多出现3次
     * 数字最多出现5次
     */
    @Test
    public void Test02(){
        String str="ABC250";
        boolean s=str.matches("[A-Z]{1,3}[0-9]{1,5}");
        System.out.println(s);
    }
    @Test
    public void Test03(){
        String str="sasasasa 2018-05-20 sasa sa";
        str=str.replaceAll("([0-9]{4})-([0-9]{2})-([0-9]{2})","$2/$3 $1年");
        System.out.println(str);
    }
}
