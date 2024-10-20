public class Main {
    public static char[] brd = {'1','2','3','4','5','6','7','8','9'};

    public static String board;

    public static void formatBoard(){
        board = String.format
                ("\n%c\t%c\t%c\n\n%c\t%c\t%c\n\n%c\t%c\t%c\n",
                        brd[0], brd[1], brd[2],brd[3],brd[4],brd[5],brd[6], brd[7],brd[8]);
        System.out.println(board);
    }

    public static void main(String[] args) {
        System.out.printf("Welcome to TicTacToe\nWhen moving, select wanted area:");
        formatBoard();
        for(int i=1;i<=9;i++){
            move.makeMove();
            formatBoard();
            win.checkWin();
            if(win.ifWin){
                win.res();
                break;
            }
        }
        if(!win.ifWin){
            System.out.println("It's a tie");
        }
    }
}