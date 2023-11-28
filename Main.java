package Biblioteca;

public class Main {
    public static void main(String[] args) {
        CadastroDeClientes cliente1 = new CadastroDeClientes(1, 997396759, "Rodolfo");
        CadastroDeClientes cliente2 = new CadastroDeClientes(2, 995350991, "Jhon");
        CadastroDeClientes cliente3 = new CadastroDeClientes(3, 991574893, "Arthur");

        System.out.println("Clientes: ");
        System.out.println("Matricula: " + cliente1.getMatricula() + "   " + "Telefone: " + cliente1.getTelefone() + "   " + "Nome: " + cliente1.getNome());
        System.out.println("Matricula: " + cliente2.getMatricula() + "   " + "Telefone: " + cliente2.getTelefone() + "   " + "Nome: " + cliente2.getNome());
        System.out.println("Matricula: " + cliente3.getMatricula() + "   " + "Telefone: " + cliente3.getTelefone() + "   " + "Nome: " + cliente3.getNome());


        CadastroDeLivros livro1 = new CadastroDeLivros(12345678, "Ceu Estrelado", "Pedro Gonçalves", "Supernova", 2023);
        CadastroDeLivros livro2 = new CadastroDeLivros(12123434, "Alma Curada", "Bruno Prudencio", "HASH", 2017);
        CadastroDeLivros livro3 = new CadastroDeLivros(12312345, "A Arte De Fugir", "Eduardo Catro", "30PRAUM", 2022);
        CadastroDeLivros livro4 = new CadastroDeLivros(12332145, "Corra, A Vida É Uma Festa", "Jhon Jonnes", "NECKLES", 2020);
        CadastroDeLivros livro5 = new CadastroDeLivros(28573933, "A Vida É Boa", "Thiago Vento", "Nagalli", 2018);

        System.out.println("\n");

        System.out.println("Livros: ");
        System.out.println("ISBN: " + livro1.getISBN() + "   " + "Nome: " + livro1.getNome() + "   " + "Autor: " + livro1.getAutor() + "   " + "Editora: " + livro1.getEditora() + "   " + "Ano Publicado: " + livro1.getAnoPublicado());
        System.out.println("ISBN: " + livro2.getISBN() + "   " + "Nome: " + livro2.getNome() + "   " + "Autor: " + livro2.getAutor() + "   " + "Editora: " + livro2.getEditora() + "   " + "Ano Publicado: " + livro2.getAnoPublicado());
        System.out.println("ISBN: " + livro3.getISBN() + "   " + "Nome: " + livro3.getNome() + "   " + "Autor: " + livro3.getAutor() + "   " + "Editora: " + livro3.getEditora() + "   " + "Ano Publicado: " + livro3.getAnoPublicado());
        System.out.println("ISBN: " + livro4.getISBN() + "   " + "Nome: " + livro4.getNome() + "   " + "Autor: " + livro4.getAutor() + "   " + "Editora: " + livro4.getEditora() + "   " + "Ano Publicado: " + livro4.getAnoPublicado());
        System.out.println("ISBN: " + livro5.getISBN() + "   " + "Nome: " + livro5.getNome() + "   " + "Autor: " + livro5.getAutor() + "   " + "Editora: " + livro5.getEditora() + "   " + "Ano Publicado: " + livro5.getAnoPublicado());



        
    }
}
