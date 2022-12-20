package knjiga;

public class Main {
    public static void main(String[] args){
        Author A1 = new Author();
        Author A2 = new Author("Lazar", "Maric", "larafa");
        Author A3 = new Author("Marko", "Markovic", "afmklf", true);
        String namelast = A3.getName() + A3.getLastname();
        Book B1 = new Book("123", "Enciklopedija cudovista", A3.getName(), A3.getLastname(), 123);
        System.out.println(A2.toString());
        System.out.println(A3.toString());
        if(A2.equals(A3)) //ne radi
            System.out.println(true);
        else
            System.out.println(false);
        System.out.println(B1.toString());
    }
}
