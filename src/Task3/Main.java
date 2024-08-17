package Task3;

public class Main {
    public static void main(String[] args) {
        // todo task3
        Luchniki luchniki = new Luchniki("Лучники",150,300,"Длинный лук");
        Rysari rysari = new Rysari("Рыцари", 100, "Стальная", "Широкий меч");
        Vsadniki vsadniki = new Vsadniki("Всадники", 200, "Тенегрив", 75);
        Filosofy filosofy = new Filosofy("Философы", 50, "Стоицизм", 95);


  Spartansy.compareAndDisplay(luchniki,rysari);
        System.out.println("..Методы..");
        luchniki.shoot();
        System.out.println("................................................");
  Spartansy.compareAndDisplay(rysari,vsadniki);
        System.out.println("..Методы..");
  rysari.attack();
  rysari.defend();
        System.out.println("................................................");
  Spartansy.compareAndDisplay(vsadniki,filosofy);
        System.out.println("..Методы..");
  vsadniki.charge();
  vsadniki.retreat();
        System.out.println("..Методы..");
        System.out.println("................................................");
filosofy.think();
filosofy.teach();
        System.out.println("................................................");



    }
}
