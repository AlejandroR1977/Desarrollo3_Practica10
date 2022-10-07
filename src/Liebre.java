
public class Liebre {
    
    private boolean winner = false;
    private int posicion;

    public Liebre(int posicion) {
        this.posicion = posicion;
    }

    public synchronized void SaltoGrande() throws InterruptedException {
        Thread.sleep(1000);
        posicion = posicion + 9;
        notifyAll();
    }

    public synchronized void SaltoChico() throws InterruptedException {
        Thread.sleep(1000);
        posicion = posicion + 1;
        notifyAll();
    }

    public synchronized void CaidaGrande() throws InterruptedException {
        Thread.sleep(1000);
        posicion = posicion - 12;
        if (posicion < 1) {
            posicion = 1;
        }
        notifyAll();
    }

    public synchronized void CaidaChica() throws InterruptedException {
        Thread.sleep(1000);
        posicion = posicion - 2;
        if (posicion < 1) {
            posicion = 1;
        }
        notifyAll();
    }

    public synchronized void SeDuerme() throws InterruptedException {
        Thread.sleep(1000);
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
