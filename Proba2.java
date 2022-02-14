import java.util.Scanner;
public class Proba2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String a = scanner.nextLine();
        char[] symbol = a.toCharArray();
        String[] chislo = new String[7];
        for (int i = 0; i < 7; i++ ){
            chislo[i] = str(symbol, i);
        }
        for (int i = 0; i < 7; i++){
            System.out.println(chislo[i]);
        }
    }

    static String str(char symbol[], int a){
        String[] one = new String[]{"  1   ", " 11   ", "1 1   ", "  1   ", "  1   ", "  1   "," 111  "};
        String[] two = new String[]{" 222  ", "2   2 ", "   2  ", "  2   ", " 2    ", "2     ", "22222 "};
        String[] three = new String[]{" 333  ", "3   3 ", "   3  ", " 33   ", "   3  ", "3   3 ", " 333  "};
        String[] four = new String[]{"   4  ", "  44  ", " 4 4  ", "4  4  ", "44444 ", "   4  ", "   4  "};
        String[] five = new String[]{"55555 ", "5     ", "555   ", "   5  ", "    5 ", "   5  ", "555   "};
        String[] six = new String[]{" 666  ", "6   6 ", "6     ", "6666  ", "6   6 ", "6   6 ", " 666  "};
        String[] seven = new String[]{"77777 ", "    7 ", "   7  ", "  7   ", " 7    ", "7     ", "7     "};
        String[] eight = new String[]{" 888  ", "8   8 ", "8   8 ", " 888  ", "8   8 ", "8   8 ", " 888  "};
        String[] nine = new String[]{" 9999 ", "9   9 ", "9   9 ", " 9999 ", "    9 ", "    9 ", "    9 "};
        String[] zero = new String[]{" 000  ", "0   0 ", "0   0 ", "0   0 ", "0   0 ", "0   0 ", " 000  "};
        String chislo = "";
        for (int i = 0; i < symbol.length; i++){
            if(symbol[i] == '1'){
                chislo += one[a] ;
            } else if(symbol[i] == '2'){
                chislo += two[a] ;
            } else if(symbol[i] == '3'){
                chislo += three[a];
            } else if(symbol[i] == '4'){
                chislo += four[a];
            } else if(symbol[i] == '5'){
                chislo += five[a];
            } else if(symbol[i] == '6'){
                chislo += six[a];
            } else if(symbol[i] == '7'){
                chislo += seven[a];
            } else if(symbol[i] == '8'){
                chislo += eight[a];
            } else if(symbol[i] == '9'){
                chislo += nine[a];
            } else if(symbol[i] == '0'){
                chislo += zero[a];
            }

        }
        return chislo;
    }

}