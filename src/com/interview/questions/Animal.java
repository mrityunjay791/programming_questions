package com.interview.questions;
class Animal {
    public static void main(String[] args) {
        Animal lion = new Animal();
        System.out.println("Main is completed.");
    }

    protected void finalize() {
        System.out.println("Rest in Peace!");
    }
}