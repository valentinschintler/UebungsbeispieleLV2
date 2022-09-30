public class NotenDemo {

    public static void main(String[] args) {
        System.out.println("Die Note lautet:" + " " + getNotentext(50));
    }

    public static String getNotentext(int punkte) {

        if (punkte >= 90)
            return "Sehr gut";
        if (punkte <= 89 && punkte >= 78)
            return "Gut";
        if (punkte <= 77 && punkte >= 65)
            return "Befriedigend";
        if (punkte <= 64 && punkte >= 51)
            return "Genügend";
        if (punkte <= 50)
            return "Ungenügend";

        return null;
    };

};
