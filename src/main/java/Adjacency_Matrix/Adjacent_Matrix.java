package Adjacency_Matrix;


public class Adjacent_Matrix {
    private boolean adjmatrix[][];
    private int vertices;

    public Adjacent_Matrix(int vertices){
        this.vertices = vertices;
        adjmatrix = new boolean[vertices][vertices];
    }

    public void addedge(int i, int j){
        adjmatrix[i][j] = true;
        adjmatrix[j][i] = true;
    }

    public void deleteedge(int i, int j){
        adjmatrix[i][j] = false;
        adjmatrix[j][i] = false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < vertices; i++){
            sb.append(i + " :  ");
            for (boolean j : adjmatrix[i]){
                sb.append((j ? 1 : 0) + "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Adjacent_Matrix am = new Adjacent_Matrix(4);

        am.addedge(0,1);
        am.addedge(0,2);
        am.addedge(1,2);
        am.addedge(2,0);


        System.out.print(am.toString());
    }

}
