package homework6Task1;

public class Clinic {

    public static void main(String[] args) {
        System.out.println("=== СИМУЛЯЦИЯ РАБОТЫ КЛИНИКИ ===");

        Therapist therapist = new Therapist("Антон Дмитриевич");

        // Создаем пациентов с разными планами лечения
        Patient patient1 = new Patient("Зина Корзина", 1);
        Patient patient2 = new Patient("Лена Полено", 2);
        Patient patient3 = new Patient("Онотоле Вассерман", 3);
        Patient patient4 = new Patient("Ванька Встанька", 6);

        // Назначаем врачей и лечим пациентов
        System.out.println("Пациент 1 (план лечения: код 1):");
        therapist.assignDoctor(patient1);
        System.out.println();

        System.out.println("Пациент 2 (план лечения: код 2):");
        therapist.assignDoctor(patient2);
        System.out.println();

        System.out.println("Пациент 3 (план лечения: код 3):");
        therapist.assignDoctor(patient3);
        System.out.println();

        System.out.println("Пациент 4 (план лечения: код 6):");
        therapist.assignDoctor(patient4);
        System.out.println();

        // Дополнительно: выводим информацию о пациентах
        patient1.displayInfo();
        patient2.displayInfo();
        patient3.displayInfo();
        patient4.displayInfo();
    }

}


