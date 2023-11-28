package Biblioteca;
public class Relatorios {
    private int livroDisponivel;
    private int livrosMaisRetirados;
    private String clientesMaisRetiraram;
    private String clientesMaisAtrasaram;

    public Relatorios(int livroDisponivel, int livrosMaisRetirados, String clientesMaisRetiraram, String clientesMaisAtrasados){
        this.livroDisponivel = livroDisponivel;
        this.livrosMaisRetirados = livrosMaisRetirados;
        this.clientesMaisRetiraram = clientesMaisRetiraram;
        this.clientesMaisAtrasaram = clientesMaisAtrasaram;
    }

    public int getLivroDisponivel(){
        return livroDisponivel;
    }

    public void setLivroDisponivel(int livroDisponivel){
        this.livroDisponivel = livroDisponivel;
    }

    public int livrosMaisRetirados(){
        return livrosMaisRetirados;
    }

    public void setLivrosMaisRetirados(int livrosMaisRetirados){
        this.livrosMaisRetirados = livrosMaisRetirados;
    }

    public String getClientesMaisRetiraram(){
        return clientesMaisRetiraram;
    }

    public void setClientesMaisRetiraram(String clientesMaisRetiraram){
        this.clientesMaisRetiraram = clientesMaisRetiraram;
    }

    public String getClientesMaisAtrasaram(){
        return clientesMaisAtrasaram;
    }

    public void setClientesMaisAtrasaram(String clienteMaisAtrasaram){
        this.clientesMaisAtrasaram = clienteMaisAtrasaram;
    }
    
}
