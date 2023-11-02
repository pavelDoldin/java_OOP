package sem_3_2_dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
