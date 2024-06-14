package src.java.HW9;

public class Earth implements Planet {

    private static Earth instance;
    private Earth(){}

    public static Earth getInstance(){
        if(instance == null){		//если объект еще не создан
            instance = new Earth();	//создать новый объект
        }
        return instance;		    // вернуть ранее созданный объект
    }
}
