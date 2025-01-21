package org.dc.oop1.objects;

public class ExploreObjects {
    public static void main(String[] args) {
        Student bob = new Student("100982020", "Bob", "Bot", 1);
        String name = bob.showFullName(bob);
        System.out.println(name);
    }
}
