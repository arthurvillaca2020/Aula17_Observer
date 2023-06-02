import org.example.GrupoDeFIlmes;
import org.example.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class teste {
    @Test
    void deveNotificarUmaPessoa() {
        GrupoDeFIlmes grupo = new GrupoDeFIlmes("Grupo sexta-feira 13", "Terror");
        Pessoa pessoa = new Pessoa("Arthur");
        pessoa.adicionar(grupo);
        grupo.lancarFilme();
        assertEquals("Arthur, notificação de filme novo no Grupo {Nome do grupo = Grupo sexta-feira 13, Genero = Terror}", pessoa.getUltimaNotificacao());
    }
    @Test
    void deveNotificarPessoas() {
        GrupoDeFIlmes grupo = new GrupoDeFIlmes("Grupo vingadores", "Herois");
        Pessoa pessoa1 = new Pessoa("Breno");
        Pessoa pessoa2 = new Pessoa("Caio");
        pessoa1.adicionar(grupo);
        pessoa2.adicionar(grupo);
        grupo.lancarFilme();
        assertEquals("Breno, notificação de filme novo no Grupo {Nome do grupo = Grupo vingadores, Genero = Herois}", pessoa1.getUltimaNotificacao());
        assertEquals("Caio, notificação de filme novo no Grupo {Nome do grupo = Grupo vingadores, Genero = Herois}", pessoa2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarPessoa() {
        GrupoDeFIlmes grupo = new GrupoDeFIlmes("Grupo de mentirinha", "Comédia");
        Pessoa pessoa = new Pessoa("Fran");
        pessoa.adicionar(grupo);
        assertEquals(null, pessoa.getUltimaNotificacao());
    }

    @Test
    void deveNotificarPessoasDoGrupoAcao() {
        GrupoDeFIlmes grupo1 = new GrupoDeFIlmes("Grupo dificil de matar", "Ação");
        GrupoDeFIlmes grupo2 = new GrupoDeFIlmes("Grupo Sharknado", "Trash");
        Pessoa pessoa1 = new Pessoa("Marco");
        Pessoa pessoa2 = new Pessoa("Rodrigo");
        pessoa1.adicionar(grupo1);
        pessoa2.adicionar(grupo2);
        grupo1.lancarFilme();
        assertEquals("Marco, notificação de filme novo no Grupo {Nome do grupo = Grupo dificil de matar, Genero = Ação}", pessoa1.getUltimaNotificacao());
        assertEquals(null, pessoa2.getUltimaNotificacao());
    }
}
