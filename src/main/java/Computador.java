import java.util.Date;

public class Computador {

    private String modeloPlacaMae;
    private String modeloProcessador;
    private String modeloPlacaDeVideo;

    private int memoriaRam;
    private int memoriaHD;
    private int memoriaSSD;

    private String cor;
    private String tamanhoTela;
    private int capacidadeBateria;
    private int quantidadeConexoesUSB;

    public Computador() {
        this.memoriaRam = 0;
        this.capacidadeBateria = 0;
        this.modeloPlacaMae = "";
        this.modeloProcessador = "";
        this.modeloPlacaDeVideo = "";
    }

    public String getModeloPlacaMae() {
        return modeloPlacaMae;
    }

    public Computador setModeloPlacaMae(String modeloPlacaMae) {
        this.modeloPlacaMae = modeloPlacaMae;
        return this;
    }

    public String getModeloProcessador() {
        return modeloProcessador;
    }

    public Computador setModeloProcessador(String modeloProcessador) {
        this.modeloProcessador = modeloProcessador;
        return this;
    }

    public String getModeloPlacaDeVideo() {
        return modeloPlacaDeVideo;
    }

    public Computador setModeloPlacaDeVideo(String modeloPlacaDeVideo) {
        this.modeloPlacaDeVideo = modeloPlacaDeVideo;
        return this;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public Computador setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }

    public int getMemoriaHD() {
        return memoriaHD;
    }

    public Computador setMemoriaHD(int memoriaHD) {
        this.memoriaHD = memoriaHD;
        return this;
    }

    public int getMemoriaSSD() {
        return memoriaSSD;
    }

    public Computador setMemoriaSSD(int memoriaSSD) {
        this.memoriaSSD = memoriaSSD;
        return this;
    }

    public String getCor() {
        return cor;
    }

    public Computador setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public Computador setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
        return this;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public Computador setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
        return this;
    }

    public int getQuantidadeConexoesUSB() {
        return quantidadeConexoesUSB;
    }

    public Computador setQuantidadeConexoesUSB(int quantidadeConexoesUSB) {
        this.quantidadeConexoesUSB = quantidadeConexoesUSB;
        return this;
    }



}
