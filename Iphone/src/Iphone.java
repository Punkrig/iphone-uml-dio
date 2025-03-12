public class Iphone implements AparelhoTelefonico,ReprodutorMusical, NavegadorInternet {
    // ReprodutorMusical
    @Override
    public void play() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música...");
    }

    @Override
    public void nextTrack() {
        System.out.println("Próxima faixa ▶️");
    }

    @Override
    public void previousTrack() {
        System.out.println("Faixa anterior ◀️");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Ajustando volume...");
    }

    @Override
    public void createPlaylist(String name) {
        System.out.println("Playlist criada: " + name);
    }

    // AparelhoTelefonico
    @Override
    public void makeCall(String name) {
        System.out.println("Chamando: " + name + "...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void endCall() {
        System.out.println("Chamada encerrada.");
    }

    // NavegadorInternet
    @Override
    public void openUrl(String url) {
        System.out.println("Abrindo: " + url);
    }

    @Override
    public void refresh() {
        System.out.println("Atualizando página...");
    }

}
