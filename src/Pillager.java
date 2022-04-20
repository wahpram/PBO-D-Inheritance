public class Pillager extends Enemy{
    void asplus(int as){
        int plus = as+30;
        System.out.println("Atributte tambahan (as+30)");
        System.out.println("Attackspeed     : "+plus);
    }
    void specialattack(){
        System.out.println("Special Skill   : High attack speed");
    }
}
