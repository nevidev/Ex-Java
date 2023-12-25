public class Ternario {
    public static void main(String[] args) {
        String video = "Naruto";
        String categoria = "";

        if (video == "Naruto") {
            categoria = "Anime";
        } else {
            categoria = "Série";
        }
        System.out.println(categoria);

        // JEITO MAIS CURTO
        String categoria2 = (video == "Naruto") ? "Anime" : "Série";
        System.out.println(categoria2);

    }
    
}
