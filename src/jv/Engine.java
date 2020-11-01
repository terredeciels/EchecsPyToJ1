package jv;

import java.util.ArrayList;

public class Engine {

    void legalmoves(Board b) {

        //  "Show legal moves for side to move"

        ArrayList<Move> mList = b.gen_moves_list("", false);

        int cpt = 1;
        for (Move m : mList) {
            if (!b.domove(m.pos1, m.pos2, m.s)) continue;
            System.out.println("move #" + cpt + ":" + b.caseInt2Str(m.pos1) + b.caseInt2Str(m.pos2) + m.s);
            b.undomove();
            cpt += 1;
        }
    }
}
