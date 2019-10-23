package com.qf.gitdemo.entity;

/**
 * @author WangWF
 * @Date 2019/10/23
 */
public class target {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String s1 = new String("zs");
        String s2 = new String("zs");
        System.out.println(s1 == s2);//false
        String s3 = "zs";
        String s4 = "zs";
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s1);//false
        String s5 = "zszs";
        String s6 = s3+s4;//新建了一个string对象
        System.out.println(s5 == s6);//false
        final String s7 = "zs";//变常量
        final String s8 = "zs";
        String s9 = s7+s8;//编译器在处理常量时会优化,把求和整合成常量,等同于 String s9 = "zszs";
        System.out.println(s5 == s9);//true
        final String s10 = s3+s4;//先new，在影响s10，
        System.out.println(s5 == s10);//false
    }
}
