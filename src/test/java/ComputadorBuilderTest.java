import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComputadorBuilderTest {

    ComputadorBuilderTest (){}

    @Test
    void deveRetornarExcecaoParaComputadorSemMemoriaRam() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                                        .setCapacidadeBateria(3000)
                                        .setModeloPlacaMae("ASUS V1")
                                        .setModeloPlacaDeVideo("RTX 3060")
                                        .setModeloProcessador("Ryzen 3600")
                                        .build();

            Assertions.fail();
        } catch (IllegalArgumentException erro) {
            Assertions.assertEquals("Memória inválida", erro.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaComputadorSemCapacidadeBateria() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setMemoriaRam(8)
                    .setModeloPlacaMae("ASUS V1")
                    .setModeloPlacaDeVideo("RTX 3060")
                    .setModeloProcessador("Ryzen 3600")
                    .build();

            Assertions.fail();
        } catch (IllegalArgumentException erro) {
            Assertions.assertEquals("Bateria inválida", erro.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaComputadorSemPlacaMae() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setMemoriaRam(8)
                    .setCapacidadeBateria(3000)
                    .setModeloPlacaDeVideo("RTX 3060")
                    .setModeloProcessador("Ryzen 3600")
                    .build();

            Assertions.fail();
        } catch (IllegalArgumentException erro) {
            Assertions.assertEquals("Placa-mãe inválida", erro.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaComputadorSemPlacaDeVideo() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setMemoriaRam(8)
                    .setCapacidadeBateria(3000)
                    .setModeloPlacaMae("ASUS V1")
                    .setModeloProcessador("Ryzen 3600")
                    .build();

            Assertions.fail();
        } catch (IllegalArgumentException erro) {
            Assertions.assertEquals("Placa de vídeo inválida", erro.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaComputadorSemProcessador() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setMemoriaRam(8)
                    .setCapacidadeBateria(3000)
                    .setModeloPlacaMae("ASUS V1")
                    .setModeloPlacaDeVideo("RTX 3060")
                    .build();

            Assertions.fail();
        } catch (IllegalArgumentException erro) {
            Assertions.assertEquals("Processador inválido", erro.getMessage());
        }
    }

    @Test
    void deveRetornarComputadorValido() {
        ComputadorBuilder computadorBuilder = new ComputadorBuilder();
        Computador computador = computadorBuilder
                .setMemoriaRam(8)
                .setCapacidadeBateria(3000)
                .setModeloPlacaMae("ASUS V1")
                .setModeloPlacaDeVideo("RTX 3060")
                .setModeloProcessador("Ryzen 3600")
                .build();
        Assertions.assertNotNull(computador);
    }
}