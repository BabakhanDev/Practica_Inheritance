package Task3;

public class Filosofy extends Spartansy{
    String philosophy;    // Философия
    int wisdomLevel;      // Уровень мудрости

    // Конструктор
    public Filosofy (String name, int count, String philosophy, int wisdomLevel) {
        super(name, count);
        this.philosophy = philosophy;
        this.wisdomLevel = wisdomLevel;
    }

    // Метод размышлений
    public void think() {
        System.out.println(name + " размышляет о " + philosophy);
    }

    // Метод обучения
    public void teach() {
        System.out.println(name + " обучает с уровнем мудрости " + wisdomLevel);
    }

    @Override
    public String toString() {
        return "Filosofy{" +
                "philosophy='" + philosophy + '\'' +
                ", wisdomLevel=" + wisdomLevel +
                '}';
    }
}
