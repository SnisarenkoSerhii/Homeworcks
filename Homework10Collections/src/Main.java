import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Sergey on 03.12.2015.
 * 1) Создать класс с несколькими полями. Создать коллекцию (можно ArrayList)
 * и заполнить ее обьектами этого класса. Отфильтровать коллекцию (найти обьекты которые
 * имеют определенное значение в одном из своих полей - к примеру найти всех однофамильцев в
 * коллекции персон) с помощью цикла и с помошью стрима.
 * 2) Выполнить аналогичные пункту 1 действия, но вместо коллекции возмем карту.
 */
public class Main {
    public static void main(String[] args) {

        List<Test> list = new ArrayList<>();
        list.add(new Test("Maxim"));
        list.add(new Test("Valentin"));
        list.add(new Test("Ivan"));
        list.add(new Test("Vasia"));
        list.add(new Test("Sergey"));
        list.add(new Test("Olga"));
        list.add(new Test("Maxim"));
        System.out.println(list.stream().sorted(new TestComparator()).collect(Collectors.toList()));


        list.forEach(System.out::println);
        System.out.println("-----------------------");
        Collections.sort(list, new TestComparator());
        list.forEach(System.out::println);


        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("two", 2);
        map.put("eleven", 11);
        map.put("four", 4);
        map.put("three", 3);
        map.put("five", 5);
        System.out.println(map);
        List list3 = new ArrayList(map.entrySet());
        System.out.println("From little to big");
        Collections.sort(list3, new TestMap());
        System.out.println(list3);
        System.out.println("From big to Little");
        Collections.sort(list3, new TestComparator());
        System.out.println(list3);

    }
}

