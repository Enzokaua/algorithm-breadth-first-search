# Algoritmo de Busca em Largura (Breadth-First Search - BFS)

> Este repositório contém a implementação do algoritmo de Busca em Largura (BFS), amplamente utilizado para explorar grafos e árvores. O BFS é ideal para encontrar o caminho mais curto em grafos não ponderados e garantir a exploração completa de todas as arestas em uma busca nível por nível.

## 💻 Pré-requisitos

Para executar este projeto, certifique-se de ter as seguintes ferramentas configuradas no seu ambiente:

- **Java 21** ou superior;
- **Apache Maven** para gerenciamento de dependências e build do projeto;
- Editor ou IDE de sua escolha (IntelliJ IDEA, Eclipse, VS Code, etc.).

## 🚀 Sobre o projeto

O projeto implementa o algoritmo BFS, que realiza a exploração de grafos ou árvores de forma ordenada, visitando primeiro os vértices mais próximos do nó de origem antes de prosseguir para os mais distantes. É frequentemente usado em problemas como:
- Caminho mais curto em grafos não ponderados.
- Determinação de conexões entre elementos em redes.
- Resolução de problemas em mapas e labirintos.

### ✨ Funcionalidades

- Implementação do algoritmo BFS para grafos representados por listas de adjacências;
- Verificação de conexões entre dois nós;
- Impressão da ordem de visita dos nós;
- Suporte a grafos dirigidos e não dirigidos.

### 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto;
- **Apache Maven**: Ferramenta de build e gerenciamento de dependências;
- **Java Simple**: Estilo direto e simplificado para a implementação do algoritmo.

## 📚 Como Funciona o Algoritmo

O BFS utiliza uma fila (FIFO - First In, First Out) para explorar os nós de forma ordenada. A lógica básica é a seguinte:

1. Insira o nó inicial na fila e marque-o como visitado.
2. Enquanto a fila não estiver vazia:
   - Remova o nó da frente da fila.
   - Explore todos os vizinhos não visitados deste nó:
     - Marque os vizinhos como visitados.
     - Insira os vizinhos na fila.
3. Repita até que todos os nós conectados tenham sido visitados.

### Exemplo de Execução

**Entrada:**

```plaintext
Grafo:
A -> B, C  
B -> D, E  
C -> F  
D, E, F -> (sem vizinhos)

Nó inicial: A
