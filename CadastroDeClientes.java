package Biblioteca;
public class CadastroDeClientes {
    private int matricula, telefone;
    private String nome;    

        public CadastroDeClientes(int matricula, int telefone, String nome){
            this.matricula = matricula;
            this.telefone = telefone;
            this.nome = nome;
        }

        public int getMatricula(){
            return matricula;
        }

        public void setMatricula(int matricula){
            this.matricula = matricula;
        }

        public int getTelefone(){
            return telefone;
        }

        public void setTelefone(int telefone){
            this.telefone = telefone;
        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }
}
