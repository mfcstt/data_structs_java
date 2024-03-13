package circular;

public class Fila {
    public static void main(String[] args) throws Exception {
        FilaCircular fila = new FilaCircular();
        fila.pop(1);
        fila.pop(2);
        fila.pop(3);
        fila.pop(4);
        fila.pop(5);
        System.out.println(fila.push());
        System.out.println(fila.push());
        System.out.println(fila.push());
        System.out.println(fila.push());
        System.out.println(fila.push());

    }
}
