package clase_cuatro.act_clase_cuatro;

public class State {

    // State Pattern

    public interface PopularidadState {
        String mostrarIcono();
        String mostrarLeyenda(Cancion cancion);
    }

    static class NormalState implements PopularidadState {
        public String mostrarIcono() {
            return "🎵";
        }

        public String mostrarLeyenda(Cancion cancion) {
            return cancion.getArtista() + "–" + cancion.getAlbum() + "–" + cancion.getTitulo();
        }
    }

    static class EnAugeState implements PopularidadState {
        public String mostrarIcono() {
            return "🚀";
        }

        public String mostrarLeyenda(Cancion cancion) {
            return cancion.getArtista() + "–" + cancion.getTitulo() + "(" + cancion.getAlbum() + "–" + cancion.getAnioDelAlbum() + ")";
        }
    }

    static class EnTendenciaState implements PopularidadState {
        public String mostrarIcono() {
            return "🔥";
        }

        public String mostrarLeyenda(Cancion cancion) {
            return cancion.getTitulo() + "–" + cancion.getArtista() + "(" + cancion.getAlbum() + "–" + cancion.getAnioDelAlbum() + ")";
        }
    }

}
