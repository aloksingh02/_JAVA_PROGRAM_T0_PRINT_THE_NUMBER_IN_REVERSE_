package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int rem=0,rev=0;
    while(temp!=0){
        rem = temp%10;
        rev = rev*10 + rem;
        temp = temp/10;
    }
        System.out.println(rev);
    }
}
