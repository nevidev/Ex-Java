public class TesteIf {
    public static void main(String[] args) {
        
        boolean chuva = false;
        boolean guardaChuva = false;

        if (chuva == true && guardaChuva == true) {
            System.out.println("Pode sair");
        } else if (chuva == true && guardaChuva == false) {
            System.out.println("Você vai molhar");
        } else {
            System.out.println("Fique tranquilo, não está chovendo");
        }

    }
}


