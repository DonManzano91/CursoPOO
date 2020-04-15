
public class Cuenta {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Cuenta(String name, String document) {
        this.name = name;
        this.document = document;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nid: " + id + 
        "\nname: " + name + 
        "\ndocument: " + document + 
        "\nemail: " + email;
    }
}