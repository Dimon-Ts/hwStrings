public class Main {
    public static void main(String[] args) {
        // Строки.Домашнее задание.
        System.out.println("Строки.Домашнее задание.");
        // Задание 1.
        System.out.println("Задание 1.");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + lastName + " " + firstName + " " + middleName + ".");
        // Задание 2.
        System.out.println("Задание 2.");
        String fullNameBig = fullName.toUpperCase();
        String firstNameBig = firstName.toUpperCase();
        String middleNameBig = middleName.toUpperCase();
        String lastNameBig = lastName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + lastNameBig + " " + firstNameBig + " " + middleNameBig +  ".");
        // Задание 3.
        System.out.println("Задание 3.");
        String firstNameRu = "Семён";
        firstNameRu = firstNameRu.replace("ё", "е");

        String middleNameRu = "Семёнович";
        middleNameRu = middleNameRu.replace("ё", "е");

        String lastNameRu = "Иванов";
        lastNameRu = lastNameRu.replace("ё", "е");

        String fullNameRu = lastNameRu + firstNameRu + middleNameRu;
        fullNameRu = fullNameRu.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника - " + lastNameRu + " " + firstNameRu + " " + middleNameRu + ".");
    }
}