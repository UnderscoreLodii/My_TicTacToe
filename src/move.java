import java.util.Scanner;

public class move {
    public static Scanner mv = new Scanner(System.in);

    public static boolean oTurn = true;

    public static char whosTurnChar = 'O';

    public static int areaChosen;

    public static void changeTurn(){
        if(whosTurnChar == 'O'){
            whosTurnChar = 'X';
        }
        else{
            whosTurnChar = 'O';
        }
    }
    public static void chooseArea(){
        while(true){
            areaChosen = mv.nextInt();
            if(areaChosen>=1&&areaChosen<=9){
                if(Main.brd[areaChosen-1]!='X'&&Main.brd[areaChosen-1]!='O'){
                    Main.brd[areaChosen-1] = whosTurnChar;
                    break;
                }
            }
            System.out.println("Wrong input, try again");
        }
    }
    public static void makeMove(){
        System.out.printf("%c's move:\n", whosTurnChar);
        chooseArea();
        changeTurn();
    }
}
