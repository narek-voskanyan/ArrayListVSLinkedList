package ArrayListVsLinkedListTesting;

public class Students {

    Students(){
        getAge();
        getName();
    }

    private String name;
    private int age;

    public int getAge(){
        int age = 18;
        this.age = age + (int)(Math.random() * 7);
        return this.age;
    }

    public String getName(){
        String name = "";
        String allLetters = "abcdefghijklmnopqrstuvwxyz";
        int nameLength = 3;
        int forLetter = 0;

        nameLength += (int)(Math.random() * 8);

        for(int i = 0; i < nameLength; i++ ){

            forLetter = (int)(Math.random() * allLetters.length());
            name += allLetters.charAt(forLetter);

        }

        this.name = name.substring(0,1).toUpperCase() + name.substring(1);
        return this.name;
    }

    public void setInformation(){
        System.out.println(getName() + " " + getAge() );
    }
}