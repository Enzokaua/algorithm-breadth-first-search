package src.main.java;

import java.util.*;

public class Utils {
    public static void verificaAmizades(Map<String, List<String>> grafos, String index){
        Queue<String> linkedList = new LinkedList<>(); //Queue - Modelo que expressa o FIFO, com sua lógica sendo realmente uma pilha
        Set<String> grafosVisitados = new HashSet<>(); //Set - Modelo de hash que não permite valores duplicados
        linkedList.add(index);
        grafosVisitados.add(index);

        while(!linkedList.isEmpty()){ //verifica se o linkedList está vazio
            String noAtual = linkedList.poll();//se não estiver, o ponto em que estamos é o nó atual da nossa lista
            for (String grafosVizinhos : grafos.getOrDefault(noAtual, Collections.emptyList())) {//percorremos o map passando o nó atual
                if(!grafosVisitados.contains(grafosVizinhos)){ //caso nosso set não contenha o iterador do for, o adicionamos a lista e como um dos grafos já visitados
                    linkedList.add(grafosVizinhos);
                    grafosVisitados.add(grafosVizinhos);
                }
                System.out.println("Rede social do: "+ noAtual + ", Nó atual de seguidores: " + grafosVizinhos);

            }
        }
    }


    public static boolean isAmigo(Map<String, List<String>> grafos, String index, String vizinho){
        Queue<String> linkedList = new LinkedList<>();
        Set<String> grafosVisitados = new HashSet<>();
        linkedList.add(index);
        grafosVisitados.add(index);

        while(!linkedList.isEmpty()){
            String noAtual = linkedList.poll();
            for (String grafosVizinhos : grafos.getOrDefault(noAtual, Collections.emptyList())) {
                if(!grafosVisitados.contains(grafosVizinhos)){
                    linkedList.add(grafosVizinhos);
                    grafosVisitados.add(grafosVizinhos);
                    if(grafosVizinhos.equals(vizinho)){ //verifica se, os 2 usuários, estão conectados através de todos os usuários
                        System.out.println("Estão conectados!");
                        return true;
                    }
                }
            }
        }
        System.out.println("Não compartilham conexão!");
        return false;
    }

}
