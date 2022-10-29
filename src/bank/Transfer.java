package bank;

public class Transfer {

    //Attributes
    private String date; //date
    private double amount; //Überweisungsbetrag (Kann nur + sein)
    private String description; //Infos
    private String sender; //Sender
    private String recipient; //Recipient

    //GettersNSetters

    public String getDate() { return this.date; }
    public void setDate(String date) { this.date = date; }

    public double getAmount(){ return this.amount; }
    public void setAmount(double amount) {
        if(amount < 0){
            System.out.println("Bitte einen positiven Betrag eingeben!");
        } else
        this.amount = amount; }

    public String getDescription(){ return this.description;}
    public void setDescription(String description){ this.description = description; }

    public String getSender(){ return this.sender;}
    public void setSender(String sender){ this.sender = sender;}

    public String getRecipient(){return this.recipient;}
    public void setRecipient(String recipient){ this.recipient = recipient;}

    //Constructors

    Transfer(String date, double amount, String description){
        setDate(date);
        setAmount(amount);
        setDescription(description);
    }

    Transfer(String date, double amount, String description, String sender, String recipient){
        this(date, amount, description);
        setSender(sender);
        setRecipient(recipient);
    }

    Transfer(Transfer t){
        this(t.getDate(), t.getAmount(), t.getDescription(), t.getSender(), t.getRecipient());
    }

    public void printObject(){
        System.out.println("Datum: " + this.getDate() + "\nBetrag: " + this.getAmount() + "\nBeschreibung: " + getDescription() + "\nSender: " + getSender() + "\nRecipient: " + getRecipient() + "\n" );
    }

}
