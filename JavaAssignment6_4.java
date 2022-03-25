package JavaAssignment6;

class ObjectsReferences
{
    ObjectsReferences(String name)
    {
        System.out.println("This is "+ name);
    }
}


public class JavaAssignment6_4 {

    public static void main(String[] args) {

        ObjectsReferences references[] = new ObjectsReferences[3];
        references[0]=new ObjectsReferences("bhavya");
        references[1]=new ObjectsReferences("sri");
        references[2]=new ObjectsReferences("bhavyasri");
        //when executing constructor message was printed
    }



}
