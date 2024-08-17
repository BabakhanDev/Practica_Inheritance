package Task3;

public class Spartansy {
    protected String name;
    protected int count;

    public Spartansy(String name, int count) {
        this.name = name;
        this.count = count;
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Количество: " + count);
    }

    // Метод для сравнения и сортировки двух объектов по количеству
    public static void compareAndDisplay(Spartansy s1, Spartansy s2) {
        if (s1.count > s2.count) {
            s1.displayInfo();
            s2.displayInfo();
        } else {
            s2.displayInfo();
            s1.displayInfo();
        }
    }
        @Override
        public String toString () {
            return "Spartansy{" +
                    "name='" + name + '\'' +
                    ", count='" + count + '\'' +
                    '}';
        }
    }
