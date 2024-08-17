package Task3;

public class Rysari extends  Spartansy{
    String armorType;  // Тип брони
    String swordType;  // Тип меча

    public Rysari(String name, int count,String armorType, String swordType) {
        super(name, count);
        this.armorType = armorType;
        this.swordType = swordType;
    }
    // Метод атаки
    public void attack() {
        System.out.println(name + " атакует с " + swordType);}
    // Метод защиты
    public void defend() {
        System.out.println(name + " защищается с броней типа " + armorType);
    }

    @Override
    public String toString() {
        return "Rysari{" +
                "armorType='" + armorType + '\'' +
                ", swordType='" + swordType + '\'' +
                '}';
    }
}

