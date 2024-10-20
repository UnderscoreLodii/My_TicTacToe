public class win {
    public static boolean ifWin = false;

    public static int r;

    public static void checkRow(){
        for(int i=0;i<7;i=i+3) {
            if ((Main.brd[i] == Main.brd[i + 1]) && (Main.brd[i] == Main.brd[i + 2])) {
                ifWin=true;
            }
        }
    }

    public static void checkColumn(){
        for(int i=0;i<3;i++) {
            if ((Main.brd[i] == Main.brd[i + 3]) && (Main.brd[i] == Main.brd[i + 6])) {
                ifWin=true;
            }
        }
    }

    public static void checkDiagonal(){
        if ((Main.brd[0] == Main.brd[4]) && (Main.brd[0] == Main.brd[8])) {
            ifWin=true;
        }if ((Main.brd[2] == Main.brd[4]) && (Main.brd[2] == Main.brd[6])) {
            ifWin=true;
        }
    }

    public static void checkWin(){
        checkDiagonal();
        checkColumn();
        checkRow();
    }

    public static void res(){
        if(move.whosTurnChar=='O'){
            System.out.println("X's win!!!");
        }
        else if(move.whosTurnChar=='X'){
            System.out.println("O's win!!!");
        }
    }
}
