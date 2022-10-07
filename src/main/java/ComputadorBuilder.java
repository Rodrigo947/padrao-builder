
public class ComputadorBuilder {

    private Computador computador;

    public ComputadorBuilder() {
        computador = new Computador();
    }

    public Computador build() {
        if (computador.getMemoriaRam() <= 0) {
            throw new IllegalArgumentException("Memória inválida");
        }

        if (computador.getCapacidadeBateria() <= 0) {
            throw new IllegalArgumentException("Bateria inválida");
        }

        if (computador.getModeloPlacaMae().equals("") ) {
            throw new IllegalArgumentException("Placa-mãe inválida");
        }

        if (computador.getModeloPlacaDeVideo().equals("")) {
            throw new IllegalArgumentException("Placa de vídeo inválida");
        }

        if (computador.getModeloProcessador().equals("")) {
            throw new IllegalArgumentException("Processador inválido");
        }

        return computador;
    }

    public ComputadorBuilder setModeloPlacaMae(String modeloPlacaMae) {
        computador.setModeloPlacaMae(modeloPlacaMae);
        return this;
    }

    public ComputadorBuilder setModeloProcessador(String modeloProcessador) {
        computador.setModeloProcessador(modeloProcessador);
        return this;
    }

    public ComputadorBuilder setModeloPlacaDeVideo(String modeloPlacaDeVideo) {
        computador.setModeloPlacaDeVideo(modeloPlacaDeVideo);
        return this;
    }

    public ComputadorBuilder setMemoriaRam(int memoriaRam) {
        computador.setMemoriaRam(memoriaRam);
        return this;
    }

    public ComputadorBuilder setMemoriaHD(int memoriaHD) {
        computador.setMemoriaHD(memoriaHD);
        return this;
    }

    public ComputadorBuilder setMemoriaSSD(int memoriaSSD) {
        computador.setMemoriaSSD(memoriaSSD);
        return this;
    }

    public ComputadorBuilder setCor(String cor) {
        computador.setCor(cor);
        return this;
    }

    public ComputadorBuilder setTamanhoTela(String tamanhoTela) {
        computador.setTamanhoTela(tamanhoTela);
        return this;
    }

    public ComputadorBuilder setCapacidadeBateria(int capacidadeBateria) {
        computador.setCapacidadeBateria(capacidadeBateria);
        return this;
    }

    public ComputadorBuilder setQuantidadeConexoesUSB(int quantidadeConexoesUSB) {
        computador.setQuantidadeConexoesUSB(quantidadeConexoesUSB);
        return this;
    }

}
