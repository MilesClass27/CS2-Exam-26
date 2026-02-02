public class House {
    public MouseFood[] mousePantry;
    public String message = "A7#q 9mA$%2mn!!8my@4mt^6mh&1mi*3mn(0mgZ9m 4wfymt@7mh# 5ma$2mt!8m mmma%3mk^4me&6ms*1m Q12mm &2-me#7m mc$9mu!5mt@8m 6hM.mt^4mh&6me *3m R7mc@2mh#9me$5me!832ms^4me&6m.";

    public static void main(String[] args) {
        House app = new House();
    }
    public House (){
        System.out.println("Hello, mouse! Get out of my house!");
        mousePantry=new MouseFood[18];
        for (int x=0;x<mousePantry.length;x++){
            mousePantry[x]=new MouseFood((int)((Math.random()*200)+1),(int)((Math.random()*491))+10);
        }
        displayMousePantry();
        System.out.println();
        System.out.println("It is "+checkServings()+" that there are two servings equal in the mousepantry.");        System.out.println();
        System.out.println("Decoded message: "+decipher("A7#q 9mA$%2mn!!8my@4mt^6mh&1mi*3mn(0mgZ9m 4wfymt@7mh# 5ma$2mt!8m mmma%3mk^4me&6ms*1m Q12mm &2-me#7m mc$9mu!5mt@8m 6hM.mt^4mh&6me *3m R7mc@2mh#9me$5me!832ms^4me&6m."));
        makeSmells();
        System.out.println("\n"+"Making the smells!");
        displayMousePantry();
    }
    public void displayMousePantry(){
        for(int x=0;x< mousePantry.length;x++){
            System.out.println("\n"+"Mousefood #: "+(x+1));
            mousePantry[x].printInfo();
        }
    }
    public boolean checkServings(){
        boolean checkthis = false;
        for (int x=0;x< mousePantry.length;x++){
            for (int y=0;y< mousePantry.length;y++){
                if (mousePantry[x].getServings()==mousePantry[y].getServings() && x!=y){
                    checkthis=true;
                }
            }
        }
        return checkthis;
    }
    public String decipher(String words){
        String decoded="";
        int lang = words.indexOf("m");
        while (lang<words.length() && lang!=-1){
            String part=words.substring(lang+1,lang+2);
            decoded+=part;
            if (words.substring(lang+1,lang+2)=="m"){
                lang=words.indexOf("m",lang+1);
            }
            else{
                lang=words.indexOf("m",lang+2);
            }
        }
        return decoded;
    }
    public void makeSmells(){
        int tryagain = 0;
        int numberholder=0;
        while (tryagain==0){
            for (int x=0;x<mousePantry.length;x++){
                mousePantry[x].setSmellFactor((int)((Math.random()*491))+10);
            }
            for (int x=0;x< mousePantry.length;x++){
                for (int y=0;y< mousePantry.length;y++){
                    if (mousePantry[x].getSmellFactor()==mousePantry[y].getSmellFactor() && x!=y){
                        numberholder+=1;
                    }
                }
            }
            if (numberholder==0){
                tryagain=1;
            }
            numberholder=0;
        }
    }
}
