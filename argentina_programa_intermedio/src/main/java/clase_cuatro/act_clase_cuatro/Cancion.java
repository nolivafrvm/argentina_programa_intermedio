package clase_cuatro.act_clase_cuatro;

public class Cancion {

    private String titulo;
    private String artista;
    private String album;
    private int anioDelAlbum;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private State.PopularidadState estado;

    public Cancion(State.PopularidadState estado) {
        this.estado = estado;
    }

    public void cambiarEstado(State.PopularidadState nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String mostrarInformacion() {
        return estado.mostrarIcono() + "–" + estado.mostrarLeyenda(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnioDelAlbum() {
        return anioDelAlbum;
    }

    public void setAnioDelAlbum(int anioDelAlbum) {
        this.anioDelAlbum = anioDelAlbum;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public State.PopularidadState getEstado() {
        return estado;
    }

    public void setEstado(State.PopularidadState estado) {
        this.estado = estado;
    }
}
