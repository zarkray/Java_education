public class game {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int step = 0;
        int personX;
        int personY;
        int personLive = 3;
        int sizeBoard = 5;
        personX = 1 + sizeBoard / 2;
        personY = 1 + sizeBoard / 2;
       step += 1;
        step -= 10; // эквивалентно: step = step - 10
        step *= 5; // эквивалентно: step = step * 5
        step /= 2; // эквивалентно: step = step / 2
        String person = "Г";
        String monster = "Мм";
        String gamingField = "+ —— + —— + —— +\n"
        + "|    |    |    |\n"
        + "+ —— + —— + —— +\n"
        + "|    | " + monster + " |    |\n"
        + "+ —— + —— + —— +\n"
        + "| " + person + " |    |    |\n"
        + "+ —— + —— + —— +";
        System.out.println(gamingField);


    }
}
