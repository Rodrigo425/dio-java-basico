public class App {
    public static void main(String[] args) throws Exception {
        String meuNome = "Rodrigo";
        boolean verdadeiro = true;


        String primeiroNome = "Rodrigo";
        String segundoNome = "Tavares";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //A variavel nomeCompleto recebe os valores do método
 
        System.out.println(nomeCompleto);
    }
    //Metodo tipo String, nome, (Parametros)
    public static String nomeCompleto (String primeiroNome, String SegundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(SegundoNome); //O tipo de retorno pode ser qualquer valor
    }
}
