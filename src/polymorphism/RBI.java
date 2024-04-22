package polymorphism;



public class RBI {
    public static void main(String[] args) {
        RBI mov = new RBI();
        mov.rate();
        SBI sbi = new SBI();
        sbi.rate();
        HDFC hdfc = new HDFC();
        hdfc.rate();
        AXIS axis = new AXIS();
        axis.rate();
    }

    public void rate() {
        System.out.println("RBI provide 8 %");
    }
}

class SBI extends RBI {
    public void rate() {
        System.out.println("SBI provide 10%");
    }
}

class HDFC extends RBI {
    public void rate() {
        System.out.println("HDFC provide 12.5%");
    }
}

class AXIS extends RBI {
    public void rate() {
        System.out.println("AXIS provide 13 %");
    }
}
