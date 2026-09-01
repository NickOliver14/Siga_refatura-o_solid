package siga;

import java.util.List;

/**
 * Código INICIAL da atividade — contém violações PROPOSITAIS do SOLID.
 *
 * PROBLEMA 1 — Violação do Princípio da Responsabilidade Única (SRP):
 * esta classe acumula TRÊS responsabilidades que mudam por motivos diferentes:
 *   (a) formatar o relatório (apresentação);
 *   (b) gravar o relatório em disco (persistência);
 *   (c) enviar o relatório por e-mail (comunicação).
 * Uma mudança em qualquer uma dessas áreas obriga a mexer nesta mesma classe.
 *
 * Tarefa (etapas 1 e 2 da ficha): identificar as responsabilidades misturadas
 * e separá-las em classes distintas (ex.: RelatorioFormatador, RelatorioRepositorio,
 * ServicoEmail), cada uma com um único motivo para mudar.
 */
public class RelatorioRepositorio{
    
    // Responsabilidade (b): PERSISTÊNCIA (gravar em arquivo)
    public void salvarEmArquivo(String conteudo, String caminho) {
        // Simulação de gravação em disco (a implementação real não importa para a atividade).
        System.out.println("[disco] Gravando relatório em: " + caminho);
        System.out.println(conteudo);
    }
}