import java.util.Random;
import java.util.Scanner;


public class Game {
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
        String castle = "\uD83C\uDFF0";
        int castleY = 1;
        Random random = new Random();
        int castleX = 1 + random.nextInt(sizeBoard);

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

        switch (answer) {
            case "ДА":
                // …

                System.out.println("Начинаем играть");
                System.out.println("Выбери сложность игры(от 1 до 5):");
                int difficultGame = scanner.nextInt();
                System.out.println("Выбранная сложность:\t" + difficultGame);

                while ((personLive > 0) && !(castleX == personX && castleY == personY)) {
                    System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;");
                    System.out.println("Координаты персонажа - (x: " + personX + ", y: " + personY + "))");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    if (x != personX && y != personY) {
                        System.out.println("Неккоректный ход");
                    } else if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {
                        personX = x;
                        personY = y;
                        step += 1;
                        System.out.println("Ход корректный; Новые координаты: " +
                                personX + ", " + personY + "\nХод номер: " + step);
                    } else {
                        System.out.println("Координаты не изменены");
                    }
                }
                break;
            case "НЕТ":
                System.out.println("Жаль, приходи еще!");
                break;
            default:
                System.out.println("Данные введены некорректно");
        }

    }
}
