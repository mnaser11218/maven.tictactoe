package com.github.curriculeon;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] matrix = new Character[][]{};
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

//       this.board = new Board(new Character[][]{
//        {'X', 'X', 'O'},
//        {'O', 'X', 'X'},
//        {'X', 'O', 'O'}
//    })

    public Boolean isInFavorOfX() {
        boolean results  =false;
        int countDia = 0;
        int countHor = 0;

        for(int i=0; i<matrix.length; i++){

            for(int j =0; j< matrix.length; j++){
                if(matrix[i][j].equals('X')){
                    countDia++;
                    if(countDia == 3){
                        return true;
                    }
                } if(matrix[j][i].equals('X')){
                    countHor++;
                    if(countHor == 3){
                        return true;
                    }
                }

            }
            countDia = 0;
            countHor=0;


        }


        return results;
    }

    public Boolean isInFavorOfO() {
        boolean results  =false;
        int countDia = 0;
        int countHor = 0;

        for(int i=0; i<matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].equals('O')) {
                    countDia++;
                    if (countDia == 3) {
                        return true;
                    }
                }
                if (matrix[j][i].equals('O')) {
                    countHor++;
                    if (countHor == 3) {
                        return true;
                    }
                }

            }
            countDia = 0;
            countHor = 0;
        }
        return results;
    }

    public Boolean isTie() {
        return !isInFavorOfO() && !isInFavorOfX();
    }

    public String getWinner() {
        if(isInFavorOfX()){
            return "X";
        }else if(isInFavorOfO()){
            return "O";
        }else{
            return "";
        }
    }

}
