package homework1;

public class h5_Devision
{
    public static void main(String[] args) {
        int q = 23;
        int w = 5;

        int result = q / w;      // целая часть от деления
        int remainder = q % w;    // остаток от деления

        System.out.println(q + " / " + w + " = " + result + " и " + remainder + " в остатке");
    }
}
