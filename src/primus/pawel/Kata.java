package primus.pawel;

public class Kata {

    private String number;
    private String name;
    private String kyu;
    private String link;
    private String date;
    private Status status;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKyu() {
        return kyu;
    }

    public void setKyu(String kyu) {
        this.kyu = kyu;
    }

    public String getLink() {
        return link;
    }

    void setLink(String link) {
        this.link = link;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {
        DONE, TODO;
    }

    public String toFile(){
        StringBuilder sb = new StringBuilder();
        sb.append("[#").append(number).append(" [").append(kyu).append("] ").append(name).append("] ").append("(").append(link).append(")");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Kata{" +
                "name='" + name + '\'' +
                ", kyu='" + kyu + '\'' +
                ", link='" + link + '\'' +
                ", date='" + date + '\'' +
                ", status=" + status +
                '}';
    }
}
