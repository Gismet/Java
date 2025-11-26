public class Lasagna {

    private int expectedOvenTimeInMinutes = 40;
    private int layerTimeInMinutes = 2;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return expectedOvenTimeInMinutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven){
        return expectedOvenTimeInMinutes - minutesInOven;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layerCount){
        return layerTimeInMinutes * layerCount;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layerCount, int minutesInOven){
        return preparationTimeInMinutes(layerCount) + minutesInOven;
    }
}
