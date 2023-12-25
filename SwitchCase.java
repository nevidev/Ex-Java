public class SwitchCase {
    public static void main(String[] args) throws Exception{
        String perso = "Goku";

        if (perso == "Goku") {
            System.out.println("Sayajin");
        } else if (perso == "Vegeta") {
            System.out.println("Sayajin");
        } else if (perso == "Piccolo") {
            System.out.println("Namekuseijin");
        } else if (perso == "Kuririn") {
            System.out.println("Terra");
        } else {
            System.out.println("Desconhecido");
        }

        // USANDO SWITCH
        switch (perso) {
            case "Goku":
                System.out.println("Sayajin");
                break;
            case "Vegeta":
                System.out.println("Sayajin");
                break;
            case "Piccolo":
                System.out.println("Namekuseijin");
                break;
            case "Kuririn":
                System.out.println("Terra");
                break;
            default:
                System.out.println("Desconhecido");
        } 
    }
}
