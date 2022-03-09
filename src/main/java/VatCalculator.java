public class VatCalculator {
    public VatCalculator(){

    }
    public int VAT_UK(int uk){
        double rs1 = uk * 1.20;
        return (int) rs1;
    }
    public int VAT_SWE(int swe){
        double rs2 = swe *1.25;
        return( int) rs2;
    }
    public int VAT_SPN(int euro){
        double rs3 = euro * 1.21 ;
        return (int) rs3;
    }

}


