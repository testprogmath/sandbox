package ru.stepic.base;

public class Tasks {

    public static void main(String args[]) {
        int [] arrayFirst = new int []{1, 4,6,7,10};
        int [] arraySecond = new int[] {-2, -1, 0, 4,6, 8};
        int len1 = arrayFirst.length;
        int len2 = arraySecond.length;
        int [] summary = new int [len2 + len1];
        for (int i=0, j=0, k=0; k<len2 + len1; k++) {
            if (i<len1 && j<len2) {
                if (arrayFirst[i] < arraySecond[j]) {
                    summary[k] = arrayFirst[i];
                    i++;
                } else {
                    summary[k] = arraySecond[j];
                    j++;
                }
            }
            //костыль, чтобы избавиться от ошибки выхода за пределы массива
            else  {
                if (i==len1 && j<len2) {
                    summary[k]=arraySecond[j];
                    j++;
                }
                else {
                    summary[k]=arrayFirst[i];
                    i++;
                }
            }
            System.out.println(summary[k]);
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int len1 = a1.length;
        int len2 = a2.length;
        int[] summary = new int[len2 + len1];
        for (int i = 0, j = 0, k = 0; k < len2 + len1; k++) {
            if (i < len1 && j < len2) {
                if (a1[i] < a2[j]) {
                    summary[k] = a1[i];
                    i++;
                } else {
                    summary[k] = a2[j];
                    j++;
                }
            }
            //костыль, чтобы избавиться от ошибки выхода за пределы массива
            else {
                if (i == len1 && j < len2) {
                    summary[k] = a2[j];
                    j++;
                } else {
                    summary[k] = a1[i];
                    i++;
                }
            }

        }
        return summary;
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
