package hospital;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPaciente {
    private List<Paciente> pacientes = new ArrayList<>();

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void atualizarPaciente(int id, String nome, double peso, double altura, int sexo) {
        for (Paciente p : pacientes) {
            if (p.getId() == id) {
                p.setNome(nome);
                p.setPeso(peso);
                p.setAltura(altura);
                p.setSexo(sexo);
                System.out.println("Paciente atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    public void excluirPaciente(int id) {
        pacientes.removeIf(p -> p.getId() == id);
        System.out.println("Paciente removido com sucesso.");
    }

    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            for (Paciente p : pacientes) {
                System.out.println(p);
            }
        }
    }
}