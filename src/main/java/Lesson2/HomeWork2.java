package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) throws MyArraySizeException {
        String[][] array = {{"1","2","3","s"},
                            {"1","3","4","5"},
                            {"2","3","4","5"},
                            {"5","4","7","8"}};
        try {
            arrayProcessing(array);
        } catch (MyArraySizeException  e) {
            System.out.println(e);
        }
        catch (MyArrayDataException e){
            System.out.println(e);
        }
    }

    private static void arrayProcessing (String [][] array) throws MyArraySizeException, MyArrayDataException {
        int suma = 0;
        if (array.length!=4 || array[0].length != 4) throw new MyArraySizeException("Ошибка размера массива");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    suma += Integer.valueOf(array[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException("Ошибка по адресу: " + (i+1) +" "+ (j+1) + "  - значение: " + array[i][j]);
                }
            }
        }
        System.out.println(suma);
    }
}
