package at.campus02.simic;

public class Animal
{
    String name;
    int age;
    String species;
    String animalLoud;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String giveAnimalLoud(String animalLoud){
        switch(this.animalLoud) {
            case "Roarr":
                return "Roarr";
            case "Wuff":
                return "Wuff";
            case "Miau":
                return "Miau";
            default:
                return "it seems to be shy";
        }
    }

    public String getNameAndAge(){
        return "Alter: " + age + "; Name: " + name;
    }
    public String ageCategory(){
        if(age <= 2){
            return "baby animal";
        }
        else if(age > 2 && age <=4){
            return "young animal";
        }
        else if(age >4){
            return "old animal";
        }
        return null;
    }
}
