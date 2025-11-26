public class Lasagna {

    private int expectedOvenTimeInMinutes = 40;
    private int layerTimeInMinutes = 2;
    
    public int expectedMinutesInOven(){
        return expectedOvenTimeInMinutes;
    }

    public int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven() - minutesInOven;
    }
    
    public int preparationTimeInMinutes(int layerCount){
        return layerTimeInMinutes * layerCount;
    }

    public int totalTimeInMinutes(int layerCount, int minutesInOven){
        return preparationTimeInMinutes(layerCount) + minutesInOven;
    }
}
