
class Human {
    private String name;
    private int age;


    public Human(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        String text ="";
        text+= "My name is "+this.getName()+" and me "+this.getAge()+" ears";
        return text;
    }
}
