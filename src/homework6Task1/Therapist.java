package homework6Task1;

public class Therapist extends Doctor {

    public Therapist(String name) {
        super(name, "Терапевт");
    }

    @Override
    public void treat() {
        System.out.println("Терапевт " + name + " проводит осмотр и выписывает лекарства!");
        System.out.println("➜ Проведена терапия, назначены препараты.");
    }

    // Метод для назначения врача согласно плану лечения
    public void assignDoctor (Patient patient) {
        System.out.println("--- Терапевт " + name + " анализирует план лечения пациента " + patient.name + " ---");
        int plan = patient.treatmentPlan;
        if (plan == 1) {
            System.out.println("План лечения (код 1): требуется хирург.");
            patient.doctor = new Surgeon("Анастасия Витальевна");
            System.out.println("Пациенту " + patient.name + " назначен хирург Анастасия Витальевна");
            patient.doctor.treat(patient.name);
        } else if (plan == 2) {
            System.out.println("План лечения (код 2): требуется дантист.");
            patient.doctor = new Dentist("Дмитрий Николаевич");
            System.out.println("Пациенту " + patient.name + " назначен дантист Дмитрий Николаевич");
            patient.doctor.treat(patient.name);
        } else {
            System.out.println("План лечения (код " + plan + "): направляем к терапевту.");
            patient.doctor = this;
            System.out.println("Пациенту " + patient.name + " назначен терапевт " + name);
            patient.doctor.treat(patient.name);
        }
}
}

