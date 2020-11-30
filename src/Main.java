public class Main {
        public static int count;
        public static void main(String[] args) {
            print("Java is easy to learn!");
            print("Java is object-oriented!");
            print("Java is platform-independent!");
        }
        public static void print(String text) {

            int x = 1;

            while (count < 4){
                while (x <= 4){
                    System.out.println("Java is easy to learn!");
                    x++;
                    count++;
                }
            }
            x = 5;
            while (count < 8){
                while (x <= 8){
                    System.out.println("Java is object-oriented!");
                    x++;
                    count++;
                }
            }
            x = 9;
            while (count < 12){
                while (x <= 12){
                    System.out.println("Java is platform-independent!");
                    x++;
                    count++;
                }
            } //напишите тут ваш код
        }
    }


