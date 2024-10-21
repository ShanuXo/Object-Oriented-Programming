class bank{
    public int rateOfInterest()
    {
        return 2;
    }
}

class SBI extends bank {
    @Override
    public int rateOfInterest()
    {
        return 4;
    }
}
class ICICI extends bank {
    @Override
    public int rateOfInterest()
    {
        return 6;
    }
}
class BOI extends bank {
    @Override
    public int rateOfInterest()
    {
        return 5;
    }
}


public class Overriding {
    public static void main(String[] args)
    {
        SBI sbi=new SBI();
        ICICI icici=new ICICI();
        BOI boi=new BOI();
        sbi.rateOfInterest();
        icici.rateOfInterest();
        boi.rateOfInterest();
    }
}
