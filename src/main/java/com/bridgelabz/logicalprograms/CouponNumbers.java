package com.bridgelabz.logicalprograms;

import java.util.*;

public class CouponNumbers {

    public static Set<Character> getCoupon() {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String combination = upper + lower + number;
        int length = combination.length();
        Random random = new Random();
        int len = random.nextInt(10) + 1;
        char[] coupon = new char[len];
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            coupon[i] = combination.charAt(random.nextInt(length));
            set.add(coupon[i]);
        }
        return set;
    }

    public static void main(String[] args) {

        System.out.print("Generated Coupon is : ");
        Set<Character> set = getCoupon();
        for (char ch : set) {
            System.out.print(ch);
        }
    }
}
