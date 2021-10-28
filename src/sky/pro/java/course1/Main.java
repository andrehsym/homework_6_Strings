package sky.pro.java.course1;

public class Main {

    public static void main(String[] args) {
	//ЗАДАЧА 1
        System.out.println("ЗАДАЧА 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);

        System.out.println(" ");

        //ЗАДАЧА 2
        System.out.println("ЗАДАЧА 2");

        String fullNameUpperCase = fullName.toUpperCase();

        System.out.println(fullNameUpperCase);

        System.out.println(" ");

        //ЗАДАЧА 3
        System.out.println("ЗАДАЧА 3");

        String fullNameRemaked = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameRemaked);

        System.out.println(" ");

        //ЗАДАЧА 4
        System.out.println("ЗАДАЧА 4");

        fullName = "Иванов Семён Семёнович";
        String fullNameReRemaked = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameReRemaked);

        System.out.println(" ");
    }
}