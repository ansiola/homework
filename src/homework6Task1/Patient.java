package homework6Task1;

public class Patient {
    String name;
    int treatmentPlan;
    Doctor doctor;

    public Patient(String name, int treatmentPlan) {
        this.name = name;
        // Валидируем данные
        if (treatmentPlan >= 1 && treatmentPlan <= 3) {
            this.treatmentPlan = treatmentPlan;
        } else {
            System.out.println("Неверный код плана лечения для пациента " + name + "! Установлен код по умолчанию (3 - терапевт)");
            this.treatmentPlan = 3;
        }
        this.doctor = null;
    }

    // Метод для отображения информации о пациенте
    public void displayInfo() {
        System.out.println("=== Информация о пациенте ===");
        System.out.println("Имя: " + name);
        System.out.println("План лечения (код): " + treatmentPlan);
        if (doctor != null) {
            System.out.println("Назначенный врач: " + doctor.specialization + " " + doctor.name);
        } else {
            System.out.println("Врач еще не назначен");
        }

    }
}
