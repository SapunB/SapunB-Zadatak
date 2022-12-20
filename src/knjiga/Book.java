package knjiga;

public class Book {
    private String ISBN;
    private String name;
    private String nameA;
    private String lastnameA;
    private double price;

    public Book(){

    }
    public Book(String ISBN, String name, String nameA, String lastnameA){
        this.ISBN = ISBN;
        this.name = name;
        this.nameA = nameA;
        this.lastnameA = lastnameA;
    }
    public Book(String ISBN, String name, String nameA, String lastnameA, double price){
        this.ISBN = ISBN;
        this.name = name;
        this.nameA = nameA;
        this.lastnameA = lastnameA;
        this.price = price;
    }

    @Override
    public String toString(){
        return "ISBN: " + ISBN + ", name: " + name + ", author name: " + nameA + ", autor lastname: " + lastnameA + ", price: " + price;
    }

    @Override
    public boolean equals(Object ObjC){
        if(ObjC instanceof Book){
            Book temp = (Book) ObjC;
            if(ISBN.equals(temp.ISBN))
                return true;
        }
        return false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public String getLastnameA() {
        return lastnameA;
    }

    public void setLastnameA(String lastnameA) {
        this.lastnameA = lastnameA;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
