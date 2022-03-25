class overLoadedConstructors
{
    int x,y;
    overLoadedConstructors()
    {
        this(2,5);
    }

    overLoadedConstructors(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}

public class JavaAssignment6_2 {

    public static void main(String[] args) {

        overLoadedConstructors constructor = new overLoadedConstructors();

        System.out.println("The value of x is : "+constructor.x);
        System.out.println("The value of y is : "+constructor.y);
    }

}
