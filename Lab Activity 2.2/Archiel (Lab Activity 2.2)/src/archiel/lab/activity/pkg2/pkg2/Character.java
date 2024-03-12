
package archiel.lab.activity.pkg2.pkg2;

public class Character {
    
      
    private int damage, shield, health;
   
    
    public Character (int health, int damage, int shield){
      this.health = health;
      this.damage = damage;
      this.shield = shield;
    }
    
    //Getters lol
    int getHealth(){
        return health;
    }
    int getDamage(){
        return damage;
    }
    int getShield(){
        return shield;
    }
    //Setter lmao
    void setHealth(int hp){
        health = hp;
    } 
    //Method xd
    public void recieveDamage(int damage){
        health -= (damage - shield);
        if (health <= 0){
           System.out.println("Character has died");
       }    
    }
    
 
    
}
