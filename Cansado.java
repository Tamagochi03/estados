import logica.Tamagochi;

/**
 *
 * @author Shinsnake
 */
public class Cansado extends EstadoGeneral implements Estado{
   Tamagochi tamagochi;
    public Cansado(Tamagochi tamagochi){
       this.tamagochi = tamagochi;
   }
    public void dormir(){
       mensajePensamiento.setText("Si! a dormir!");
       //agregar implementacion de cambios sobre el grupo de transformacion.
   }
   public void jugar(){
       mensajePensamiento.setText("No tengo ganas de jugar");
   }
   public void comer(){
       mensajePensamiento.setText("Estoy cansado no hambriento!");
   }
