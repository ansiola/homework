package homework6Task1;

public class Dentist extends Doctor{
    public Dentist(String name) {
        super(name, "Дантист");
    }

    @Override
    public void treat() {
        System.out.println("Дантист " + name + " вырывает и сверлит зубы!");
        System.out.println("➜ Проведено стоматологическое лечение.");
    }
}

