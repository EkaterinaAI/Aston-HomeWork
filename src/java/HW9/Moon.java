package src.java.HW9;

public class Moon implements Planet {

    private static Moon instance;
    private Moon(){}

    public static Moon getInstance(){
        if(instance == null){		//если объект еще не создан
            instance = new Moon();	//создать новый объект
        }
        return instance;		    // вернуть ранее созданный объект
    }
}
