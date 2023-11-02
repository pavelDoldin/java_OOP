package sem_3_2_dz;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.ageEmployee(), o2.ageEmployee());
    }
}
