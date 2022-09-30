public class WinterreifenpflichtDemo {

    public static void main(String[] args) {

        System.out.println(PrintWintereifenwahl());
    }

    public static boolean IsWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn) {

        if ((temperatur <10 && rutschigeFahrbahn) || (temperatur <4))
            return true;

        else return false;
    };

    public static String PrintWintereifenwahl() {

        if (IsWinterreifenPflicht(12, true))
            return "Bitte verwenden";
            else return "Keine Winterreifenpflicht";

    };
}
