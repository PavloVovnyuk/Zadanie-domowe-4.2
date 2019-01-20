    public class Warehouse {
        public static void main(String[] args) {
            Device device1 = new Device("Kod: " + "QE65Q7FAM," , " Producent: " + "Samsung," , " Typ: " + " TV ," + "Cena: " +  9499.99); //code, producer, type, price
            Device device2 = new Device("Kod: " + " P9 Lite,", " Producent: " + " Huawei,", " Typ: " + " Smatyphone" + " Cena : "); //code, producer, type
            Device device3 = new Device("Kod: " + " Playstation 4, ", " Producent: " + " Sony,", " Typ: " + " Smatyphone," + "Cena: "  + 1899.99); //code, producer, type, price

            String allDevices = device1.getInfo() + "\n" + device2.getInfo() + "\n" + device3.getInfo();
            System.out.println(allDevices);
        }
    }

