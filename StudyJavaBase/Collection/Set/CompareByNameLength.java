package Set;

import java.util.Comparator;

import Model.Person;

public class CompareByNameLength implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        //����name���Ƚ�������
        int num = p1.getName().length() - p2.getName().length();
        if(num == 0){
            num = p1.getName().compareTo(p2.getName());
            if(num == 0){
                num = p1.getAge() - p2.getAge();
            }
        }
        return num;
    }

}