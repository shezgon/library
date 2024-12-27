package vo;

public class BookVo {
    int code;
    String book;
    String name;
    String company;
    int price;
    String owner;
    String read;


    public BookVo(){}

    public BookVo(int code, String book, String name, String company, int price, String owner, String read){
        this.code = code;
        this.book = book;
        this.name = name;
        this.company = company;
        this.price = price;
        this.owner = owner;
        this.read = read;
    }

    @Override
    public String toString() {
        return code + "\t\t" + book + "\t\t\t" + name + "\t\t" + company + "\t" + price + "\t" + owner + "\t\t" + read ;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String title) {
        this.book = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }
}
