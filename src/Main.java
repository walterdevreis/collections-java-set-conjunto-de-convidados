import entity.AgendaContatos;
import entity.Contato;

import java.util.Set;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pedro", 1111111111);
        agendaContatos.adicionarContato("Wanessa", 2222222);
        agendaContatos.adicionarContato("Felipe", 33333333);
        agendaContatos.adicionarContato("Wanessa", 444444444);

        System.out.println();

        System.out.println("Exibe a lista de contatos: ");
        agendaContatos.exibirContatos();

        System.out.println();

        System.out.println("Pesquisa contatos pelo nome: ");
        Set<Contato> listAContato = agendaContatos.pesquisaPorNome("Wanessa");
        for (Contato contato : listAContato){
            System.out.println(contato);
        }

        System.out.println();

        System.out.println("Atualiza o número de telefone de um contato específico: ");
        agendaContatos.atualizarNumeroContato("Pedro", 555555555);

        System.out.println();

        System.out.println("Exibindo a lista de contatos atualizada: ");
        agendaContatos.exibirContatos();
    }


}