public class Stadium {

    //This is an example of polymorphism
    public void battle(Pokemon p1, Pokemon p2){
        //normally check speed first

        int p1Health = p1.getHp();
        int p2Health = p2.getHp();

        if(p1.getSpeed() > p2.getSpeed()){
            while(p1Health > 0 && p2Health > 0){
                 p2Health -= (p1.getAttack() - p2.getDefense());
                 p1Health -= (p2.getAttack() - p1.getDefense());
            }
        }else{
            while(p1Health > 0 && p2Health > 0){
                p2Health -= (p1.getAttack() - p2.getDefense());
                p1Health -= (p2.getAttack() - p1.getDefense());
            }
        }

        if(p1Health > 0) {
            System.out.println("P1 won the battle!");
            System.out.println("P2 was knocked out!");
        } else if (p2Health > 0) {
            System.out.println("P2 won the battle!");
            System.out.println("P1 was knocked out!");
        }else{
            System.out.println("P1 and P2 were knocked out!");
        }

    }

}
