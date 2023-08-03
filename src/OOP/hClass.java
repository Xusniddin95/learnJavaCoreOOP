package OOP;

public class hClass {
    public void yuza(double a, double b, double c){

        if (a+b > c && b+c > a && a+c > b){
            double y_p = (a+b+c)/2;
            double s = Math.sqrt(y_p*(y_p-a)*(y_p-b)*(y_p-c));
            System.out.println("Uchburchakning yuzi:  s= "+s);
        }else {
            System.out.println("xato");
        }
    }
}
