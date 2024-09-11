public class Animal{
    // Atributos
    private String nombre;
    private boolean mamifero;
    private String sonido;
    private boolean domestico;

    //
    //Constructor
    //
    public Animal(String nombre, boolean mamifero, String sonido, boolean domestico) {
        this.nombre = nombre;
        this.mamifero = mamifero;
        this.sonido = sonido;
        this.domestico = domestico;
    }

    public Animal(String nombre, String sonido, boolean domestico){
        this.nombre = nombre;
        this.sonido = sonido;
        this.domestico = domestico;
    }

    public Animal(String nombre, boolean domestico){
        this.nombre = nombre;
        this.domestico = domestico;
    }
    //
    // Getters & Setters
    //

    //Getter para el nombre
    public String getNombre(){
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Getter para mamifero
    public boolean getMamifero(){
        return mamifero;
    }

    // Setter para mamifero
    public void  setMamifero(boolean mamifero){
        this.mamifero = mamifero;
    }

    //Getter para sonido
    public String getSonido(){
        return sonido;
    }

    // Setter para sonido
    public void setSonido(String sonido){
        this.sonido = sonido;
    }

    //Getter para domestico
    public boolean getDomestico(){
        return domestico;
    }

    // Setter para domestico
    public void setDomestico(boolean domestico){
        this.domestico = domestico;
    }

    public void mostratInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Mamifero: " + mamifero);
        System.out.println("Sonido: " + sonido);
        System.out.println("Domestico: " + domestico);
    }
    public static void main(String[] args){
        Animal tigre = new Animal("Tigre", true, "rugido", false);
        tigre.mostratInfo();
        System.out.println("\n");
        Animal perro = new Animal("Perro", true, "ladrido", true);
        perro.mostratInfo();
        System.out.println("\n");
        Animal gato = new Animal("Gato",true);
        gato.mostratInfo();
    }

}