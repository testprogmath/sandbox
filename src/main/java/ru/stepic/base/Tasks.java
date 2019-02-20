package ru.stepic.base;

public class Tasks {

    public static char charExpression(int a) {
        int b='\\';
        return (char)(b+a);
    }

    public static int bitCount(int value){
        return Integer.bitCount(value);
    }

    public static boolean isPowerOfTwo(int value) {
        /*
        int a = Integer.bitCount(Math.abs(value));
        boolean flag=false;
        if (a==1){
            flag=true;
        } */
        value = Math.abs(value);
        return ((value & (value-1))==0); // you implementation here
    }
    public static void main(String args[]) {
        int [] arrayFirst = new int []{1, 4,6,7,10};
        int [] arraySecond = new int[] {-2, -1, 0, 4,6, 8};
        /*    System.out.println(mergeArrays1(arrayFirst,arraySecond));
        boolean a= false;
        boolean b = false;
        boolean c = true;
        boolean d = true; */
        //System.out.println(booleanExpression (a, b, c, d));
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

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((!a & !b & c & d )|| (!a & b & !c & d)||(!a & b & c & !d) || (a & !b & !c & d) || (a & !b & c & !d)|| (a & b & !c & !d));
    }

    public static int[] mergeArrays1(int[] a1, int[] a2) {

        int zLength = a1.length + a2.length;
        int[] z = new int[zLength];


        for (int i = 0, j = 0, k = 0; k < (zLength); k++) {

            if (i > (a1.length - 1)) {
                z[k] = a2[j];
            }

            else if (j > (a2.length - 1)) {
                z[k] = a1[i];
            }

            else if (a1[i] < a2[j]) {
                z[k] = a1[i];
            }

            else {
                z[k] = a2[j];
            }
            System.out.println(z[k]);

        }

        return z;
    }
}
