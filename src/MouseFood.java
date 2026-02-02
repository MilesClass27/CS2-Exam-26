public class MouseFood {
    private int servings;
    private int smellFactor;

    public MouseFood(int servings, int smellFactor){
        this.servings=servings;
        this.smellFactor=smellFactor;
    }
    public void setServings(int servings){
        this.servings=servings;
    }
    public void setSmellFactor(int smellFactor){
        this.smellFactor=smellFactor;
    }
    public int getServings(){
        return servings;
    }
    public int getSmellFactor(){
        return smellFactor;
    }
    public void printInfo(){
        System.out.println("Servings: "+servings);
        System.out.println("Smell Factor: "+smellFactor);
    }
}
