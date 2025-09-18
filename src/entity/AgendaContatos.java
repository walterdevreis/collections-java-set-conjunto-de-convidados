package entity;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> listaDeContatos;

    public AgendaContatos(){
        listaDeContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
       listaDeContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if (listaDeContatos.isEmpty() == true){
            throw new RuntimeException("A lista de contatos está vazia!");
        }
        else {
            for (Contato contatos : listaDeContatos){
                System.out.println(contatos);
            }
        }
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> buscarPorNome = new HashSet<>();
        if (listaDeContatos.isEmpty() == true){
            throw new RuntimeException("A lista de contatos está vazia!");
        }
        else {
            for (Contato contatos : listaDeContatos){
                if (contatos.getNome().equalsIgnoreCase(nome)){
                    buscarPorNome.add(contatos);
                }
            }
        }
        return buscarPorNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        if (listaDeContatos.isEmpty() == true){
            throw new RuntimeException("A lista de contatos está vazia!");
        }
        else {
            for (Contato contatos : listaDeContatos){
                if (contatos.getNome().equalsIgnoreCase(nome)){
                    contatos.setNumero(novoNumero);
                }
            }
        }
    }
}
