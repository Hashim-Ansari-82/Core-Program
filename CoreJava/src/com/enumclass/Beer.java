package com.enumclass;

public enum Beer {

    KO,KF,KC,RC;
}
class Test{
    public static void main(String[] args) {

        Beer b1=Beer.RC;
        System.out.println(b1);

        Beer b2=Beer.KC;
        System.out.println(b2);

        Beer b3=Beer.KF;
        System.out.println(b3);

        Beer b4=Beer.KO;
        System.out.println(b4);

    }
}