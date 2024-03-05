package listamatriz;

public class Lista {

  static final int colNome = 0;
  static int colQuantidade = 1;

  public static boolean estaCheia(String[][] matriz) {
    int ocupado = 0;
    for (int linha = 0; linha < matriz.length; linha++) {
      if (matriz[linha][colNome] != null) {
        ocupado++;
      }
    }
    return ocupado == matriz.length ? true : false;
  }

  public static boolean estaVazia(String[][] matriz) {
    int ocupado = 0;
    for (int linha = 0; linha < matriz.length; linha++) {
      if (matriz[linha][colNome] != null) {
        ocupado++;
      }
    }
    return ocupado == 0 ? true : false;
  }

  public static void inserir(String nome, int quantidade, String[][] matriz) {
    if (!estaCheia(matriz)) {
      for (int linha = 0; linha < matriz.length; linha++) {
        if (matriz[linha][colNome] == null) {
          matriz[linha][colNome] = nome;
          matriz[linha][colQuantidade] = "" + quantidade;
          break;
        }
      }
    }
  }

  public static String[] chamar(int lugares, String[][] matriz) {
    if (!estaVazia(matriz)) {
      for (int linha = 0; linha < matriz.length; linha++) {
        if (Integer.parseInt(matriz[linha][colQuantidade]) == lugares &&
            matriz[linha][colNome] != null) {
          String[] aux = new String[2];
          aux[colNome] = matriz[linha][colNome];
          aux[colQuantidade] = matriz[linha][colQuantidade];
          matriz[linha][colNome] = null;
          return aux;
        }
      }
    }
    return null;
  }

  public static String exibir(String[][] matriz) {
    String lista = "";
    for (int linha = 0; linha < matriz.length; linha++) {
      lista += matriz[linha][colNome] + " = " + matriz[linha][colQuantidade] + "\n";
    }
    return lista;
  }

}