public class calculator {
    public static void main(String[] args)
    {
        calculator calculator = new calculator();
        int addition =calculator.add(10,20);
        System.out.println("sum of twonumbe is:" + addition);
    }
public int add(int number1,int number2){
        return number1 + number2;
    }

}
