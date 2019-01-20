public class Device {
    String code;
    String producer;
    String type;
    double prise;

    Device(String code, String producer, String type, double prise) {
        this.code = code;
        this.producer = producer;
        this.type = type;
        this.prise = prise;
    }

    Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    String getInfo() {
        String getinfo = code + producer + type + prise;
        return getinfo;
    }
}
