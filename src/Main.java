public class Main {
    public static void main(String[] args) {
        // Строки.Домашнее задание.
        System.out.println("Строки.Домашнее задание.");
        // Задание 1.
        System.out.println("Задание 1.");
        String firstName = " Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName + ".");
        // Задание 2.
        System.out.println("Задание 2.");
        String fullNameBig = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameBig + ".");
        // Задание 3.
        System.out.println("Задание 3.");
        String firstNameRu = " Семён ";
        String middleNameRu = "Семёнович";
        String lastNameRu = "Иванов";
        String fullNameRu = lastNameRu + firstNameRu + middleNameRu;
        fullNameRu = fullNameRu.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullNameRu + ".");
    }
}