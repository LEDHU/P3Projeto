package br.unicap.luis_00000845392.p3.projeto.HealthSaude.Pessoas.Funcionario.Tipos;

import br.unicap.luis_00000845392.p3.projeto.HealthSaude.Pessoas.Funcionario.Abstrato.Funcionario;
import br.unicap.luis_00000845392.p3.projeto.HealthSaude.Pessoas.Funcionario.Salario.ISalario;

public class Recepcionista extends Funcionario implements ISalario {

    public Recepcionista(String matricula) {
        super(matricula);
    }

    public Recepcionista(String nome, String cpf, String telefone, String matricula) {
        super(nome, cpf, telefone, matricula);
    }

    @Override
    public double calcularSalario(double extra) {
        return extra * 100 + 3000 ;
    }
}
