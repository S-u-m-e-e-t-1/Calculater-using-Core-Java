

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

class Main{
    public static void main(String[] args) {
        final String inputExp;
        inputExp = ReadingInput.read();
        Queue<String>operation;
        Queue<String>numbers;
        String[] numberArr =inputExp.split("[-+*/]");
        String[] oprArr=inputExp.split("[0-9]+");
        numbers=new LinkedList<String>(Arrays.asList(numberArr));
        operation=new LinkedList<String>(Arrays.asList(oprArr));
        Double res=Double.parseDouble(numbers.poll());
        while (!numbers.isEmpty()){
            String opr=operation.poll();
            Operate operate;
            switch (opr) {
                case "+" -> operate = new Add();
                case "-" -> operate = new Substract();
                case "*" -> operate = new Multiply();
                case "/" -> operate = new Divide();
                default -> {
                    continue;
                }
            }
            Double num=Double.parseDouble(Objects.requireNonNull(numbers.poll()));
            res=operate.getResult(res,num);
        }
        System.out.println(res);
    }
}