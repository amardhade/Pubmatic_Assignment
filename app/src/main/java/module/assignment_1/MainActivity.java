package module.assignment_1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;


/**
 * created by amar.d on 3/26/2015
 */
public class MainActivity extends ActionBarActivity {

    static final String mGivenString = "asnmnshtadfgmnstksjdkjhasdjkaasdsadgadfgmnstsdjadaklsjdlka";
    private static final String TAG = "###MainActivity###";
    private char[] charArray;
    private boolean mIsUniqueCharFound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        charArray = mGivenString.toCharArray();

        /**
         * Question:
         * Find the first non-repeated (unique) character in a given(mGivenString) string.
         *
         * Logic:
         * get each char from a string
         * split mGivenString with the char
         * check the length of that split string array
         * if split string array length == 2 or == 1 unique char found
         * else no unique char in a mGivenString
         */

        for (int i = 0; i < charArray.length; i++) {
            char myChar = charArray[i];

            String[] splitArray = mGivenString.split("" + myChar);
            if (splitArray.length == 2 || splitArray.length == 1) {
                Toast.makeText(this, "Unique char: " + myChar, Toast.LENGTH_SHORT).show();
                mIsUniqueCharFound = true;
                break;
            }
        }
        if (!mIsUniqueCharFound)
            Toast.makeText(this, "Unique char not found", Toast.LENGTH_SHORT).show();
    }
}
