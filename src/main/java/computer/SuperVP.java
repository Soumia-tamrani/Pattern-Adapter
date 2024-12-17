package computer;

public class SuperVP implements VGA, HDMI{
    @Override
    public void view(byte[] data) {
        String message = new String(data);
        System.out.println("..............SuperVP via hdmi................... ");
        System.out.println(message);
        System.out.println(".............. / SuperVP via hdmi ................... ");

    }

    @Override
    public void print(String message) {
        System.out.println(".............. SuperVP via VGA ................... ");
        System.out.println(message);
        System.out.println(".............. / SuperVP via VGA ................... ");

    }
}
