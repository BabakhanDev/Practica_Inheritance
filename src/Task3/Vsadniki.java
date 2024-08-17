package Task3;

public class Vsadniki extends Spartansy {
    String horseName;  // Имя лошади
    int speed;         // Скорость лошади

    // Конструктор
    public Vsadniki (String name, int count, String horseName, int speed) {
        super(name, count);
        this.horseName = horseName;
        this.speed = speed;
    }

    // Метод атаки
    public void charge() {
        System.out.println(name + " атакует на лошади " + horseName);
    }

    // Метод отступления
    public void retreat() {
        System.out.println(name + " отступает со скоростью " + speed);}

    @Override
    public String toString() {
        return "Vsadniki{" +
                "horseName='" + horseName + '\'' +
                ", speed=" + speed +
                '}';
    }
}
