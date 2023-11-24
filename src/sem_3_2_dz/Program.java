package sem_3_2_dz;

import java.util.*;

public class Program {
    public static void main(String[] args) {



        Random random = new Random();



        int count = 10;
        List<Employee> employees = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            int typeIndex = random.nextInt(2);

            if (typeIndex == 0) {
                employees.add(EmployeeFabric.generateWorker());
            } else {
                employees.add(EmployeeFabric.generateFreelancer());
            }
        }


        for (Employee employee: employees) {
            System.out.println(employee);
        }

        //Collections.sort(employees, new  AgeComparator()); // отсартирует по age
//
        //System.out.println("---------------");
//
        //for (Employee employee: employees) {
        //    System.out.println(employee);
        //}

        System.out.println("_______________");

        Collections.sort(employees, new NameComparator()); // отсартирует имена

        for (Employee employee : employees) {
            System.out.println(employee);
        }



//
        //System.out.println("---------------------------------------------------------------------");
//
        //Arrays.sort(workers, new SalaryComparator()); // сортировка по зарплате (сортирует числа) Comparator
        //Arrays.sort(workers);  // сортировка по имени и фамилии (сортирует строки) Comparable
//
        //for (Worker worker : workers) {
        //    System.out.println(worker);
        //}

    }
}
