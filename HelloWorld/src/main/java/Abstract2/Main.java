package Abstract2;

public class Main {
    public static void main(String[] args) {
        HondaCar h = new HondaCar();
        h.brake();
        h.vechileYear();
        h.speed();
        KiaCar k = new KiaCar();
        k.brake();
        k.vechileYear();
        k.speed();
    }
}
