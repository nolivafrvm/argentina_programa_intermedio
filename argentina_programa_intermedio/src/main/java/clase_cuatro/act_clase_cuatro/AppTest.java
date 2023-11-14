package clase_cuatro.act_clase_cuatro;

public class AppTest {

    public static void main(String[] args) {
        // Crear una canción
        State.PopularidadState estado = new State.EnTendenciaState();
        Cancion cancion = new Cancion(estado);
        cancion.setTitulo("Cancion1");
        cancion.setArtista("Artista1");
        cancion.setAlbum("Album1");
        cancion.setAnioDelAlbum(2022);
        cancion.setReproducciones(100);
        cancion.setLikes(1000);
        cancion.setDislikes(50);

        System.out.println("Información de la canción: " + cancion.mostrarInformacion());

        cancion.setEstado(new State.NormalState());

        System.out.println("Información de la canción: " + cancion.mostrarInformacion());

        cancion.cambiarEstado(new State.EnAugeState());

        System.out.println("Información de la canción después de cambiar el estado: " + cancion.mostrarInformacion());
    }


}
