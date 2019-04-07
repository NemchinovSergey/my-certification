/**
 * Question enthuware.ocajp.i.v8.2.1089
 * @see <a href="https://enthuware.com/forum/viewtopic.php?f=2&t=1530">About Question enthuware.ocajp.i.v7.2.1089</a>
 */
public class Enthuware_ocajp_i_v8_2_1089 {

    public static void main(String args[]) {
        Short k = 9; Integer i = 9; Boolean b = false;
        char c = 'a'; String str = "123";

        i *= (int) k.shortValue(); // i = k * i = 81, k = 9
        // translated to: i = i.intValue() * k.shortValue();

        str += b; // str = str + "false" = "123false"
        // translated to: (new StringBuilder()).append(str).append(b).toString();

        b = !b; // b = true
        // translated to: b = !b.booleanValue();

        c *= i; // c = 'a' * i = 97 * 81 = 'ằ' (7857)
        // translated to: char c = (char)(c * i.intValue());
    }

}
