public class Main {
    public static void main(String[] args)
    {
        System.out.println("Tarih: 27 Mart 2023\n");
        // İki String değer için temel matematik işlemleri yapılacak. (Double ve Integer)

        String numberIntOne = "100";
        String numberIntTwo = "20";

        String numberOneDouble = "3.9";
        String numberTwoDouble = "1.4";

        System.out.println("------ Integer ile Dört İşlem ------");
        System.out.println("Toplam: " + toIntegerAddition(numberIntOne, numberIntTwo));
        System.out.println("Çıkartma: " + toIntegerSubtraction(numberIntOne, numberIntTwo));
        System.out.println("Çarpma: " + toIntegerMultiplication(numberIntOne, numberIntTwo));
        System.out.println("Bölme: " + toIntegerDivision(numberIntOne, numberIntTwo));

        System.out.println("\n------ Double ile Dört İşlem ------");
        System.out.println("Toplam: " + toDoubleAddition(numberOneDouble, numberTwoDouble));
        System.out.println("Çıkartma: " + toDoubleSubtraction(numberOneDouble, numberTwoDouble));
        System.out.println("Çarpma: " + toDoubleMultiplication(numberOneDouble, numberTwoDouble));
        System.out.println("Bölme: " + toDoubleDivision(numberOneDouble, numberTwoDouble));

    }

    // toInteger Methods
    public static int toIntegerAddition(String string1, String string2)
    {
        // Variables to Integer
        int number1 = Integer.parseInt(string1);
        int number2 = Integer.parseInt(string2);

        // Return sum
        return number1 + number2;
    }

    public static int toIntegerSubtraction(String string1, String string2)
    {
        // Variables to Integer
        int number1 = Integer.parseInt(string1);
        int number2 = Integer.parseInt(string2);

        // Return sum
        return number1 - number2;
    }

    public static int toIntegerMultiplication(String string1, String string2)
    {
        // Variables to Integer
        int number1 = Integer.parseInt(string1);
        int number2 = Integer.parseInt(string2);

        // Return sum
        return number1 * number2;
    }

    public static int toIntegerDivision(String string1, String string2)
    {
        // Variables to Integer
        int number1 = Integer.parseInt(string1);
        int number2 = Integer.parseInt(string2);

        // Return sum
        return number1 / number2;
    }


    // toDouble Methods
    public static double toDoubleAddition(String string1, String string2)
    {
        // Variables to Double
        double number1 = Double.parseDouble(string1);
        double number2 = Double.parseDouble(string2);

        return number1 + number2;
    }

    public static double toDoubleSubtraction(String string1, String string2)
    {
        // Variables to Double
        double number1 = Double.parseDouble(string1);
        double number2 = Double.parseDouble(string2);

        // Return sum
        return number1 - number2;
    }

    public static double toDoubleMultiplication(String string1, String string2)
    {
        // Variables to Double
        double number1 = Double.parseDouble(string1);
        double number2 = Double.parseDouble(string2);

        // Return sum
        return number1 * number2;
    }

    public static double toDoubleDivision(String string1, String string2)
    {
        // Variables to Double
        double number1 = Double.parseDouble(string1);
        double number2 = Double.parseDouble(string2);

        // Return sum
        return number1 / number2;
    }

}