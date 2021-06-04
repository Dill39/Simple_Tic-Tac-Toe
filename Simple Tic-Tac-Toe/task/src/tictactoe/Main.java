package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int counter = 0;
        boolean oWin = false;
        boolean xWin = false;
        char[][] symbols = new char[3][3];
        for (char[] symbol : symbols) {
            Arrays.fill(symbol, ' ');
        }


        System.out.println("---------");
        System.out.println("| " + symbols[0][0] + " " + symbols[0][1] + " " + symbols[0][2] + " |");
        System.out.println("| " + symbols[1][0] + " " + symbols[1][1] + " " + symbols[1][2] + " |");
        System.out.println("| " + symbols[2][0] + " " + symbols[2][1] + " " + symbols[2][2] + " |");
        System.out.println("---------");

        while (true) {
            System.out.println("Enter the coordinates: ");
            int cord1;
            int cord2;
            try {
                cord1 = kb.nextInt();
                cord2 = kb.nextInt();
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (cord1 <= 0 || cord1 > 3 || cord2 <= 0 || cord2 > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (symbols[cord1 - 1][cord2 - 1] == 'X' || symbols[cord1 - 1][cord2 - 1] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                cord1 -= 1;
                cord2 -= 1;
                if (counter % 2 == 0) {
                    symbols[cord1][cord2] = 'X';
                } else {
                    symbols[cord1][cord2] = 'O';
                }
                counter++;
                System.out.println("---------");
                System.out.println("| " + symbols[0][0] + " " + symbols[0][1] + " " + symbols[0][2] + " |");
                System.out.println("| " + symbols[1][0] + " " + symbols[1][1] + " " + symbols[1][2] + " |");
                System.out.println("| " + symbols[2][0] + " " + symbols[2][1] + " " + symbols[2][2] + " |");
                System.out.println("---------");

                if (symbols[0][0] == symbols[0][1] && symbols[0][1] == symbols[0][2] && symbols[0][0] != ' ') {
                    if (symbols[0][0] == 'X') {
                        xWin = true;
                    } else {
                        oWin = true;
                    }
                    break;
                }
                if (symbols[1][0] == symbols[1][1] && symbols[1][1] == symbols[1][2] && symbols[1][0] != ' ') {
                    if (symbols[1][0] == 'X') {
                        xWin = true;
                    } else {
                        oWin = true;
                    }
                    break;
                }
                if (symbols[2][0] == symbols[2][1] && symbols[2][1] == symbols[2][2] && symbols[2][0] != ' ') {
                    if (symbols[2][0] == 'X') {
                        xWin = true;
                    } else {
                        oWin = true;
                    }
                    break;
                }
                if (symbols[0][0] == symbols[1][0] && symbols[1][0] == symbols[2][0] && symbols[0][0] != ' ') {
                    if (symbols[0][0] == 'X') {
                        xWin = true;
                    } else {
                        oWin = true;
                    }
                    break;
                }
                if (symbols[0][1] == symbols[1][1] && symbols[1][1] == symbols[2][1] && symbols[0][1] != ' ') {
                    if (symbols[0][1] == 'X') {
                        xWin = true;
                    } else {
                        oWin = true;
                    }
                    break;
                }
                if (symbols[0][2] == symbols[1][2] && symbols[1][2] == symbols[2][2] && symbols[0][2] != ' ') {
                    if (symbols[0][2] == 'X') {
                        xWin = true;
                    } else {
                        oWin = true;
                    }
                    break;
                }
                if (symbols[0][0] == symbols[1][1] && symbols[1][1] == symbols[2][2] && symbols[0][0] != ' ') {
                    if (symbols[0][0] == 'X') {
                        xWin = true;
                    } else {
                        oWin = true;
                    }
                    break;
                }
                if (symbols[2][0] == symbols[1][1] && symbols[1][1] == symbols[0][2] && symbols[2][0] != ' ') {
                    if (symbols[2][0] == 'X') {
                        xWin = true;
                    } else {
                        oWin = true;
                    }
                    break;
                }
            }
        }
        if (xWin) {
            System.out.println("X wins");
        } else if (oWin) {
            System.out.println("O wins");
        } else if (!xWin && !oWin) {
            System.out.println("Draw");
        }
    }
}



