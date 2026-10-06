class Movie{
    public String title;
    public int duration;

    // Default construtor - which is always hidden
    public Movie(){
        this.title = null;
        this.duration = 0;
    }

    // Custom Default constructor - used for hard cording mostly 
    public Movie(){
        this.title = "Untitled";
        this.duration = 0;
    }

    // Paramerized constructor 
    public Movie(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    // Copy constructor 
    public Movie(Movie other){
        this.title = other.title;
        this.duration = other.duration;
    }

    public void displayDetials(){
        System.out.println("Title: " + title + ", Duration: " + duration + " mins");
    }
}

public Class Main {
    public static void main(String[] args){
        Movie movie = new Movie();
        Movie movie2 = new Movie('Harry Potter', 145);
        Movie copyMovie = new Movie(movie2);

        movie.displayDetials();
    }
}

class Singleton{
    public static Singleton intance;

    // private contructor 
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null)        
            intance = new Singleton();
        
        return intance;
    }
}

pulic class Main{
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.err.println(s1 == s2);
    }
}