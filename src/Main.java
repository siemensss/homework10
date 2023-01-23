public class Main {
    public static void main(String[] args) {
        tasks();
    }

    public static void tasks() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String secondName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + secondName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Задача 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);
        System.out.println("Задача 3");
        String fullName1 = "Иванов Семён Семёнович";
        String correctFullName = fullName1.replace('ё', 'е');
        System.out.println(correctFullName);
    }
}