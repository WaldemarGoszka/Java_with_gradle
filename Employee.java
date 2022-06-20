public class Employee {
    private int id;
    private String name;

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee other = (Employee) obj;
        return this.id == other.id;
    }
}
