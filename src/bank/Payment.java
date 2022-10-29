package bank;

public class Payment {

    //Attributes
    private String date; //date
    private double amount; //Ein- und Auszahlungsbetrag (Kann + oder - sein)
    private String description; //Infos
    private double incomingInterest; //Zinsen (0 bis 1) Deposit
    private double outcomingInterest; //Zinsen (0 bis1) Withdrawal

    //GettersNSetters

    public String getDate() { return this.date; }
    public void setDate(String date) { this.date = date; }

    public double getAmount(){ return this.amount; }
    public void setAmount(double amount) { this.amount = amount;}

    public String getDescription(){ return this.description;}
    public void setDescription(String description){ this.description = description; }

    public double getIncomingInterest(){ return this.incomingInterest;}
    public void setIncomingInterest(double incomingInterest){
        if(incomingInterest >= 0 && incomingInterest <= 1){
            this.incomingInterest = incomingInterest;
        }
        else {
            System.out.println("Die Eingabe ist nicht richtig!");
        }
    }


    public double getOutcomingInterest(){return this.outcomingInterest;}
    public void setOutcomingInterest(double outcomingInterest) {
        if (outcomingInterest >= 0 && outcomingInterest <= 1) {
            this.outcomingInterest = outcomingInterest;
        } else {
            System.out.println("Die Eingabe ist nicht richtig!");
        }
    }

    //Constructors

     Payment(String date, double amount, String description){
        setDate(date);
        setAmount(amount);
        setDescription(description);
     }

     Payment(String date, double amount, String description, double incomingInterest, double outcomingInterest){
        this(date, amount, description);
        setIncomingInterest(incomingInterest);
        setOutcomingInterest(outcomingInterest);
     }

     Payment(Payment p){
        this(p.getDate(), p.getAmount(), p.getDescription(), p.getIncomingInterest(), p.getOutcomingInterest());
     }

     public void printObject(){
        System.out.println("Datum: " + this.getDate() + "\nBetrag: " + this.getAmount() + "\nBeschreibung: " + getDescription() + "\nDeposit: " + getIncomingInterest() + "\nWithdrawal: " + getOutcomingInterest() + "\n" );
     }

}
