package homework6Task1;

public class Surgeon extends Doctor{

    public Surgeon(String name) {
        super(name, "Хирург");
    }
    // Переопределение метода treat(лечения)
    @Override
    public void treat() {
        System.out.println("Хирург " + name + " проводит операцию!");
        System.out.println("➜ Выполнено хирургическое вмешательство, до свидания почка!");
    }

}
