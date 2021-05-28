package OfficeHours.Practice05_17_2021;

public class AnimalSpecies {

    String name = "dog";
    int population = 1;
    int growthRate;

    public void setInfo(String setName, int setPopulation, int setGrowthRate) {
        name = setName;
        population = setPopulation;
        growthRate = setGrowthRate;

    }

    public String getName() {
        if (name == null) {
            name = "No name defined";
        }
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getGrowthRate() {
        return growthRate;
    }

    @Override
    public String toString() {
    return"Animal Species: "+
            "name = '"+name +'\''+
            ", population = "+population +" million"+
            ", growthRate ="+growthRate +"%"+
            '}';
}

}
