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
        String leftBlock = " | ";
        String rightBlock = " |";
        String wall = " + —— + —— + —— + —— + —— + ";
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

//                    String[] board = new String[sizeBoard * sizeBoard];
                String[][] board = new String[sizeBoard][sizeBoard];
                while ((personLive > 0) && !(castleX == personX && castleY == personY)) {


                    for (int y = 1; y <= sizeBoard; y++) {
                        System.out.println(wall);
                        for (int x = 1; x <= sizeBoard; x++) {
                            System.out.print(leftBlock);
                            if (personY == y && personX == x) {
                                System.out.print(person);
                            } else if (castleX == x && castleY == y) {
                                System.out.print(castle);
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println(rightBlock);
                    }
                    System.out.println(wall);
                    for (int y = 1; y <= sizeBoard; y++) {
                        for (int x = 1; x <= sizeBoard; x++) {
                            board[y - 1][x - 1] = " ";
                        }
                    }
                    int count_monster = sizeBoard * sizeBoard - sizeBoard - 1;
                    for (int i = 0; i <= count_monster; i++) {
                        board[random.nextInt(sizeBoard - 1)][random.nextInt(sizeBoard)] = monster;
                    }
                    board[(castleY - 1)][+castleX - 1] = castle;
                    board[(personY - 1)][+personX - 1] = person;


                    System.out.println(wall);
                    System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;");
                    System.out.println("Координаты персонажа - (x: " + personX + ", y: " + personY + "))");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    if (x != personX && y != personY) {
                        System.out.println("Неккоректный ход");
                    } else if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {

                        if (board[(personY - 1)][+personX - 1].equals("  ")) {
                            board[(personY - 1)][+personX - 1] = "  ";
                            personX = x;
                            personY = y;
                            step++;
                            System.out.println("Ход корректный; Новые координаты: " + personX + ", " + personY + "\nХод номер: " + step);
                        } else if (board[(personY - 1)][+personX - 1].equals(castle)) {
                            System.out.println("Вы прошли игру");
                            break;
                        } else {
                            Random r = new Random();
                            int a = r.nextInt(100);
                            int b = r.nextInt(100);
                            int trueAnswer = x + y;
                            System.out.println("Реши пример: " + a + " + " + b + " = ?");
                            Scanner sc = new Scanner(System.in);
                            int ans = sc.nextInt();
                            if (trueAnswer == ans) {
                                System.out.println("Верно! Ты победил монстра");
                                System.out.println("Ты проиграл эту битву!");
                                ;
                            }
                        }
                    } else {
                        System.out.println("Координаты не изменены");
                    }
                }

                System.out.println("Закончились жизни. Итог: ...");

                break;
            case "НЕТ":
                System.out.println("Жаль, приходи еще!");
                break;
            default:
                System.out.println("Данные введены некорректно");


        }


    }
}
