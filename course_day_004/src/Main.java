public class Main {
    public static void main(String[] args) {
        System.out.println("5 Nisan 2023 || 5 April 2023");
        String userEmail = "tarik.kamat+2000@gmail.com";
        System.out.println(userNameGenerator(userEmail));
    }

    public static String userNameGenerator(String email) {
        String beforeStrudelCharacter = email.substring(email.indexOf("@"), email.lastIndexOf(""));
        // Gelen değerin @ karakteri içerip içermediğini kontrol ediyoruz. || We check if the incoming value contains the @ character.
        // Gelen değerin @ karakterinden sonra (.) içermesi gerekiyor. || The incoming value must contain (.) after the @ character.
        if (email.contains("@") && beforeStrudelCharacter.contains(".")) {
            // @ karakterinden önceki kısmı alıyoruz. || Take the part before the @ character.
            String userName = email.substring(0, email.indexOf("@"));
            // Özel karakterleri ve rakamları siliyoruz. || We delete special characters and numbers.
            return userName.replaceAll("[.+,!?]|[0-9]", "");
        } else {
            return "Geçersiz email adresi";
        }

    }
}