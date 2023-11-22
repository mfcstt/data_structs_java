public class App {

    static char[] vetor = new char[5];
    public static void main(String[] args) throws Exception {
    for (int i = 0; i < vetor.length; i++) {
        vetor[i] = (char) (65+1);
    }
    try{
        System.out.println(vetor[4]);
        String aux = "165.5";
        System.out.println(Double.parseDouble(aux));
        System.out.println(Integer.parseInt(aux));
  
    }
    catch(ArrayIndexOutOfBoundsException er){
        System.out.println(er.getMessage());
    }
    catch(NumberFormatException er){
        System.out.println(er.getMessage());
    }
    catch(RuntimeException er){
        System.out.println(er.getMessage());
    }
    finally{
        System.out.println("Fim do programa");
    }
    }
}
