package homework6Task1;

public class Doctor {
    protected  String name;
    protected String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        System.out.println("Назначен врач: " + specialization + " " + name);
    }

    //  метод treat (будет переопределен в наследниках)
    public void treat() {
        System.out.println("Доктор " + name + " " + specialization + " проводит общий осмотр.");
    }
    // Перегруженный метод treat (перегрузка методов)
    public void treat(String patientName) {
    System.out.println("Доктор " + name + " " + specialization + " начинает лечить пациента " + patientName);
}

}
