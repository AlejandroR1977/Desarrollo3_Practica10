public class LiebreYTortugaCarrera {

static Tortuga donatello = new Tortuga(1);
    static Liebre wonejo = new Liebre(1);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start:");

        boolean fin = false;
        while(!fin){
            int turno1 = (int) Math.floor(Math.random()*(100)+1);
            int turno2 = (int) Math.floor(Math.random()*(100)+1);
            MovimientoLiebre(turno1);
            MovimientoTortuga(turno2);
            int player1 = (int) donatello.get();
            int player2 = (int) wonejo.get();
            boolean Winner1 = (boolean)donatello.getWinner();
            boolean Winner2 = (boolean)wonejo.getWinner();
            
            for(int i = 0; i < player1; i++){
                System.out.print(" ");
            }
            System.out.println("T");
            for(int i = 0; i < player2; i++){
                System.out.print(" ");
            }
            System.out.println("L");
            if(Winner1 && Winner2){
                System.out.println("Empate");
                fin = true;
            }
            else if(Winner1){
                System.out.println("La Liebre no llego a tiempo, la Tortuga ha ganado");
                fin = true;
            }
            else if(Winner2){
                System.out.println("La Liebre ha ganado: -" + "¿En serio creiste que una tortuga podria ganarle a una liebre?");
                fin = true;
            }
        }
    }

    public static void MovimientoLiebre(int valor) throws InterruptedException {
        if(0 < valor && valor < 21){
            wonejo.SeDuerme();
        }
        if(21 < valor && valor < 41){
            wonejo.SaltoGrande();
        }
        if(41 < valor && valor < 51){
            wonejo.CaidaGrande();
        }
        if(51 < valor && valor < 81){
            wonejo.SaltoChico();
        }
        if(valor >= 81){
            wonejo.CaidaChica();
        }
    }
    public static void MovimientoTortuga(int valor) throws InterruptedException{
        if(0 < valor && valor < 51){
            donatello.PasoRapido();
        }
        else if(51 < valor && valor < 71) {
            donatello.Caida();
        }
        else{
            donatello.PasoLento();
        }
    }
}