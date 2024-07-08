import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livros = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro livro : livrosList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livros.add(livro);
                }
            }
        }
        return livros;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livros = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro livro : livrosList){
                if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal){
                    livros.add(livro);
                }
            }
        }
        return livros;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livro = null;
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livro = l;
                    break;
                }
            }
        }
        return livro;
    }
}
