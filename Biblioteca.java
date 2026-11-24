public class Biblioteca {
    private String nombre;
    private String direccion;
    private List<Libro> libros;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca " + nombre + ":");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " por " + libro.getAutor());
        }
    }
    
}
