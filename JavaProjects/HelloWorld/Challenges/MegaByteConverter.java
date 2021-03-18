package HelloWorld.Challenges;

public class MegaByteConverter {
    public static void main(String[] args) {

    }

    public static void printMegaBytesAndKiloBytes(int KiloBytes) {
        if (KiloBytes > 0) {
            int MegaBytes = KiloBytes / 1024;
            int MegaByte = KiloBytes % 1024;
            System.out.println(KiloBytes + " KB = " + MegaBytes + " MB and " + MegaByte + " KB");
        } else if (KiloBytes == 0) {
            System.out.println("0 KB = 0 MB and 0 KB");
        } else {
            System.out.println("Invalid Value");
        }

    }

}
