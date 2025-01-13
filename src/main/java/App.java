package src.main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("Matheus Silva", Arrays.asList("Moisés Pereira", "João Souza"));
        graph.put("Moisés Pereira", Arrays.asList("Matheus Silva", "Francisco Alves", "Lucas Lima"));
        graph.put("João Souza", Arrays.asList("Matheus Silva", "Tiago Mendes"));
        graph.put("Moisés Pereira", Arrays.asList("Matheus Silva", "Francisco Alves", "Lucas Lima"));
        graph.put("João Souza", Arrays.asList("Matheus Silva", "Tiago Mendes"));
        graph.put("Francisco Alves", Arrays.asList("Moisés Pereira", "Rafael Costa"));
        graph.put("Lucas Lima", Arrays.asList("Moisés Pereira", "Ana Paula"));
        graph.put("Tiago Mendes", Arrays.asList("João Souza", "Carla Dias"));
        graph.put("Rafael Costa", Arrays.asList("Francisco Alves", "Pedro Nunes"));
        graph.put("Ana Paula", Arrays.asList("Lucas Lima", "Fernanda Santos", "Gabriel Barros"));
        graph.put("Carla Dias", Arrays.asList("Tiago Mendes", "Maria Silva"));
        graph.put("Pedro Nunes", Arrays.asList("Rafael Costa", "Juliana Moraes"));
        graph.put("Fernanda Santos", Arrays.asList("Ana Paula", "Bruna Ferreira"));
        graph.put("Gabriel Barros", Arrays.asList("Ana Paula", "Rodrigo Almeida"));
        graph.put("Maria Silva", Arrays.asList("Carla Dias", "Paulo Cardoso", "Vinícius Borges"));
        graph.put("Juliana Moraes", Arrays.asList("Pedro Nunes", "Lucas Braga"));
        graph.put("Bruna Ferreira", Arrays.asList("Fernanda Santos", "Mariana Andrade"));
        graph.put("Rodrigo Almeida", Arrays.asList("Gabriel Barros", "Felipe Vieira"));
        graph.put("Paulo Cardoso", Arrays.asList("Maria Silva", "Samuel Neves"));
        graph.put("Vinícius Borges", Arrays.asList("Paulo Cardoso"));

        System.out.println("Um dos modelos mais famosos de algoritmos, é o de pesquisa em largura (BFS).\n " +
                "Hoje apresentarei esse algoritmo, na qual, o facebook por exemplo, utiliza para verificar amizades em potêncial nas suas redes sociais.\n" +
                "Teremos uma lista de amizade: " + graph + "\nNa qual, iremos percorrer todo o algoritmo usando grafos, verificando o amigo atual que estamos, e os conectados a ele.\n" +
                "vamos identificar se, um usuário A está conectado a um usuário B, mesmo que indiretamente, permitindo que seja mencionada uma sugestão de amizade entre os dois.");
        Utils.verificaAmizades(graph, "Matheus Silva");

        System.out.println("Agora vamos verificar se, 2 usuários, estão conectados por suas amizades.");
        Utils.isAmigo(graph, "Matheus Silva", "Adalton Mendes");
    }
}
