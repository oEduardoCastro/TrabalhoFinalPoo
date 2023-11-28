package Biblioteca;
public class DevolucaoDeLivros {
    private boolean livroAtraso;
    private int numDiasAtrasado;
    private boolean livroDisponivel;

    public DevolucaoDeLivros(boolean livroAtraso, int numDiasAtrasado, boolean livroDisponivel){
        this.livroAtraso = livroAtraso;
        this.numDiasAtrasado = numDiasAtrasado;
        this.livroDisponivel = livroDisponivel;
    }

    public boolean getLivroAtraso(){
        if(livroAtraso){
            livroAtraso = true;
        }else{
            livroAtraso = false;
        }
        return livroAtraso;
    }

    public void setLivroAtraso(boolean livroAtraso){
        this.livroAtraso = livroAtraso;
    }

    public int getNumDiasAtrasado(){
        return numDiasAtrasado;
    }

    public void setNumDiasAtrasado(int numDiasAtrasado){
        this.numDiasAtrasado = numDiasAtrasado;
    }

    public boolean getLivroDisponivel(){
        if(livroDisponivel){
            livroDisponivel = true;
        }else{
            livroDisponivel = false;
        }
        return livroDisponivel;
    }

    public void setLivroDisponivel(boolean livroDisponivel){
        this.livroDisponivel = livroDisponivel;
    }

    public static void main(String[] args) {
        DevolucaoDeLivros  = new DevolucaoDeLivros(false, 0, true);
    }
}