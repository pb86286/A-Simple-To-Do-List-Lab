package org.example;

public class App {
    public static void main(String[] args) {
        TaskList list = new TaskList();

        list.add("Buy milk");
        list.add("Buy eggs");
        list.add("Prepare a lesson for CSC 122");
        list.add("Sow beet seeds");

        list.complete("Buy eggs");

        System.out.println("\nAll tasks:");
        list.all();

        System.out.println("\nCompleted tasks:");
        list.complete();

        System.out.println("\nIncomplete tasks:");
        list.incomplete();

        System.out.println("\nClearing list...");
        list.clear();

        System.out.println("\nAll tasks after clearing:");
        list.all();
    }
}