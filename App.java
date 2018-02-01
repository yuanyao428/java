public class App {
	public static void main(String[] args) {
		try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatExceptin e) {
            System.err.println("引数指定の誤り：第1引数は整数値を指定します。");
            System.exit(-1);
        }
	}
}
