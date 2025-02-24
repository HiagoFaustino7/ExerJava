public class TesteListaString {
    public static void main(String[] args) {
        ListaArrayString lista = new ListaArrayString(4);
        lista.adicionar("Ana");
        lista.adicionar("Bruno");
        lista.adicionar("Carlos");
        lista.adicionar("Daniel");
        lista.imprimirLista();  // Deve imprimir: Lista de Nomes: Ana Bruno Carlos Daniel
        lista.remover(1);
        lista.imprimirLista();  // Deve imprimir: Lista de Nomes: Ana Carlos Daniel
    }
}