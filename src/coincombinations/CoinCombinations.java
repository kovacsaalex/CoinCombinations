
package coincombinations;

public class CoinCombinations {
/* hágy féle kombinációban tutod kifizetni fémpénzekkel az összeget
 * rekurzió használata
 */
  
    public static void main(String[] args) {
        int [] coins = {1,2};  // milyen fémpénzek állnak a rendelkezésünkre 
        int totalAmount = 4;   // hány féleképpen tujuk kifizetni az összeget
        
        System.out.println(calcualteCombo(coins, totalAmount, 0));
        
    }
    
    public static int calcualteCombo (int[] coins, int amount, int currentIndex){
        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        
        int combos = 0;
        
        for (int i = currentIndex; i < coins.length; i++) {
            combos += calcualteCombo(coins, amount - coins[i], i);
        }
        
        return combos;
    }
    
}
