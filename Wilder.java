
public class Wilder{
    private String firstname;
    private boolean aware;



    public Wilder (String firstname, boolean aware){

        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstName(){

        return this.firstname;
    }

    public boolean getAware (){

        return this.aware;
    }

    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    public void isAware(boolean aware){
        this.aware = aware;
    }

    public  String whoAmI(){

        if (this.getAware()){
            return "Je m'appelle " +this.getFirstName()+" et je suis aware";
        }else{
            return "Je m'appelle " +this.getFirstName()+" et je ne suis pas aware";
        }
    }

    



}




