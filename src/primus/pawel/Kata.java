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

    public int getKyuNumber(){
        int num = Integer.parseInt(kyu.replaceAll("[^0-9]", ""));
        return num;
    }

    private static final String FILE_TEXT = "[#%s [%s] %s](%s)";

    public String toFile(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(FILE_TEXT, number, kyu, name, link.replaceAll("https:", "https://")));
        if(status.equals(Status.TODO)){
            sb.append("//TODO");
        }
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
