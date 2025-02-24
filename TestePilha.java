public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.imprimirPilha();  // Deve imprimir: Pilha: 10 20 30
        System.out.println("Topo da pilha: " + pilha.peek());  // Deve imprimir: Topo da pilha: 30
        System.out.println("Removendo: " + pilha.pop());  // Deve imprimir: Removendo: 30
        pilha.imprimirPilha();  // Deve imprimir: Pilha: 10 20
    }
}