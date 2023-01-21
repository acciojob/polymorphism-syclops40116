package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y){
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y){
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int ans1 = p.product(1, 1);
        int ans2 = p.product(1, 1, 1);
        double ans3 = p.product(1.1, 1.1);
    }
}