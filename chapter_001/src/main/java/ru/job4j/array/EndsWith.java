package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        // проверить. что массив word имеет последние элементы одинаковые с post
        int lengthPost = post.length;
        int lengthWord = word.length;
        for (int i = 0; i <= lengthPost; i++) {
            if ((lengthPost - i - 1) < 0) {
                break;
            } else if (word[lengthWord - i - 1] != post[lengthPost - i - 1]) {
                return false;
            }
        }
        return result;
    }
}
