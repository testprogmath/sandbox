package ru.stepic.base;

public class Tasks {

    public static void main(String args[]) {
       /* String text = "";
        StringBuilder builder = new StringBuilder();
        text = builder.append(text.replaceAll("[^a-zA-Z0-9]+", "")).toString().toLowerCase();
        //System.out.println(text);
        StringBuilder revBuilder = new StringBuilder();
        String revText = revBuilder.append(builder.reverse()).toString().toLowerCase();
        //System.out.println(revText);

        System.out.println(text.equals(revText)); */
    }


    public static boolean isPalindrome(String text) {
        StringBuilder builder = new StringBuilder();
        text = builder.append(text
                .replaceAll("[^a-zA-Z0-9]+", ""))
                .toString()
                .toLowerCase();
        StringBuilder revBuilder = new StringBuilder();
        String revText = revBuilder.append(builder.reverse())
                .toString()
                .toLowerCase();
        return text.equals(revText);

    }
}
