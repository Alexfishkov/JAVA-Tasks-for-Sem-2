import java.io.FileWriter;
import java.io.IOException;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class Task_2_2 {
    static public void main(String[] args) {
        System.out.print("\033[H\033[J");
        System.out.println("Сортируем исходный массив по возрастанию пузырьком и записываем каждую итерацию в файл");
        System.out.println("Результат работы алгоритма смотри в файле FileSort.txt - в этой же папке");
        int[] sourceArray = new int[] { 5, 7, 8, 1, 15, 4, 25, 7, 11, 0 };
        bubbleSort(sourceArray);
    }

    // Сортировка пузырьком и вывод результатов в файл FileSort (см. в этой же
    // папке)

    public static void bubbleSort(int[] sortArr){

            
        try (FileWriter fw = new FileWriter("FileSort.txt",false)) {

        fw.write("Исходный массив выглядит так:");
        fw.append('\n');
        for (int item : sortArr) {
            fw.write(Integer.toString(item));
            fw.write(" ");
        }
        fw.append('\n');
        fw.flush();
        
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
            fw.write("Вид массива после очередной перестановки:");
            fw.append('\n');
            for (int item : sortArr){
                fw.write(Integer.toString(item));
                fw.write(" ");
            } 
            fw.append('\n');
        }
    }
    catch (IOException ex) {
        System.out.println(ex.getMessage());
    }
    
    }
        
}
