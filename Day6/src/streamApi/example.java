package streamApi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class example {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee(1,"Punit",15000,"It"),
                new Employee(2,"Parth",50000,"DTS"),
                new Employee(3,"Dipika",28000,"BDE"),
                new Employee(4,"Sunit",35000,"QA")
        );

        List<Employee> list = employeeList.stream()
                .filter(s -> s.salary > 25000)
                .toList();

//        filter() is used to select matching elements.

        System.out.println(list);

        Map<String, List<Employee>> deptMap =
                employeeList.stream()
                        .collect(Collectors.groupingBy(e -> e.department));

//        groupingBy is used for classification problems.

        System.out.println(deptMap);

        List<String> names =
                employeeList.stream()
                        .map(e -> e.name)
                        .toList();

        System.out.println(names);

        List<Employee> employeeList1 = employeeList.stream()
                .filter(s -> s.name.toLowerCase().startsWith("p"))
                .toList();
        System.out.println(employeeList1);

        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> integerList = list1.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(integerList);

        List<Integer> integerList1 = list1.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(integerList1);

        List<Integer> integerList2 = list1.stream()
                .filter(n -> n > 3)
                .map(n -> n * n)
                .toList();
        System.out.println(integerList2);

        Integer integer = list1.stream()
                .filter(s -> s > 2)
                .findFirst()
                .orElse(null);
        System.out.println(integer);

        long count = list1.stream()
                .filter(n -> n < 3)
                .count();
        System.out.println(count);

        List<Integer> integers = List.of(1, 5, 2, 10, 4);
        List<Integer> sortedList = integers.stream()
                .sorted()
                .toList();
        System.out.println(sortedList);

        List<Integer> reverseOrderList = integers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(reverseOrderList);

        List<Integer> integerList3 = integers.stream()
                .sorted((a, b) -> b - a)
                .toList();
        System.out.println(integerList3);

        List<Integer> list2 = List.of(1, 2, 3, 2, 3, 5, 7, 5, 4, 4);
        List<Integer> integerList4 = list2.stream()
                .distinct()
                .toList();
        System.out.println(integerList4);

        List<Integer> integerList5 = list2.stream()
                .limit(3)
                .toList();
        System.out.println(integerList5);

        List<Integer> integerList6 = list2.stream()
                .skip(2)
                .toList();

        System.out.println(integerList6);

        Integer reduce = list2.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
