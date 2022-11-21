package br.unicap.luis_00000845392.p3.projeto.healthSaude.dados.listas;

import br.unicap.luis_00000845392.p3.projeto.healthSaude.negocios.pessoas.funcionario.tipos.Exame;

import java.util.ArrayDeque;

public class FilaDeExame {
    private ArrayDeque<Exame> filaExames;

    public FilaDeExame(ArrayDeque<Exame> filaExames) {
        this.filaExames = filaExames;
    }

    public ArrayDeque<Exame> getFilaExames() {
        return filaExames;
    }

    public void setFilaExames(ArrayDeque<Exame> filaExames) {
        this.filaExames = filaExames;
    }
}
