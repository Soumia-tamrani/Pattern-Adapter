package computer;

public class UniteCentrale {
    private VGA vga;

    public void  print(String message){
        System.out.println("*********UC***********");
        vga.print(message);
        System.out.println("**********UC**********");
    }
        public void setVGA(VGA vga){
            this.vga=vga;

    }


}
