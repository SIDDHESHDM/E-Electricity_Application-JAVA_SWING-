/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CUST_DATA;

/**
 *
 * @author USER
 */
public class CUSTOMER 
{
    String name,adr,psw;
    int mon,mno,c1,c2;
    
    public CUSTOMER(String s1,String s2,String s3,int n1,int n2,int n3,int n4)
    {
        this.name=s1;
        this.adr=s2;
        this.psw=s3;
        this.mon=n1;
        this.mno=n2;
        this.c1=n3;
        this.c2=n4;
    }

    public String getName() {
        return name;
    }

    public String getAdr() {
        return adr;
    }

    public String getPsw() {
        return psw;
    }

    public int getMon() {
        return mon;
    }

    public int getMno() {
        return mno;
    }

    public int getC1() {
        return c1;
    }

    public int getC2() {
        return c2;
    }
    
}
