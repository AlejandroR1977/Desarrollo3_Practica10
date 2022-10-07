
public class Tortuga {
    
    private boolean winner = false;
    private int posicion;

    public Tortuga(int posicion) {
        this.posicion = posicion;
    }

    public synchronized void PasoRapido() throws InterruptedException {
        Thread.sleep(1000);
        posicion = posicion + 3;
        notifyAll();
    }

    public synchronized void PasoLento() throws InterruptedException {
        Thread.sleep(1000);
        posicion = posicion + 3;
        notifyAll();
    }

    public synchronized void Caida() throws InterruptedException {
        Thread.sleep(1000);
        posicion = posicion - 6;
        if (posicion < 1) {
            posicion = 1;
        }
        notifyAll();
    }

    public synchronized int get() {
        notifyAll();
        return posicion;
    }

    public synchronized boolean getWinner() {
        if (posicion >= 70) {
            winner = true;
        }
        return winner;
    }
}
