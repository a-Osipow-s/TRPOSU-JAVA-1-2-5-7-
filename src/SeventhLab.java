import java.io.*;

public class SeventhLab {
    public static void main(String[] args) {
        Property lowRiseHouse, highRiseHouse;

        lowRiseHouse = new LowRiseBuilding("Carla Marksa 9", 20, 4);
        lowRiseHouse.print();
        lowRiseHouse.run();
        lowRiseHouse.writeInfoInFile();

        highRiseHouse = new HighRiseBuilding("Nezavisimosti 58", 50, 8);
        highRiseHouse.print();
        highRiseHouse.run();
        highRiseHouse.writeInfoInFile();
    }
}

abstract class Property {
    protected String address;
    protected int numberOfApartaments, porches;

    Property() {}

    void print() {}
    void run() {}
    void writeInfoInFile() {}
}

class LowRiseBuilding extends Property {

    private String type = "Low-rise house";
    private int numberOfFloors = 5;

    LowRiseBuilding(){}

    LowRiseBuilding(String adr, int numberApart, int porch){
        address = adr;
        numberOfApartaments = numberApart;
        porches = porch;
    }

    void print() {
        System.out.printf("Info:\nAddress=%s, type=%s, number of floors=%d, number of apartaments=%d, porches=%d\n",
                address, type, numberOfFloors, numberOfApartaments, porches);
    }

    void run() {
        System.out.printf("Apartments in the house=%d\n", numberOfFloors * numberOfApartaments);
    }

    void writeInfoInFile() {
        String dataString = "address="+address+", type="+type+", floors="+numberOfFloors+", porches="+porches+"\n";
        try(FileOutputStream fos=new FileOutputStream("test.txt", true))
        {
            // перевод строки в байты
            byte[] buffer = dataString.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}

class HighRiseBuilding extends LowRiseBuilding {

    private String type = "High-rise house";
    private int numberOfFloors = 10;

    HighRiseBuilding(String adr, int numberApart, int porch){
        address = adr;
        numberOfApartaments = numberApart;
        porches = porch;
    }
}