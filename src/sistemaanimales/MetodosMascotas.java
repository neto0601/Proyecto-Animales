
package sistemaanimales;


public class MetodosMascotas {
    private int id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String genero;
    
    public MetodosMascotas(){}
    
    public MetodosMascotas(int id_mascotas, String nombre, String especie, String raza, String genero){
        this.id_mascota = id_mascotas;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.genero = genero;
    }
    
    public MetodosMascotas(String nombre, String especie, String raza, String genero){
        
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.genero = genero;
    }
    
    
    

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
