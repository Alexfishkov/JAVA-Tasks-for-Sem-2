// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class Task_2_1 {
    static public void main(String[] args) {
        System.out.print("\033[H\033[J");
        System.out.println("Формируем строки sql-запросов по заданным параметрам");

        // Задаём исходную часть строки запроса
        String queryString = "select * from students where ";

        // Задаём данные для фильтрации в виде json строки
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        // Вызываем метод обработки строки с данными для фильтрации, который убирает лишние символы
        str = stringProcessing(str);

        // Проверяем наличие параметра null и если его нет выводим итоговую строку запроса
        String [] parameters = str.split(" ");
        for (int i=0; i<parameters.length;i++){
            if (parameters[i].contains("null")){
                continue;
            }
            else{
               System.out.println(queryString + parameters[i]);
            }
        }
    }

    static public String stringProcessing (String inputString){
        inputString = inputString.replaceAll("\"", "");
        inputString = inputString.replaceAll(",","");
        inputString = inputString.replace("{", "");
        inputString = inputString.replace("}", "");
        return inputString;
    }
}

    