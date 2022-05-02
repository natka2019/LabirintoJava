import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class Labirinto {

    private int linha;
    private int coluna;
    private Deque<String> stack = new ArrayDeque<String>();
    private List<String> lastPositions = new ArrayList<>();
    private boolean fimLab;


    public String[][] criaLab() {
        String[][] tabLab = new String[11][11];

        for (int l = 0; l < tabLab.length; l++) {
            for (int c = 0; c < tabLab.length; c++) {
                tabLab[l][c] = "#";
            }
        }
        return criaLab(tabLab);
    }

    public String[][] criaLab(String[][] labirinto) {
    int c = 1;
    int l = 1;
    for (int i = 1; i < 10; i++){
        labirinto[i][1] = " ";
        labirinto[9][i] = " ";
        labirinto[i][9] = " ";
        labirinto[5][i] = " ";
        labirinto[7][i] = " ";
        labirinto[3][i] = " ";
        labirinto[1][i] = " ";
        labirinto[6][3] = " ";
        labirinto[2][7] = " ";
        labirinto[2][5] = " ";
        labirinto[4][5] = " ";
        labirinto[5][2] = "#";
        labirinto[7][2] = "#";
        labirinto[5][8] = "#";
        labirinto[3][3] = "#";
        labirinto[3][6] = "#";
        labirinto[1][2] = "#";
        labirinto[1][6] = "#";
        labirinto[1][8] = "#";
        }
    labirinto[l][c] = "E";
    labirinto[1][3] = "S";
    return labirinto;
    }

    public void vePilha() {
        System.out.println("Esta e a pilha: (linha, coluna)");
        System.out.println(getStack().toString());
        System.out.println("Fim da pilha");
    }

    public String[][] moverPosicao(String[][] labirinto) {

        for (int i = 0; i <= 3; i++) {
            int x = getLinha();
            int y = getColuna();
        }
    }
    }
}
