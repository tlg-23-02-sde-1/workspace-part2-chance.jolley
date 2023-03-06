package com.duckrace;

class BoardTest {
    public static void main(String[] args) {
        Board board = new Board();
       // board.dumpStudentIdMap();
        System.out.println();

        board.update(2, Reward.PRIZES);
        board.update(2, Reward.DEBIT_CARD);
        board.update(1, Reward.DEBIT_CARD);
        board.update(9, Reward.PRIZES);
        board.update(9, Reward.PRIZES);

        board.show();
    }
}