package lecture02.Additional_materials.Ex004;

public class Program {
    public static void main(String[] args) {
        // Иерархия вызова конструкторов
        System.out.println("\nDwarf dw1 = new Dwarf()");
        Dwarf dw1 = new Dwarf();
        System.out.println();

        System.out.println("\nDruid dw2 = new Dwarf();");
        Druid dw2 = new Dwarf();

        System.out.println("\nBaseHero dw3 = new Dwarf();");
        BaseHero dw3 = new Dwarf();
    }    
}