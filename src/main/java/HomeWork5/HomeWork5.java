package HomeWork5;

import java.util.*;
public class HomeWork5 {
    public static void main(String[] args) {
        String text = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. " +
                "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов. Просто текст и ни чего кроме текста.";

        printStats(text);
    }

    static void printStats(String text) {
        //  Приведение текста к нижнему регистру, удаление запятых и точек.
        text = text.replaceAll("[.,]", "").toLowerCase();
        System.out.println(text);

        // 2. Разделение текста на слова и сбор статистики.
        String[] words = text.split("\\s+");
        Map<Integer, List<String>> stats = new TreeMap<>();

        for (String word : words) {
            // Убедимся, что слово не состоит только из дефисов.
            if (!word.matches("-+")) {
                int wordLength = word.replaceAll("-", "").length();

                if (!stats.containsKey(wordLength)) {
                    stats.put(wordLength, new ArrayList<>());
                }
                stats.get(wordLength).add(word);
            }
        }

        // Вывод статистики.
        for (Map.Entry<Integer, List<String>> entry : stats.entrySet()) {
            int length = entry.getKey();
            List<String> wordsList = entry.getValue();
            System.out.println(length + " -> " + wordsList);

        }
    }
}