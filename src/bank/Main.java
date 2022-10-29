package bank;

public class Main {
    public static void main(String[] args) {

    Payment p1 = new Payment("10.10.2022", 1000, "Zahlung");
    Payment p2 = new Payment( "11.11.2022", 3000, "Zahlung", -0.5, 2);
    Payment p3 = new Payment( p2);

    System.out.println("Zahlungen:\n------------------\nKonstruktor Nr.1");
    p1.printObject();
    System.out.println("Zahlungen:\n------------------\nKonstruktor Nr.2");
    p2.printObject();
    System.out.println("Zahlungen:\n------------------\nKonstruktor Nr.3");
    p3.printObject();

    System.out.println("\n===================\n");

    Transfer t1 = new Transfer("10.10.2022", -1000, "Überweisung");
    Transfer t2 = new Transfer( "11.11.2022", 3000, "Überweisung", "Mo", "Ahmed");
    Transfer t3 = new Transfer( t2);

    System.out.println("Überweisungen:\n------------------\nKonstruktor Nr.1");
    t1.printObject();
    System.out.println("Überweisungen:\n------------------\nKonstruktor Nr.2");
    t2.printObject();
    System.out.println("Überweisungen:\n------------------\nKonstruktor Nr.3");
    t3.printObject();
}
}