public class Human{
    String name; 
    int age;
    int Id; 
    String number;

    public Human(String name, int age, int Id, String number) {
        this.name = name;
        this.age = age;
        this.Id = Id;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public int  getAge() {
        return this.age;
    }

    public int getId() {
        return this.Id;
    }

    public String getNumber(){
    return  this.number;
    }
    


}