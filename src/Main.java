import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Рандомные числа");
        List<Integer> lists = new Random().ints(0, 999).limit(30).boxed().collect(Collectors.toList());
        System.out.println(lists);

        System.out.println("\nTask 1");
        for (Integer list : lists) {
            if (list % 2 == 1) {
                System.out.print(list + " ");
            }
        }

        System.out.println("\n\n Task 2");
        Set<Integer> set = new TreeSet<>(lists);
        for (Integer integer : set) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }

        System.out.println("\n\n Task 3");
        List<String> stringList = new ArrayList<>(Arrays.asList("Веский", "Клип", "Кумекать", "Мастак", "Полисмен",
                "Повысить", "Пустоцвет", "Рубаха", "Сытеть", "Эскавэ", "Повысить", "Кумекать", "Клип", "Повысить",
                "Кумекать", "Клип", "Повысить", "Кумекать", "Клип"));
        Set<String> setString = new HashSet<>(stringList);
        System.out.println(setString);

        System.out.println("\nTask 4");
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три","пять","пять","пять","пять","пять"));
        System.out.println(words);
        Map<String, Integer> map = new HashMap<>();
        for (String string : words) {
            if (map.containsKey(string)) {
                Integer count = map.get(string) + 1;
                map.put(string, count);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map.values());
    }
}