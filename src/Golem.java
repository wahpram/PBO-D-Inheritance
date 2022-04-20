public class Golem extends Hero {
    void hpplus(int hp){
        int plus = hp+20;
        System.out.println("Atributte tambahan (hp+20)");
        System.out.println("Hitpoint        : "+plus);
    }
    void specialattack(){
        System.out.println("Special Skill   : High Defensive");
    }
}
