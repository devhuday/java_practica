
public class Main {
    public static void main(String[] args) {
        carro micarro = new carro();
        micarro.quitarpuertas();
        micarro.quitarpuertas();
        micarro.quitarpuertas();
        micarro.quitarpuertas();
        System.out.println(micarro.puertas);
    }
}

class carro {
    public int puertas=0;
    public void quitarpuertas() {
        this.puertas++;
    }
}

