package com.github.curriculeon;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] matrix;
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
        int countDia1 =0;
        int countDia2 = 0;


        for(int i=0; i<matrix.length; i++){
            int counter = 2;

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

                if(matrix[j][j].equals('X')){
                    countDia1++;
                    if(countDia1==3){
                        return true;
                    }
                }

                if(matrix[counter][j].equals('X')){
                    countDia2++;
                    System.out.println(matrix[counter][j]);
                    if(countDia2==3){
                        return true;
                    }
                }
                counter--;

            }
            countDia = 0;
            countHor=0;
            countDia1=0;
            countDia2=0;


        }


        return results;
    }

    public Boolean isInFavorOfO() {
        boolean results  =false;
        int countRow = 0;
        int countCol = 0;
        int countDia1 = 0;
        int countDia2 = 0;
        int counter = 2;

        for(int i=0; i<matrix.length; i++) {


            for (int j = 0; j < matrix.length; j++) {
                // checking rows
                if (matrix[i][j].equals('O')) {
                    countRow++;
                    if (countRow == 3) {
                        return true;
                    }
                }
                // checking columns
                if (matrix[j][i].equals('O')) {
                    countCol++;
                    if (countCol == 3) {
                        return true;
                    }
                }

                // checking diagnal 1
                if(matrix[j][j].equals('O')){
                    countDia1++;
                    if(countDia1==3){
                        return true;
                    }
                }
                // checking diag 2
                if(matrix[j][counter].equals('O')){
                    System.out.println("counter: " + counter + " J: " + j);
                    countDia2++;
                    if(countDia2==3){
                        return true;
                    }
                }

            }
            countRow = 0;
            countCol = 0;
            countDia1 = 0;
            countDia2 = 0;
            counter--;

        }
        return results;
    }

    public Boolean isTie() {
        if(isInFavorOfO()==false && isInFavorOfX()==false){
            return true;
        }
        return false;
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
