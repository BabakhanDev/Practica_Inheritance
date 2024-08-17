package Task3;

public class Luchniki extends Spartansy {
    private int luchnikcount; // Количество стрел
    private String tipLuka;      // Тип лука



    public Luchniki(String name, int count, int luchnikcount, String tipLuka) {
        super(name, count);
        this.luchnikcount = luchnikcount;
        this.tipLuka = tipLuka;
    }
    // Метод стрельбы
    public   void shoot() {
        System.out.println(name + " стреляет из " + tipLuka);
    }

    @Override
    public String toString() {
        return "Luchniki{" +
                "luchnikcount=" + luchnikcount +
                ", tipLuka='" + tipLuka + '\'' +
                '}';
    }
}


