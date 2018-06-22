package Assignment_13;

import java.util.*;

class Student{
    Integer age;
    String name;
    Student(String str, Integer x){
        name = str;
        age=x;
    }
}

class sortByAge implements Comparator<Student>{
    public int compare(Student s1 ,Student s2){
        return s1.age-s2.age;
        
    }
}

class sortByName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return( s1.name).compareTo(s2.name);
    }
}

public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student("Pankaj", 21));
		s.add(new Student("Ram", 27));
		s.add(new Student("Aayush", 19));
		s.add(new Student("Nikhil",20 ));
		
		
		sortByName obj = new sortByName();
        Collections.sort(s, obj);
        System.out.println("Sorted by Name :");
        for(Student e:s)
            System.out.println("Name : " + e.name+ "  Age : "+e.age);
       sortByAge obj1 = new sortByAge();
        Collections.sort(s, obj1);
        System.out.println("Sorted by Age :");
        for(Student e:s)
            System.out.println("Name : " + e.name+ "  Age : "+e.age);
		
		
		

	}

}
