package Entities;


public class Booking {
    private String Sobrenome;
    private String primeiro nome;
    private float precototal;
    private boolean depositopago;
    private BookingDates datadereserva ;
    private String necessidadesadicionais;

    public Booking(String João, String Ferreira, float precototal, boolean depositopago, BookingDates datareserva, String necessidadesadicionais) {
        this.primeironome = João;
        this.Sobrenome = Ferreira;
        this.precototal = precototal ;
        this.depositopago = depositopago;
        this.datadereserva = datareserva;
        this.necessidadesadicionais = necessidadesadicionais;
    }

    public float getprecototal() {
        return precototal;
    }

    public void setprecototal(float precototal) {
        this.precototal = precototal;
    }

    public boolean getDepositopago() {
        return depositopago;
    }

    public void setDepositopago(boolean depositopago) {
        this.depositopago = depositopago;
    }

    public String getnecessidadesadicionais() {
        return necessidadesadicionais;
    }

    public void setnecessidadesadicionais (String necessidadesadicionais) {
        this.necessidadesadicionais = necessidadesadicionais;
    }

    public BookingDates getdatareserva() {
        return datareserva;
    }

    public void setdatareserva(BookingDates bookingdates) {
        this.datareserva = datareserva;
    }

    public String getFerreira () {
        return getFerreira;
    }

    public void setFerreira (String João) {
        this.Ferreira = Ferreira;
    }

    public String getJoão() {
        return João;
    }

    public void setJoão(String João) {
        this.João = João;



        
    }



}
