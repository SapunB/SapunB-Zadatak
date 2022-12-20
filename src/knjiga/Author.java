package knjiga;

public class Author {
    private String name;
    private String lastname;
    private String email;
    private boolean nobel;

    public Author(){

    }
    public Author(String name, String lastname, String email){
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }
    public Author(String name, String lastname, String email, boolean nobel){
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.nobel = nobel;
    }

    @Override
    public String toString(){
        return "Name: " + name + " lastname: " + lastname + " email " + email;
    }

    @Override
    public boolean equals(Object ObjC){
        if(ObjC instanceof Author){
            Author temp = (Author) ObjC;
            if(name.equals(temp.name) && lastname.equals(temp.lastname) && email.equals(temp.email))
                return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isNobel() {
        return nobel;
    }

    public void setNobel(boolean nobel) {
        this.nobel = nobel;
    }
}
