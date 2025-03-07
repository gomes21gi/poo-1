public class LoopFuncional {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            lista.add(i);
        }
        for(var i : lista) { // for
            System.out.print(i);
        }
    }
}
