package Biblioteca;
public class RetiradaDeLivros {
    private int dataEntrega;
    private boolean livroDisponivel;
    private int maxLivros;

    public RetiradaDeLivros(int dataEntrega, boolean livroDisponivel, int maxLivros){
        this.dataEntrega = dataEntrega;
        this.livroDisponivel = livroDisponivel;
        this.maxLivros = maxLivros;
    }

    public int getDataEntrega(){
        return dataEntrega;
    }

    public void setDataEntrega(int dataEntrega){
        this.dataEntrega = dataEntrega;
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

    public int getMaxLivros(){
        return maxLivros;
    }

    public void setMaxLivros(int maxLivros){
        this.maxLivros = maxLivros;
    }

    
}
