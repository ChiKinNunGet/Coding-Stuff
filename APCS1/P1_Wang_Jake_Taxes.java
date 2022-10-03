/*
    Name:       Jake Wang
    Date:       9/20/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
public class P1_Wang_Jake_Taxes
{
    private double hours;
    private double rate;
    final private double FEDERAL_TAX = 0.124;
    final private double FICA_TAX = 0.0775;
    final private double STATE_TAX = 0.093;
    
    public P1_Wang_Jake_Taxes(double rate,double hours){
        this.hours = hours;
        this.rate = rate;
    }
    
    /**
     * @param hours double value of paid hours worked
     */
    public void setHours(double hours){
        this.hours = hours;
    }
    
    /**
     * @param rate pay rate per hour worked
     */
    public void setRate(double rate){
        this.rate = rate;
    }
    
    public String calculateAndDisplay(){
        final double PAY = rate * hours;
        double federal = FEDERAL_TAX;
        double fica = FICA_TAX;
        double state = STATE_TAX;
        
        return("Hours worked: " + hours + "\nHourly rate: " + rate + "\n\nGross pay: " + (PAY) + 
                "\n\nFederal tax (" + (federal*100) + "%): " + PAY*federal + 
                "\nFICA tax (" + (fica*100) + "%): " + PAY*fica + 
                "\nState tax(" + (state*100) + "%): " + PAY*state + 
                "\n\nNet Pay: " + PAY*(1-federal)*(1-fica)*(1-state));
    }
}
