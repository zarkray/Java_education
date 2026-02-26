import java.util.Scanner;

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
        String begin = "|    | |";
        String end = " |    |";
        String full = begin + monster + end; // |    | Мм |    |
        System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("введи кол-во жизней");
        personLive = scanner.nextInt();
        System.out.println("Количество жизней: " + personLive);
        System.out.println("Количество жизней: " + personLive + " " + person);
        System.out.println("Ваш ответ:\t" + answer);

        if (answer.equals("ДА")) {

        } else {

        }







        }
}
