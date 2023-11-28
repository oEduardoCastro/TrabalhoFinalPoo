package Biblioteca;
public class CadastroDeLivros{
        private int ISBN;
        private String nome;
        private String autor;
        private String editora;
        private int anoPublicado;

        public CadastroDeLivros(int ISBN, String nome, String autor, String editora, int anoPublicado){
            this.ISBN = ISBN;
            this.nome = nome;
            this.autor = autor;
            this.editora = editora;
            this.anoPublicado = anoPublicado;
        }
        
        public int getISBN(){
            return ISBN;
        }

        public void setISBN(int ISBN){
            this.ISBN = ISBN;
        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getAutor(){
            return autor;
        }

        public void setAutor(String autor){
            this.autor = autor;
        }

        public String getEditora(){
            return editora;
        }

        public void setEditora(String editora){
            this.editora = editora;
        }

        public int getAnoPublicado(){
            return anoPublicado;
        }

        public void setAnoPublicado(int anoPublicado){
            this.anoPublicado = anoPublicado;
        }

        


    }

    


