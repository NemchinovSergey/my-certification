public class DragAndDropTestClass1 {

    /**
     * Question enthuware.ocajp.i.v8.2.1089
     * @see <a href="https://enthuware.com/forum/viewtopic.php?f=2&t=1530">About Question enthuware.ocajp.i.v7.2.1089</a>
     */
    public static void main(String args[]) {
        Short k = 9; Integer i = 9; Boolean b = false;
        char c = 'a'; String str = "123";

        i *= (int) k.shortValue(); // i = k * i = 81, k = 9

        str += b; // str = str + "false" = "123false"

        b = !b; // b = true

        c *= i; // c = 'a' * i = 97 * 81 = 'ằ' (7857)
    }

}
